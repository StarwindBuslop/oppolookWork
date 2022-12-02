package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Contact;

import java.util.List;

public interface ContactService {
    public Contact saveContact(Contact c);

    public List<Contact> getAllContacts();
    public String deleteContact(Contact c);
}
