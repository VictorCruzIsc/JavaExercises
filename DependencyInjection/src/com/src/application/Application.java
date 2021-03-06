package com.src.application;

import com.src.service.EmailService;

public class Application {
    /**
     * Basic Errors
     * 
     * MyApplication class is responsible to initialize the email service and then use it. This leads to
     * hard-coded dependency. If we want to switch to some other advanced email service in future, it will
     * require code changes in MyApplication class. This makes our application hard to extend and if email
     * service is used in multiple classes then that would be even more harder.
     * 
     * If we want to extend our application to provide additional messaging feature, such as SMS or Facebook
     * message then we would need to write another application for that. This will involve code changes in
     * application classes and in client classes too.
     * 
     * Testing the application will be very difficult since our application is directly creating the email
     * service instance. There is no way we can mock these objects in our test classes.
     *
     * To solve previous problems we could ask in this class to receive the EmailService as a constructor
     * parameter, leading the user to build the EmailService, which is not a good design practice.
     */
    private EmailService mEmailService = new EmailService();

    public void processMessages(String destinatary, String message) {
        mEmailService.sendEmail(destinatary, message);
    }
}
