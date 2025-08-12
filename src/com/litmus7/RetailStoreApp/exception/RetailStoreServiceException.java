package com.litmus7.RetailStoreApp.exception;

public class RetailStoreServiceException extends Exception {
	
    public RetailStoreServiceException(String message) {
        super(message);
    }

    public RetailStoreServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}