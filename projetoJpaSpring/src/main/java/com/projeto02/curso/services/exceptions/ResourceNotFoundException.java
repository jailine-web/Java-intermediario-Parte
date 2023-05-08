package com.projeto02.curso.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Código não encontrado para o Id: "+ id);
	}
	
	
	
}
