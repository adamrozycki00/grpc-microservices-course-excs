package com.tenetmind.person;

import com.google.protobuf.Int32Value;
import com.tenetmind.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) throws IOException {

        Person sam = Person.newBuilder()
                .setName("Sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();

        Path samFile = Paths.get("protobuf/src/main/resources/sam.serial");
        Files.write(samFile, sam.toByteArray());

        Person retrievedSam = Person.parseFrom(Files.readAllBytes(samFile));

        System.out.println(retrievedSam);
    }

}
