package com.org.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.org.entity.User;

/**
@Author Varun Adhikari
*/
@Transactional
public interface UserRepository extends CrudRepository<User, String>{

	User getByUsername(String username);

}

