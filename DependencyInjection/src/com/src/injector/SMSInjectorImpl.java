package com.src.injector;

import com.src.client.Client;
import com.src.client.DependencyInjectionApplication;
import com.src.service.SMSServiceImpl;

public class SMSInjectorImpl implements MessageServiceInjector {
    @Override
    public Client getClient() {
        return new DependencyInjectionApplication(new SMSServiceImpl());
    }

}
