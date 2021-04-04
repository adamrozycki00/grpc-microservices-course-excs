package com.tenetmind.server;

import com.tenetmind.models.*;
import io.grpc.Status;
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

    @Override
    public void withdraw(WithdrawRequest request, StreamObserver<MoneyResponse> responseObserver) {
        final int accountNumber = request.getAccountNumber();
        final int amount = request.getAmount();
        final int balance = AccountDatabase.getBalance(accountNumber);

        if (balance < amount) {
            final Status status = Status.FAILED_PRECONDITION
                    .withDescription("Not enough money. You have only " + balance);
            responseObserver.onError(status.asRuntimeException());
            return;
        }

        for (int i = 0; i < (amount / 10); i++) {
            final MoneyResponse moneyResponse = MoneyResponse.newBuilder()
                    .setAmount(10)
                    .build();

            AccountDatabase.deductBalance(accountNumber, 10);
            responseObserver.onNext(moneyResponse);
        }

        responseObserver.onCompleted();
    }

}
