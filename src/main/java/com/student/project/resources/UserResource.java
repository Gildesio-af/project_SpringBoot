package com.student.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.project.entities.User;

@RestController
@RequestMapping(value = "/user")
public class UserResource {
	

	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "1234864", "54231");
		return ResponseEntity.ok().body(u);
	}
}
