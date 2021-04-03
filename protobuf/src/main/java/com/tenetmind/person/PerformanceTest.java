package com.tenetmind.person;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Int32Value;
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
                System.out.println("JSON bytes: " + bytes.length);
                JsonPerson jsonPerson1 = mapper.readValue(bytes, JsonPerson.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };

        //protobuf
        Person protoPerson = Person.newBuilder()
                .setName("Sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();

        Runnable runnableProto = () -> {
            try {
                byte[] bytes = protoPerson.toByteArray();
                System.out.println("Protobuf bytes: " + bytes.length);
                Person protoPerson1 = Person.parseFrom(bytes);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        };

        //test
        runPerformanceTest(runnableJson, "JSON");
        runPerformanceTest(runnableProto, "Protobuf");
    }

    private static void runPerformanceTest(Runnable runnable, String runnableType) {
        long startTime = System.currentTimeMillis();

        runnable.run();

        long endTime = System.currentTimeMillis();

        System.out.println(runnableType + " time: " + (endTime - startTime) + " ms");
    }

}
