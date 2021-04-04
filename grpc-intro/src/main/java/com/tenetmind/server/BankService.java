package com.tenetmind.server;

import com.tenetmind.models.BalanceCheckRequest;
import com.tenetmind.models.BalanceResponse;
import com.tenetmind.models.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<BalanceResponse> responseObserver) {
        final int accountNumber = request.getAccountNumber();

        final BalanceResponse response = BalanceResponse.newBuilder()
                .setBalance(AccountDatabase.getBalance(accountNumber))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
