package com.xmg.mall.base.exception;

public class StaleObjectStateException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public StaleObjectStateException() {
	}

	public StaleObjectStateException(String message, Throwable cause) {
		super(message, cause);
	}

	public StaleObjectStateException(String message) {
		super(message);
	}

	public StaleObjectStateException(Throwable cause) {
		super(cause);
	}
	
}
