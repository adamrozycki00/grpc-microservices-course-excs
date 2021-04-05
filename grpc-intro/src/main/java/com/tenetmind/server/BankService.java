package com.tenetmind.server;

import com.tenetmind.models.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void getBalance(BalanceCheckRequest request, StreamObserver<BalanceResponse> responseObserver) {
        int accountNumber = request.getAccountNumber();

        BalanceResponse response = BalanceResponse.newBuilder()
                .setBalance(AccountDatabase.getBalance(accountNumber))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void withdraw(WithdrawRequest request, StreamObserver<MoneyResponse> responseObserver) {
        int accountNumber = request.getAccountNumber();
        int amount = request.getAmount();
        int balance = AccountDatabase.getBalance(accountNumber);

        if (balance < amount) {
            Status status = Status.FAILED_PRECONDITION
                    .withDescription("Not enough money. You have only " + balance);
            responseObserver.onError(status.asRuntimeException());
            return;
        }

        for (int i = 0; i < (amount / 10); i++) {
            MoneyResponse moneyResponse = MoneyResponse.newBuilder()
                    .setAmount(10)
                    .build();

            AccountDatabase.deductBalance(accountNumber, 10);
            responseObserver.onNext(moneyResponse);
        }

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<DepositRequest> cashDeposit(StreamObserver<BalanceResponse> responseObserver) {
        return new StreamObserver<>() {
            int accountBalance;

            @Override
            public void onNext(DepositRequest depositRequest) {
                int accountNumber = depositRequest.getAccountNumber();
                int amount = depositRequest.getAmount();
                accountBalance = AccountDatabase.addBalance(accountNumber, amount);
            }

            @Override
            public void onError(Throwable throwable) {
            }

            @Override
            public void onCompleted() {
                BalanceResponse balanceResponse = BalanceResponse.newBuilder()
                        .setBalance(accountBalance)
                        .build();
                responseObserver.onNext(balanceResponse);
                responseObserver.onCompleted();
            }
        };
    }
}
