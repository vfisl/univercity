package com.assisment.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.assisment.model.ApiErrors;

import ch.qos.logback.core.status.Status;

public class GlobelExceptionHandler extends ResponseEntityExceptionHandler {

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.add("error", "Method not found");
		List<String> errosMess = new ArrayList<>();
		errosMess.add(ex.getMessage());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errosMess);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.add("error", "Method not found");
		List<String> errosMess = new ArrayList<>();
		errosMess.add(ex.getMessage());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errosMess);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex,
			org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.add("error", "Path not found");
		List<String> errosMess = new ArrayList<>();
		errosMess.add(ex.getMessage());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errosMess);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
			org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.add("error", "Missing Parameter");
		List<String> errosMess = new ArrayList<>();
		errosMess.add(ex.getMessage());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errosMess);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleTypeMismatch(TypeMismatchException ex,
			org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest request) {

		headers.add("error", "Type MissMatch");
		List<String> errosMess = new ArrayList<>();
		errosMess.add(ex.getMessage());
		ApiErrors errors = new ApiErrors(LocalDateTime.now(), ex.getMessage(), status.value(), errosMess);
		return ResponseEntity.status(status).headers(headers).body(errors);
	}

	@ExceptionHandler(value = UniversityNotFoundException.class)
	 ResponseEntity<Object> handleUniversityNotFoundException(UniversityNotFoundException e){
		HttpHeaders headers=new HttpHeaders();
		headers.add("error", "College Not found");
		List<String> errosMess=new ArrayList<>();
		errosMess.add(e.getMessage());
		ApiErrors errors=new ApiErrors(LocalDateTime.now(), e.getMessage(), Status.ERROR, errosMess);
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).body(errors);
	}

	@ExceptionHandler(value = CollegeNotFoundException.class)
    ResponseEntity<Object> handleCollegeNotFoundException(CollegeNotFoundException e){
	HttpHeaders headers=new HttpHeaders();
	headers.add("error", "College Not found");
	List<String> errosMess=new ArrayList<>();
	errosMess.add(e.getMessage());
	ApiErrors errors=new ApiErrors(LocalDateTime.now(), e.getMessage(), Status.ERROR, errosMess);
	return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).body(errors);
}

	@ExceptionHandler(value = Exception.class)
	 ResponseEntity<Object> handleOtherException(Exception e){
		
		HttpHeaders headers=new HttpHeaders();
		headers.add("error", "Type MissMatch");
		List<String> errosMess=new ArrayList<>();
		errosMess.add(e.getMessage());
		ApiErrors errors=new ApiErrors(LocalDateTime.now(), e.getMessage(), Status.ERROR, errosMess);
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(headers).body(errors);
	}

}
