package com.boardvision.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardvision.curso.entities.Product;
import com.boardvision.curso.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//Retorna todos produtos
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	//Retorna um produto pelo id
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
