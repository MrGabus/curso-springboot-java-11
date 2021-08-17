package com.boardvision.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardvision.curso.entities.Category;
import com.boardvision.curso.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	//Retorna todas categorias
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	//Retorna uma categoria pelo id
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
