package com.testAssigment.demoX;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class testClient {
    @Test
    void testCreateClient(){
        assertEquals(null,"contact added");
    }
    @Test
    void testDeleteClient(){

        assertEquals("opportunity is deleted","opportunity added");
    }
    @Test
    void testListClients(){

        assertEquals("opps are listed","contact added");
    }
}
