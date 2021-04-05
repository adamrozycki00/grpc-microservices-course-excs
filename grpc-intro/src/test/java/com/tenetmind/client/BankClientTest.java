package com.tenetmind.client;

import com.google.common.util.concurrent.Uninterruptibles;
import com.tenetmind.models.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static com.tenetmind.models.BankServiceGrpc.newBlockingStub;
import static com.tenetmind.models.BankServiceGrpc.newStub;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {

    private BankServiceGrpc.BankServiceBlockingStub blockingStub;
    private BankServiceGrpc.BankServiceStub nonBlockingStub;

    @BeforeEach
    public void setup() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        blockingStub = newBlockingStub(channel);
        nonBlockingStub = newStub(channel);
    }

    @Test
    public void balanceTest() {
        //given
        BalanceCheckRequest request = BalanceCheckRequest.newBuilder()
                .setAccountNumber(7)
                .build();

        //when
        BalanceResponse response = blockingStub.getBalance(request);
        int balance = response.getBalance();

        //then
        assertEquals(70, response.getBalance());
        System.out.println("Received: " + response.getBalance());
    }

    @Test
    public void withdrawTest() {
        //given & when
        WithdrawRequest request = WithdrawRequest.newBuilder()
                .setAccountNumber(7)
                .setAmount(80)
                .build();

        //then
        assertThrows(StatusRuntimeException.class, () ->

                blockingStub.withdraw(request)
                        .forEachRemaining(response ->
                                System.out.println("Received: " + response.getAmount()))
        );
    }

    @Test
    public void withdrawAsyncTest() {
        //given
        CountDownLatch latch = new CountDownLatch(1);
        WithdrawRequest request = WithdrawRequest.newBuilder()
                .setAccountNumber(10)
                .setAmount(50)
                .build();

        //when
        nonBlockingStub.withdraw(request, new StreamObserver<>() {
            @Override
            public void onNext(MoneyResponse moneyResponse) {
                System.out.println("Received async: " + moneyResponse.getAmount());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println(throwable.getMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done");
                latch.countDown();
            }
        });

        //then
        BalanceResponse balanceResponse = getBalanceResponse(10);
        assertEquals(50, balanceResponse.getBalance());
    }

    @Test
    public void cashStreamingRequestTest() throws InterruptedException {
        //given
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<DepositRequest> requestObserver =
                nonBlockingStub.cashDeposit(new StreamObserver<>() {
                    @Override
                    public void onNext(BalanceResponse balanceResponse) {
                        System.out.println("Final balance: " + balanceResponse.getBalance());
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        latch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Server is done");
                        latch.countDown();
                    }
                });

        //when
        for (int i = 0; i < 10; i++) {
            DepositRequest depositRequest = DepositRequest.newBuilder()
                    .setAccountNumber(8)
                    .setAmount(10)
                    .build();
            requestObserver.onNext(depositRequest);
        }
        requestObserver.onCompleted();
        latch.await();

        //then
        BalanceResponse balanceResponse = getBalanceResponse(8);
        assertEquals(180, balanceResponse.getBalance());
    }

    private BalanceResponse getBalanceResponse(int accountNumber) {
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        return blockingStub.getBalance(
                BalanceCheckRequest.newBuilder()
                        .setAccountNumber(accountNumber)
                        .build());
    }

}
