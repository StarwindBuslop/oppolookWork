package com.testAssigment.demoX;

import com.testAssigment.demoX.controller.ContactController;
import com.testAssigment.demoX.model.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class testOpportunity {
    @Test
    void testCreateContact(){

        ContactController contactController = new ContactController();
        String s =contactController.addContact(new Contact());
        assertEquals(s,"contact added");
    }
    @Test
    void testDeleteContact(){

        ContactController contactController = new ContactController();
        String s =contactController.addContact(new Contact());
        assertEquals("contact is deleted","contact added");
    }
    @Test
    void testListContacts(){

        //ContactController contactController = new ContactController();
        //String s =contactController.addContact(new Contact());
        assertEquals("contact is deleted","contact added");
    }
}
