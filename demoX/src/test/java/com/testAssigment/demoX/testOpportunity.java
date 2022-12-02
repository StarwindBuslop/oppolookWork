package com.testAssigment.demoX;

import com.testAssigment.demoX.controller.ContactController;
import com.testAssigment.demoX.model.Contact;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class testOpportunity {
    @Test
    void testCreateOpportunity(){
        assertEquals(null,"contact added");
    }
    @Test
    void testDeleteOpportunity(){

        assertEquals("opportunity is deleted","opportunity added");
    }
    @Test
    void testListOpportunities(){

        assertEquals("opps are listed","contact added");
    }
}
