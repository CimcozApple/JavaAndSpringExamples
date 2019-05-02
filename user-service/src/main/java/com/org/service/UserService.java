package com.org.service;

import com.org.entity.Login;
import com.org.entity.User;

/**
@Author Varun Adhikari
*/
public interface UserService {
	
	void register(User user);

	User getUser(Login loginDetails);

}

