package com.projeto02.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto02.curso.entities.Order;
import com.projeto02.curso.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired // para que o Spring faça a injeção de dependência de forma transparente ao programador
	private OrderRepository repository;
	
	//busca todos os usuarios
	public List<Order> findAll(){
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
