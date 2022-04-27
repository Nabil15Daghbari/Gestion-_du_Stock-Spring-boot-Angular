package com.nabil.gestiondestock.exception;

import java.util.List;

import lombok.Getter;


// Exception lors de l'ajout d'une entité à la base de données.
public class InvalidEntityExeption extends RuntimeException {

	
	
	@Getter
	private  ErrorCodes errorCodes ;
	
	@Getter
	private List<String> errors ;
	
	public InvalidEntityExeption(String message ) {
		super(message );
	}
	
	
	public InvalidEntityExeption(String message ,  Throwable cause) {
		super(message , cause);
	}
	
	
	
	
	public InvalidEntityExeption(String message , Throwable cause , ErrorCodes errorCode ) {
		super(message , cause );
		
		this.errorCodes=errorCode;
		}
	
	
	
	
	public InvalidEntityExeption(String message ,  ErrorCodes errorCodes  ) {
			super(message);
			this.errorCodes=errorCodes;
		}
	
	public InvalidEntityExeption(String message ,  ErrorCodes errorCodes , List<String> errors ) {
		super(message);
		this.errorCodes=errorCodes;
		this.errors= errors;
	}
	
	
}
