package com.adhikari.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adhikari.entity.User;
import com.adhikari.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/login/{name}")
	public ResponseEntity<User> login(@PathVariable String name) {
		return ResponseEntity.ok().body(userService.findByUsername(name));
	}

	@GetMapping(value = "/")
	public String welcome() {
		return "Welcome";
	}

}
