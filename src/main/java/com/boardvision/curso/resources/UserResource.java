package com.boardvision.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boardvision.curso.entities.User;
import com.boardvision.curso.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
		
	@Autowired
	private UserService service;

	//Retorna todos os usuarios
	@GetMapping
	public ResponseEntity<List<User>> findall(){
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	//Retorna um usuario pelo id
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
