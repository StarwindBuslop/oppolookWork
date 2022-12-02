package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student d);
    public List<Student> getAllStudents();
}
