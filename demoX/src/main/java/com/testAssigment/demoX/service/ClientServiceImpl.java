package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Client;
import com.testAssigment.demoX.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client saveClient(Client c) {
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }

    @Override
    public String deleteClient(Client c) {
        return null;
    }
}
