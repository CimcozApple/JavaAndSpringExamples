package com.org.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.org.entity.Login;

/**
@Author Varun Adhikari
*/
@Transactional
public interface LoginRepository extends CrudRepository<Login, String> {

	Login getByUsername(String username);

}

