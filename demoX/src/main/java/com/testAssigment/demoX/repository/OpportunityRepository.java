package com.testAssigment.demoX.repository;

import com.testAssigment.demoX.model.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OpportunityRepository extends JpaRepository<Opportunity, Integer> {
}
