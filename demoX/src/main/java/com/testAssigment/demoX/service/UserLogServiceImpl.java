package com.testAssigment.demoX.service;

import com.testAssigment.demoX.model.UserLog;
import com.testAssigment.demoX.repository.UserLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogServiceImpl implements UserLogService {
    @Autowired
    private UserLogRepository userLogRepository;
    @Override
    public UserLog saveStudent(UserLog d) {

        return userLogRepository.save(d);
    }

    @Override
    public List<UserLog> getAllStudents() {
        return userLogRepository.findAll();
    }
}
