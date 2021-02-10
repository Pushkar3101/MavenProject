package com.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of clients");
        Integer noOfClients = Integer.parseInt(reader.readLine());
        ClientDAO clientDAO = new ClientDAO();
        for(int i =0;i<noOfClients;i++){
            Client client = new Client();
            System.out.println("enter the details of client"+(i+1));
            System.out.println("enter client id");
            String clientId = reader.readLine();
            System.out.println("enter client name");
            String clientName = reader.readLine();
            System.out.println("enter email");
            String email = reader.readLine();
            System.out.println("enter passport");
            String passportNumber = reader.readLine();

            client.setClientId(clientId);
            client.setClientName(clientName);
            client.setEmail(email);
            client.setPassportNumber(passportNumber);
            clientDAO.saveClientDetails(client);

        }
        System.out.println(clientDAO.getClientDetail());

        System.out.println("enter the id of client name to be searched");
        String id = reader.readLine();

        Client client = clientDAO.searchClientDetails(id);
        System.out.println(client.getClientName()+"--"+client.getEmail()+"--"+client.getPassportNumber());


    }
}
