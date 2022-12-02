package com.testAssigment.demoX.controller;

import com.testAssigment.demoX.model.Opportunity;
import com.testAssigment.demoX.service.OpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/opportunities")
public class OpportunityController {
    @Autowired
    private OpportunityService oportunityService;

    @PostMapping("/addOpportunity")
    public String add(@RequestBody Opportunity opportunity){

        return "new opportunity is added";
    }
    @GetMapping("opportunities")
    public List<Opportunity> getAll(){

        return null;
    }
    @DeleteMapping("/")
    public String removeContact(Opportunity op){

        return "Deleted contact";
    }
}
