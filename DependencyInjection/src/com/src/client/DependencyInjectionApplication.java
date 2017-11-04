package com.src.client;

import com.src.service.MessageService;

/**
 * This class is similar to the one in com.src.applicaction Application.java, the difference comes as follows
 * This application class is just using the service. It does not initialize the service that leads to better
 * “separation of concerns“. Also use of service interface allows us to easily test the application by mocking
 * the MessageService and bind the services at runtime rather than compile time.
 * 
 * @author victorcruz
 */
public class DependencyInjectionApplication implements Client {
    private MessageService mMessageService;

    public DependencyInjectionApplication(MessageService messageService) {
        this.mMessageService = messageService;
    }

    @Override
    public void processMessages(String destinatary, String message) {
        this.mMessageService.sendMessage(destinatary, message);
    }

}
