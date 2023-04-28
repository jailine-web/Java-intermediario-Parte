package com.projeto02.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto02.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
