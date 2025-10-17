package com.example.demo.exception;

public class EmailAlreadyUsedException extends RuntimeException {
    public EmailAlreadyUsedException(String email) {
        super("Email %s already in use".formatted(email));
    }
}

