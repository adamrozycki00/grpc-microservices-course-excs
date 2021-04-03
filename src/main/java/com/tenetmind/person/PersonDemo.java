package com.tenetmind.person;

import com.tenetmind.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo {

    public static void main(String[] args) throws IOException {
        Person sam = Person.newBuilder()
                .setName("Sam")
                .setAge(10)
                .build();

        Path samFile = Paths.get("sam.serial");
        Files.write(samFile, sam.toByteArray());

        Person retrievedSam = Person.parseFrom(Files.readAllBytes(samFile));

        System.out.println(retrievedSam);
    }

}
