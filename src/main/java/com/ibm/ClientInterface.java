package com.ibm;

public interface ClientInterface {
    void saveClientDetails(Client client);
    Client searchClientDetails(String clientId);
}
