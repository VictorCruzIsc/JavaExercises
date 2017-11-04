package com.src.injector;

import com.src.client.Client;

/**
 * Is the basic injector, and creates the client for later use of it according with the Service the Client
 * receives.
 * 
 * @author victorcruz
 *
 */
public interface MessageServiceInjector {
    public Client getClient();
}
