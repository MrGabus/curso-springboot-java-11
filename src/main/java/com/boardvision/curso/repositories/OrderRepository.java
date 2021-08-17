package com.boardvision.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardvision.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}