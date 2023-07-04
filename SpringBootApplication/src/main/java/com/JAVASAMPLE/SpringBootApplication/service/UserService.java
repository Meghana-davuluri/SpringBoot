package com.JAVASAMPLE.SpringBootApplication.service;

import java.util.List;

import com.JAVASAMPLE.SpringBootApplication.model.User;
import com.JAVASAMPLE.SpringBootApplication.repository.UserRequest;

public interface UserService {
	
	User saveUser(UserRequest request)throws UserExistException;
	List<User>getAllUsers();
	User getUser(Integer id)throws UserNotFoundException;
	String deleteUser(Integer id)throws UserNotFoundException;
	User updateUser(UserRequest req)throws UserNotFoundException;

	public static class UserExistException extends Exception {
		public UserExistException(String message) {
			super(message);
		}
	}
	
	public static class UserNotFoundException extends Exception {
		public UserNotFoundException(String message) {
			super(message);
		}
	}
}
