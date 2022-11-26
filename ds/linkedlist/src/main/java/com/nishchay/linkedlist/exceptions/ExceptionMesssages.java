package com.nishchay.linkedlist.exceptions;

public enum ExceptionMesssages {

	IndexOutOfBound("Linked List Index out of Bound");
	private String message;
	ExceptionMesssages(String message) {
		// TODO Auto-generated constructor stub
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
