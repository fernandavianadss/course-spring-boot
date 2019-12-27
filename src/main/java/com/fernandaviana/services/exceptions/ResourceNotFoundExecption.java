package com.fernandaviana.services.exceptions;

public class ResourceNotFoundExecption extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExecption(Object id) {
		super("Resource bot found. Id "+id);
	}
}
