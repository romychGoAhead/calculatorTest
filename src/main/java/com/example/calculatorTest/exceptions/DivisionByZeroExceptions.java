package com.example.calculatorTest.exceptions;

public class DivisionByZeroExceptions extends RuntimeException {
    public DivisionByZeroExceptions() {
    }

    public DivisionByZeroExceptions(String message) {
        super(message);
    }

    public DivisionByZeroExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionByZeroExceptions(Throwable cause) {
        super(cause);
    }

    public DivisionByZeroExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
