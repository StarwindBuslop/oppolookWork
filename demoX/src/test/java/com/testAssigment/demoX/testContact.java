package com.testAssigment.demoX;


import com.testAssigment.demoX.controller.StudentController;
import com.testAssigment.demoX.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class testContact {
    @Test
    void TestCreateContact(){

        //StudentController studentController = new StudentController();
        //String s =studentController.add(new Student(3,"Pepe2","Ronda"));
        assertEquals("Pepe","contact added");
    }
    void TestDeleteContact(){

        //StudentController studentController = new StudentController();
        //String s =studentController.add(new Student(3,"Pepe2","Ronda"));
        assertEquals("contact is deleted","contact added");
    }
}
