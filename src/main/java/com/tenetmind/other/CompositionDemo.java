package com.tenetmind.other;

import com.google.protobuf.Int32Value;
import com.tenetmind.models.*;

import java.util.List;

public class CompositionDemo {

    public static void main(String[] args) {
        Address address = Address.newBuilder()
                .setPostBox(123)
                .setStreet("Main Street")
                .setCity("Atlanta")
                .build();

        Car accord = Car.newBuilder()
                .setMake("Honda")
                .setModel("Accord")
                .setYear(2020)
                .build();

        Car civic = Car.newBuilder()
                .setMake("Honda")
                .setModel("Civic")
                .setYear(2016)
                .build();

        Car volvo = Car.newBuilder()
                .setMake("Volvo")
                .setModel("XC60")
                .setYear(2021)
                .build();

        Person sam = Person.newBuilder()
                .setName("Sam")
                .setAge(Int32Value.newBuilder().setValue(25).build())
                .addCar(volvo)
                .addAllCar(List.of(accord, civic))
                .setAddress(address)
                .build();

        System.out.println(sam);
    }

}
