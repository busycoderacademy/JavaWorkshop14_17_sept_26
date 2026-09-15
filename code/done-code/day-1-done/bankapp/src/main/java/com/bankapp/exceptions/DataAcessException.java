package com.bankapp.exceptions;

public class DataAcessException extends RuntimeException{
    public DataAcessException(String message, Throwable cause) {
        super(message, cause);
    }
}
