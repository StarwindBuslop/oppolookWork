package com.testAssigment.demoX.controller;

import com.testAssigment.demoX.model.Client;
import com.testAssigment.demoX.model.Contact;
import com.testAssigment.demoX.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientServiceImpl clientService;
    @PostMapping("/addClient")
    public String addContact(@RequestBody Client client){
        clientService.saveClient(client);
        return "new contact is added";
    }
    @GetMapping("/clients")
    public List<Client> getAll()
    {
        return clientService.getAllClients();
    }
    @DeleteMapping("/")
    public String removeContact(Client c){
        clientService.deleteClient(c);
        return "Deleted client";
    }
}
