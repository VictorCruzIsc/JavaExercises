package com.src.service;

public class EmailService {
    public void sendEmail(String destinatary, String message) {
        System.out.printf("Email sent to: %s, with message: %s", destinatary, message);
    }
}
