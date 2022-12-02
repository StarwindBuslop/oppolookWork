package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Student;
import com.testAssigment.demoX.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student d) {

        return studentRepository.save(d);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
