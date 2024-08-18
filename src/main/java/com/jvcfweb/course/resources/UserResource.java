package com.jvcfweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvcfweb.course.entities.User;

//Informando que é um recurso Web implementado por controlador rest
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//Indicar que é um método do tipo GET
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
