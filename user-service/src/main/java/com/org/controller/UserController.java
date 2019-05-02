package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.org.entity.Login;
import com.org.entity.User;
import com.org.service.UserService;

/**
@Author Varun Adhikari
*/
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET, consumes="application/json", produces="application/json")
	public User login(@RequestBody Login loginDetails){
		return service.getUser(loginDetails);
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST, consumes="application/json")
	public void register(@RequestBody User user){
		service.register(user);		
	}
}

