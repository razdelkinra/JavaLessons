package com.prog.lessons.crm.exception;

public class UserException extends Exception {

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
