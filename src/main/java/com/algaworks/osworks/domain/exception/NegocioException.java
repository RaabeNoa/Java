package com.algaworks.osworks.domain.exception;

public class NegocioException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	/*
	 * Classe pra representar um erro de domínio/negócio
	 * */
	
	public NegocioException(String message) {
		super(message);
	}

}
