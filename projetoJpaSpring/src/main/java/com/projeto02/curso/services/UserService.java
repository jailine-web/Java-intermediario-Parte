package com.projeto02.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.projeto02.curso.entities.User;
import com.projeto02.curso.repositories.UserRepository;
import com.projeto02.curso.services.exceptions.DatabaseException;
import com.projeto02.curso.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired 
	private UserRepository repository;

	// busca todos os usuarios
	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	// Salvar um usuário no banco (e retorna o objeto salvo)
	public User insert(User user) {
		return repository.save(user);
	}

	public void delete(Long id) {
		
		try {
			
			User u = findById(id);
			Long s = u.getId();
			
			if (s == id) {
				repository.deleteById(id);
				
			}
			
		} 
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		} 
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User update(Long id, User user) {
		try {
			
			User entity = repository.getReferenceById(id);
			updateData(entity, user);
			return repository.save(entity);
		} 
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
	}
}
