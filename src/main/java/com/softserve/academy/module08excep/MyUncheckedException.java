package com.softserve.academy.module08excep;

public class MyUncheckedException extends RuntimeException {

    // Classic constructor with a message of error
    public MyUncheckedException(String msg) {
        super(msg);
    }
}