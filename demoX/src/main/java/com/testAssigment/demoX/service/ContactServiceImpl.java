package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Contact;
import com.testAssigment.demoX.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContactServiceImpl implements  ContactService{
    @Autowired
    private ContactRepository contactRepository;
    @Override
    public Contact saveContact(Contact c) {

        return contactRepository.save(c);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public String deleteContact(Contact c) {
        contactRepository.delete(c);
        return "Borrado contacto";
    }
}
