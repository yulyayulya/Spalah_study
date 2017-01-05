package BankSystem;

import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class bank {

    private ArrayList<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }

    public List<Client> getAllClients() {
        return Collections.unmodifiableList(clients);
    }

    public String getClientinfo (String name){
        for (Client client : clients) {
           if (client.getName().equals(name)) {
               return client.toString();
           }
        }
        return "client not found";

    }


}
