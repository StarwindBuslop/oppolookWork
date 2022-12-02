package com.testAssigment.demoX.controller;

import com.testAssigment.demoX.model.UserLog;
import com.testAssigment.demoX.service.UserLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserLogController {
    @Autowired
    private UserLogService userLogService;

    @PostMapping("/add")
    public String add(@RequestBody UserLog userLog){
        userLogService.saveStudent(userLog);
        return "new userLog is added";
    }
    @GetMapping("/users")
    public List<UserLog> getAll(){
        return userLogService.getAllStudents();

    }
    @RequestMapping(value="/welcome",method = RequestMethod.GET)
    public String welcomepage() {
        return "Welcome my first test";
    }
}
