package com.JAVASAMPLE.SpringBootApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JAVASAMPLE.SpringBootApplication.model.User;

@Repository

public interface UserRepo extends JpaRepository<User,Integer> {

}
