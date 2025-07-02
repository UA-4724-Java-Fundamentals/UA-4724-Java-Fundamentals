package com.softserve.academy.module08excep;

import java.io.IOException;

class MyCheckedIOException extends IOException {

    // Classic constructor with a message of error
    public MyCheckedIOException(String msg) {
        super(msg);
    }
}