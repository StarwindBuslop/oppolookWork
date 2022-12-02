package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.UserLog;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserLogService {
    public UserLog saveUser(UserLog d);
    public List<UserLog> getAllUsers();
}
