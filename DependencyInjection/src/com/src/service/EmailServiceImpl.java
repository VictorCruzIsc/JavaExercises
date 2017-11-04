package com.src.service;

public class EmailServiceImpl implements MessageService {

    @Override
    public void sendMessage(String destinatary, String message) {
        System.out.printf("Email sent to: %s, with message: %s\n", destinatary, message);
    }

}
