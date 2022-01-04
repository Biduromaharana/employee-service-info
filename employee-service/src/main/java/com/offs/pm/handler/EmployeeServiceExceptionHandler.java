package com.offs.pm.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.offs.pm.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class EmployeeServiceExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(EmployeeNotFoundException e) {
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
