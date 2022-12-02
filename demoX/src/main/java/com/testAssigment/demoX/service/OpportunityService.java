package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Opportunity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OpportunityService {

        public Opportunity saveOpportunity(Opportunity d);
        public List<Opportunity> getAllOpportunities();


}
