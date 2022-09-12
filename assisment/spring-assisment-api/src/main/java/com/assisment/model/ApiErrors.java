package com.assisment.model;

import java.time.LocalDateTime;
import java.util.List;



public class ApiErrors {

	LocalDateTime timestap;
	String message;
	int status;
	List<String> errors;
	public ApiErrors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApiErrors(LocalDateTime timestap, String message, int status, List<String> errors) {
		super();
		this.timestap = timestap;
		this.message = message;
		this.status = status;
		this.errors = errors;
	}
	public LocalDateTime getTimestap() {
		return timestap;
	}
	public void setTimestap(LocalDateTime timestap) {
		this.timestap = timestap;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	@Override
	public String toString() {
		return "ApiErrors [timestap=" + timestap + ", message=" + message + ", status=" + status + ", errors=" + errors
				+ "]";
	}
	
	
}
