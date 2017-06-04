package com.shubhamyeole.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.BAD_REQUEST)
public class EntityAlreadyExistException extends RuntimeException{

	private static final long serialVersionUID = 6877806641253096966L;

	public EntityAlreadyExistException(String message){
		super(message);
	}
	
	public EntityAlreadyExistException(String message, Throwable cause){
		super(message, cause);
	}
}
