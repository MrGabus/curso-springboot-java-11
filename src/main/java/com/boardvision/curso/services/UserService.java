package com.boardvision.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardvision.curso.entities.User;
import com.boardvision.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	//Retorna todos usuarios
	public List<User> findAll() {
		return repository.findAll();
	}
	
	//Retorna um usuario pelo id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
