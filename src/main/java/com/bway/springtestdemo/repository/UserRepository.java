package com.bway.springtestdemo.repository;

import com.bway.springtestdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {



}
