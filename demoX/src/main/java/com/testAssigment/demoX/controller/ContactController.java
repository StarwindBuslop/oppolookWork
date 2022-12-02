package com.testAssigment.demoX.controller;

import com.testAssigment.demoX.model.Contact;
import com.testAssigment.demoX.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;

    @PostMapping("/addContact")
    public String add(@RequestBody Contact contact){
        contactService.saveContact(contact);
        return "new contact is added";
    }
    @GetMapping("contacts")
    public List<Contact> getAll(){
        return contactService.getAllContacts();
    }
    @DeleteMapping("/")
    public String removeContact(Contact c){
        contactService.deleteContact(c);
        return "Deleted contact";
    }

}
