package com.tenetmind.client;

import com.tenetmind.models.BalanceCheckRequest;
import com.tenetmind.models.BalanceResponse;
import com.tenetmind.models.BankServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static com.tenetmind.models.BankServiceGrpc.newBlockingStub;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankClientTest {

    private BankServiceGrpc.BankServiceBlockingStub blockingStub;

    @BeforeEach
    public void setup() {
        final ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        blockingStub = newBlockingStub(channel);
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

}
