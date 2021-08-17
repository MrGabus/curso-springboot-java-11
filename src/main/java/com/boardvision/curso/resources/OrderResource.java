package com.boardvision.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boardvision.curso.entities.Order;
import com.boardvision.curso.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
		
	@Autowired
	private OrderService service;

	//Retorna todas as orders
	@GetMapping
	public ResponseEntity<List<Order>> findall(){
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	//Retorna uma order pelo id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
