package com.debasis.eventstarcker.exception;

public class ServiceException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1896104713728224245L;

	public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
