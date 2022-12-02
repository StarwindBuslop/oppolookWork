package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Contact;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ContactService {
    public Contact saveContact(Contact c);

    public List<Contact> getAllContacts();
    public String deleteContact(Contact c);
    Contact getContact(Integer c);
}
