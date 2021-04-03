package com.tenetmind.person.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.tenetmind.models.Person;

public class PerformanceTest {

    public static void main(String[] args) {

        //json
        JsonPerson jsonPerson = new JsonPerson();
        jsonPerson.setName("Sam");
        jsonPerson.setAge(10);

        Runnable runnableJson = () -> {
            ObjectMapper mapper = new ObjectMapper();

            try {
                byte[] bytes = mapper.writeValueAsBytes(jsonPerson);
                JsonPerson jsonPerson1 = mapper.readValue(bytes, JsonPerson.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        //protobuf
        Person protoPerson = Person.newBuilder()
                .setName("Sam")
                .setAge(10)
                .build();

        Runnable runnableProto = () -> {
            try {
                byte[] bytes = protoPerson.toByteArray();
                Person protoPerson1 = Person.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        };

        //test
        for (int i = 0; i < 5; i++) {
            runPerformanceTest(runnableJson, "JSON");
            runPerformanceTest(runnableProto, "Protobuf");
        }
    }

    private static void runPerformanceTest(Runnable runnable, String runnableType) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 5_000_000; i++) {
            runnable.run();
        }

        long endTime = System.currentTimeMillis();

        System.out.println(runnableType + ": " + (endTime - startTime) / 1000d + " s");
    }

}
