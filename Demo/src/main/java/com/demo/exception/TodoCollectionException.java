package com.demo.exception;

public class TodoCollectionException extends Exception{

	private static final long serialVersionUID=1L;
	public TodoCollectionException(String message) {
		super(message);
	}
	public static String NotFoundException(String CenterName) {
		return "Todo with "+CenterName+"not found";
	}
	public static String TodoAlreadyExists() {
		return "Todo with given Centername already exists";
	}
}
