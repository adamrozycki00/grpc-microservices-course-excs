package com.tenetmind.client;

import com.tenetmind.models.MoneyResponse;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;

public class MoneyStreamingResponse implements StreamObserver<MoneyResponse> {

    private CountDownLatch latch;

    public MoneyStreamingResponse(CountDownLatch latch) {
        this.latch = latch;
    }

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

}
