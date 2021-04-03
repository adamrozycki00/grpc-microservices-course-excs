package com.tenetmind.other;

import com.tenetmind.models.Credentials;
import com.tenetmind.models.EmailCredentials;
import com.tenetmind.models.PhoneOTP;

public class OneOfDemo {

    public static void main(String[] args) {
        EmailCredentials emailCredentials = EmailCredentials.newBuilder()
                .setEmail("nobody@gmail.com")
                .setPassword("admin123")
                .build();

        PhoneOTP phoneOTP = PhoneOTP.newBuilder()
                .setNumber(1231231234)
                .setCode(456)
                .build();

        Credentials credentials = Credentials.newBuilder()
                .setEmailMode(emailCredentials)
                .setPhoneMode(phoneOTP)
                .build();

        login(credentials);
    }

    private static void login(Credentials credentials) {
        switch (credentials.getModeCase()) {
            case EMAILMODE:
                System.out.println(">>>>> email mode <<<<<\n" + credentials.getEmailMode());
                break;
            case PHONEMODE:
                System.out.println(">>>>> phone mode <<<<<\n" + credentials.getPhoneMode());
                break;
        }
    }

}

