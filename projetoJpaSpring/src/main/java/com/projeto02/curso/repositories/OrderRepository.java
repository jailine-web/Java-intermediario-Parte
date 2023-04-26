package com.projeto02.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto02.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
