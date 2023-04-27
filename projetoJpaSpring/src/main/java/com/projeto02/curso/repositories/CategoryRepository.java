package com.projeto02.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto02.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
