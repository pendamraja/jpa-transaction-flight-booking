package com.flight.booking.exception;

public class InsufficientAmountException extends RuntimeException {
    public InsufficientAmountException(String msg){
        super(msg);
    }
}
