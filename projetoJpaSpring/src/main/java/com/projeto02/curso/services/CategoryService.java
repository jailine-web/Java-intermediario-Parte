package com.projeto02.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto02.curso.entities.Category;
import com.projeto02.curso.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired // para que o Spring faça a injeção de dependência de forma transparente ao programador
	private CategoryRepository repository;
	
	//busca todos os usuarios
	public List<Category> findAll(){
		return repository.findAll();
	}
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
