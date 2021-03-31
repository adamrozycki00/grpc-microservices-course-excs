package com.tenetmind.person.other;

import com.tenetmind.person.Car;
import com.tenetmind.person.Dealer;
import com.tenetmind.person.BodyStyle;

public class MapDemo {

    public static void main(String[] args) {

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2016)
                .setBodyStyle(BodyStyle.SEDAN)
                .build();

        Dealer dealer = Dealer.newBuilder()
                .putModel(2016, civic)
                .putModel(2020, accord)
                .build();

        System.out.println(dealer.getModelMap());

        System.out.println(dealer.getModelOrDefault(2004, civic).getBodyStyle());

        try {
            System.out.println(dealer.getModelOrThrow(2004));
        } catch (Exception e) {
            System.out.println("Throws an IllegalArgumentException");
        }
    }

}
