package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.Opportunity;

import java.util.List;

public interface OpportunityService {

        public Opportunity saveOpportunity(Opportunity d);
        public List<Opportunity> getAllOpportunities();


}
