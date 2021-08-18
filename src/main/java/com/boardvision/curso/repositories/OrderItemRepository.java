package com.boardvision.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardvision.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
