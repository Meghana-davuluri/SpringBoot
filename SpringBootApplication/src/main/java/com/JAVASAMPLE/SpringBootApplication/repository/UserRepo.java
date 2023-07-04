package com.JAVASAMPLE.SpringBootApplication.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JAVASAMPLE.SpringBootApplication.model.User;

@Repository

public interface UserRepo extends JpaRepository<User,Integer> {
  public Optional<User> findByMail(String mail);
	public Optional<User> findByMobile(String mobile);
  
}
