package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentService {
    public Student saveStudent(Student d);
    public List<Student> getAllStudents();
}
