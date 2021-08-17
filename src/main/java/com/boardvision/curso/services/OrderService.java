package com.boardvision.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boardvision.curso.entities.Order;
import com.boardvision.curso.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	//Retorna todas orders
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	//Retorna uma order pelo id
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
