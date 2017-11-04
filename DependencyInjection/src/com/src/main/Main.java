package com.src.main;

import com.src.client.Client;
import com.src.injector.EmailInjectorImpl;
import com.src.injector.MessageServiceInjector;
import com.src.injector.SMSInjectorImpl;

public class Main {
    public static void main(String[] args) {
        String msg = "Hi from Dependency Injection Example";
        String email = "victor.cruz.isc@gmail.com";
        String phone = "5539969983";
        MessageServiceInjector injector = null;
        Client app = null;

        // Send email
        injector = new EmailInjectorImpl();
        app = injector.getClient();
        app.processMessages(email, msg);

        // Send SMS
        injector = new SMSInjectorImpl();
        app = injector.getClient();
        app.processMessages(phone, msg);
    }
}
