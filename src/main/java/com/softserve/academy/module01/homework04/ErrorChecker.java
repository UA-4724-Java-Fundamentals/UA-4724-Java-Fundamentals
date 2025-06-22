package com.softserve.academy.module01.homework04;

import java.util.Scanner;

public class ErrorChecker {

    enum HTTPError {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
        INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
        NOT_IMPLEMENTED(501, "Not Implemented"),
        BAD_GATEWAY(502, "Bad Gateway"),
        SERVICE_UNAVAILABLE(503, "Service Unavailable");

        private final int code;
        private final String description;

        HTTPError(int code, String description) {
            this.code = code;
            this.description = description;
        }

        public int getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        public static HTTPError getByCode(int code) {
            for (HTTPError error : values()) {
                if (error.getCode() == code) {
                    return error;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an HTTP error code (e.g., 400, 404, 500): ");
        int errorCode = scanner.nextInt();

        scanner.close();

        HTTPError error = HTTPError.getByCode(errorCode);

        if (error != null) {
            System.out.println("HTTP Error " + error.getCode() + ": " + error.getDescription());
        } else {
            System.out.println("Invalid HTTP error code entered.");
        }
    }
}