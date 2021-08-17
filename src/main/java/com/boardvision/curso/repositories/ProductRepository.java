package com.boardvision.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardvision.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
