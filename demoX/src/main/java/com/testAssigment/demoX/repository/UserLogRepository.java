package com.testAssigment.demoX.repository;

import com.testAssigment.demoX.model.UserLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogRepository extends JpaRepository<UserLog, Integer> {
}
