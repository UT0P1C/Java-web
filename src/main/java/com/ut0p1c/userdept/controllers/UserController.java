package com.ut0p1c.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ut0p1c.userdept.entities.User;
import com.ut0p1c.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll () {
		List<User> results = repository.findAll();
		return results;
	}
	
	@GetMapping(value = "/{id}")
	public User findById (@PathVariable Long id) {
		User result = repository.findById(id).get();
		return result;
	}
	
	
	@PostMapping
	public User insert (@RequestBody User user) {
		User result = repository.save(user);
		return result;
	}
	
}
