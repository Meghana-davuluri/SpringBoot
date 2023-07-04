package com.JAVASAMPLE.SpringBootApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JAVASAMPLE.SpringBootApplication.model.User;
import com.JAVASAMPLE.SpringBootApplication.repository.UserRepo;
import com.JAVASAMPLE.SpringBootApplication.repository.UserRequest;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo repo;
    
	public User saveUser(UserRequest request)throws UserExistException {
		User user = new User();
		if(repo.findByMail(request.getMail()).isPresent()||
				repo.findByMobile(request.getMobile()).isPresent()) {
			throw new UserExistException("You are already registered with us");
		} else {
			user.setFName(request.getFName());
			user.setLName(request.getLName());
			user.setGender(request.getGender());
			user.setMail(request.getMail());
			user.setMobile(request.getMobile());
			user.setAge(request.getAge());
			user.setCity(request.getCity());
			user.setPassword(request.getPassword());
			user.setPincode(request.getPincode());
			repo.save(user);
			return user;
		}
	}
	
	public List<User>getAllUsers(){
		return repo.findAll();
	}
	
	public User getUser(Integer id)throws UserNotFoundException{
		Optional<User> op = repo.findById(id);
		if(op.isPresent()) {
			User us = op.get();
			return us;
		} else {
			throw new UserNotFoundException("User not found with id:"+id);
		}		
	}
	
	@Override
	public String deleteUser(Integer id) throws UserNotFoundException{
		Optional<User> op = repo.findById(id);
		if(op.isPresent()) {
			repo.deleteById(id);
			return "Deleted Successfully";
		}else {
			throw new UserNotFoundException("User not found with id:"+id);
		}
	}
	
	public User updateUser(UserRequest req) throws UserNotFoundException {
		Optional<User> op = repo.findByMail(req.getMail());
		if(op.isPresent() && op.get().getPassword().equals(req.getPassword())) {
			User user = op.get();
			user.setFName(req.getFName());
			user.setLName(req.getLName());
			user.setGender(req.getGender());
			user.setMail(req.getMail());
			user.setMobile(req.getMobile());
			user.setAge(req.getAge());
			user.setCity(req.getCity());
			user.setPassword(req.getPassword());
			user.setPincode(req.getPincode());
			repo.save(user);
			return user;
		} else {
			throw new UserNotFoundException("User not found with email:" +req.getMail());
			}
		}
}
