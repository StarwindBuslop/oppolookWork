package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Client;
import com.testAssigment.demoX.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientService {
    public Client saveClient(Client c);

    public List<Client> getAllClients();
    public String deleteClient(Client c);
    public Client getClient(Integer c);
}
