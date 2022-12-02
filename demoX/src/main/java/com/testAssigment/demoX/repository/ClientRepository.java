package com.testAssigment.demoX.repository;

import com.testAssigment.demoX.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
