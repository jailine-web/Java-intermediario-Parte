package com.projeto02.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto02.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
