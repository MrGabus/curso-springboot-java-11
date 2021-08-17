package com.boardvision.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boardvision.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
