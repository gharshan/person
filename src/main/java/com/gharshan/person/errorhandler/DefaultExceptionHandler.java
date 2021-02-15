package com.gharshan.person.errorhandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> handleException(Exception e) {
		ErrorMessage error=new ErrorMessage();
		error.setDetails("Something Went Wrong");
		error.setMessage(e.getMessage());
		
		return new ResponseEntity<ErrorMessage>(error,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<ErrorMessage> handleBusinessException(BusinessException e) {
		ErrorMessage error=new ErrorMessage();
		error.setDetails("Business Validation Failed");
		error.setMessage(e.getMessage());
		
		return new ResponseEntity<ErrorMessage>(error,new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
