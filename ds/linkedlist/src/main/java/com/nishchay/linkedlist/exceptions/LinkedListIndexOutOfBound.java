package com.nishchay.linkedlist.exceptions;



//Why exception need to serailize ?
//In remote method throws the exception then that exception should also be send over network
public class LinkedListIndexOutOfBound extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LinkedListIndexOutOfBound(String message) {
		super(message);
	}
}
