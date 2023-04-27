package com.projeto02.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto02.curso.entities.Category;
import com.projeto02.curso.services.CategoryService;

@RestController 
@RequestMapping(value = "/categories") 
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //permite que o id seja passado via url, dizendo que a url tem um parâmetro.
	public ResponseEntity<Category> findById(@PathVariable Long id){ 
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
