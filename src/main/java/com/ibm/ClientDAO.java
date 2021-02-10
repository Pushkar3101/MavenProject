package com.ibm;

import java.util.TreeMap;

public class ClientDAO implements ClientInterface {
    TreeMap<String,Client> clientDetail = new TreeMap<String, Client>();


    public void saveClientDetails(Client client) {
        clientDetail.put(client.getClientId(),client);

    }

    public Client searchClientDetails(String clientId) {
        if(clientDetail.containsKey(clientId)){
            return clientDetail.get(clientId);
        }

        return null;
    }

    public TreeMap<String, Client> getClientDetail() {
        return clientDetail;
    }
}
