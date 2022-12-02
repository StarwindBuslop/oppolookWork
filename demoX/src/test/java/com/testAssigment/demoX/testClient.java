package com.testAssigment.demoX;


import com.testAssigment.demoX.controller.ClientController;
import com.testAssigment.demoX.model.Client;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class testClient {
    @Test
    void testCreateClient(){
        assertEquals(null,"contact added");
    }
    @Test
    void testDeleteClient(){
        ClientController clientController = new ClientController();
        Client client = clientController.getClient(2);
        clientController.removeClient(client);
        assertEquals(clientController.getClient(2),null);
    }
    @Test
    void testListClients(){
        ClientController clientController = new ClientController();
        List<Client> lists = clientController.getAllClients();
        assertEquals(lists,null);
    }
    @Test
    void testListClient(){
        ClientController clientController = new ClientController();
        Integer c = 3;
        Client client = clientController.getClient(c);
        assertEquals(client,null);
    }

}
