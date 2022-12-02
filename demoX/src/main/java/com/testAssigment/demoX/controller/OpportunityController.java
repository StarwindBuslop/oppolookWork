package com.testAssigment.demoX.controller;

import com.testAssigment.demoX.model.Opportunity;
import com.testAssigment.demoX.service.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opportunity")
public class OpportunityController {
    @Autowired
    private OpportunityService opportunityService;

    @PostMapping("/add")
    public String addOpportunity(@RequestBody Opportunity opportunity){
        opportunityService.saveOpportunity(opportunity);
        return "new opportunity";
    }
    @GetMapping("/opportunities")
    public List<Opportunity> getAllOpportunities(){
        return opportunityService.getAllOpportunities();

    }
}
