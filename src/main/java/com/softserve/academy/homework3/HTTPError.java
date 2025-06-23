package com.softserve.academy.homework3;

public enum HTTPError {
    ERROR_401("Unauthorized"),
    ERROR_402("Payment Required"),
    ERROR_403("Forbidden"),
    ERROR_404("Not Found"),
    ERROR_405("Method Not Allowed");

    final String message;

    HTTPError(String str) {
        message = str;
    }
}
