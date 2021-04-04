package com.tenetmind.client;

import com.google.common.util.concurrent.Uninterruptibles;
import com.tenetmind.models.BalanceCheckRequest;
import com.tenetmind.models.BalanceResponse;
import com.tenetmind.models.BankServiceGrpc;
import com.tenetmind.models.WithdrawRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
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
        final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        blockingStub = newBlockingStub(channel);
        nonBlockingStub = newStub(channel);
    }

    @Test
    public void balanceTest() {
        //given
        final BalanceCheckRequest request = BalanceCheckRequest.newBuilder()
                .setAccountNumber(7)
                .build();

        //when
        final BalanceResponse response = blockingStub.getBalance(request);
        int balance = response.getBalance();

        //then
        assertEquals(70, response.getBalance());
        System.out.println("Received: " + response.getBalance());
    }

    @Test
    public void withdrawTest() {
        //given & when
        final WithdrawRequest request = WithdrawRequest.newBuilder()
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
        final WithdrawRequest request = WithdrawRequest.newBuilder()
                .setAccountNumber(10)
                .setAmount(50)
                .build();

        //when
        nonBlockingStub.withdraw(request, new MoneyStreamingResponse(latch));

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);

        final BalanceResponse balanceResponse = blockingStub.getBalance(
                BalanceCheckRequest.newBuilder()
                        .setAccountNumber(10)
                        .build());

        //then
        assertEquals(50, balanceResponse.getBalance());
    }

}
