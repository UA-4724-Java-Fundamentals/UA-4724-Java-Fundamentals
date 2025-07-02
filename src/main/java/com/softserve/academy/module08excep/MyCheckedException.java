package com.softserve.academy.module08excep;

class MyCheckedException extends Exception {

    // Classic constructor with a message of error
    public MyCheckedException(String msg) {
        super(msg);
    }

    // Empty constructor
    public MyCheckedException() {
        super("hahaha");
    }

    // Constructor with a message and a cause
    public MyCheckedException(String msg, Throwable cause) {
        super(msg, cause);
    }

    // Constructor with a cause
    public MyCheckedException(Throwable cause) {
        super(cause);
    }
}