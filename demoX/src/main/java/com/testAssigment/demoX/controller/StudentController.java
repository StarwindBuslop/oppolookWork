package com.testAssigment.demoX.controller;

import com.testAssigment.demoX.model.Student;
import com.testAssigment.demoX.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "new student is added";
    }
    @GetMapping("/students")
    public List<Student> getAll(){
        return studentService.getAllStudents();

    }
    @RequestMapping(value="/welcome",method = RequestMethod.GET)
    public String welcomepage() {
        return "Welcome my first test";
    }
}
