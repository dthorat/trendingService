package com.wsi.order.trending.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.wsi.order.trending.exceptions.ErrorDetails;
import com.wsi.order.trending.exceptions.ItemNotFoundException;

@RestControllerAdvice
public class CustomizedItemNotFoundExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(ItemNotFoundException.class)
	  public final ResponseEntity<ErrorDetails> handleUserNotFoundException(ItemNotFoundException ex, WebRequest request) {
	    ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
	        request.getDescription(false));
	    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	  }
}
