package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.LoginRepository;
import com.org.dao.UserRepository;
import com.org.entity.Login;
import com.org.entity.User;

/**
@Author Varun Adhikari
*/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public void register(User user) {
		repository.save(user);
	}

	@Override
	public User getUser(Login loginDetails) {
		Login userDetails = loginRepository.getByUsername(loginDetails.getUsername());
		if(userDetails.getPass().equals(loginDetails.getPass())){
			return repository.getByUsername(loginDetails.getUsername());
		}
		throw new IllegalStateException("Invalid User");
	}
}

