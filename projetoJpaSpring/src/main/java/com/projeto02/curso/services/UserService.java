package com.projeto02.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto02.curso.entities.User;
import com.projeto02.curso.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired // para que o Spring faça a injeção de dependência de forma transparente ao programador
	private UserRepository repository;
	
	//busca todos os usuarios
	public List<User> findAll(){
		return repository.findAll();
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	//Salvar um usuário no banco(retorna o objeto salvo)
	public User insert(User user) {
		return repository.save(user);
	}
	
}
