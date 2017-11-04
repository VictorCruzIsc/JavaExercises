package com.src.service;

public class SMSServiceImpl implements MessageService {

    @Override
    public void sendMessage(String destinatary, String message) {
        System.out.printf("SMS sent to: %s, with message: %s\n", destinatary, message);
    }

}
