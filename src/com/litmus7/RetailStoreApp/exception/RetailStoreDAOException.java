package com.litmus7.RetailStoreApp.exception;

public class RetailStoreDAOException extends Exception {

    public RetailStoreDAOException(String message) {
        super(message);
    }

    public RetailStoreDAOException(String message, Throwable cause) {
        super(message, cause);
    }
}