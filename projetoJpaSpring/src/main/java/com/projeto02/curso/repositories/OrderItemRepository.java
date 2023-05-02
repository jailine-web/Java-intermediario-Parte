package com.projeto02.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto02.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
