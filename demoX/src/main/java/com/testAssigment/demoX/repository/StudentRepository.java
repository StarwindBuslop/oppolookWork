package com.testAssigment.demoX.repository;

import com.testAssigment.demoX.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
