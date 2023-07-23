package com.challenge.authorizationSystem.exceptions;

public class ItemExistsAlreadyException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ItemExistsAlreadyException(String message){ super(message);}
}
