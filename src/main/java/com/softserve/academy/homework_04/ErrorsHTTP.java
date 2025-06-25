package com.softserve.academy.homework_04;

import java.util.Scanner;

public class ErrorsHTTP {
    enum HTTPError {
        BAD_REQUEST(400),
        UNAUTHORIZED(401),
        PAYMENT_REQUIRED(402),
        FORBIDDEN(403),
        NOT_FOUND(404);

        private int code;


        HTTPError(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

        public static HTTPError fromCode(int code) {
            for (HTTPError error : HTTPError.values()) {
                if (error.getCode() == code) {
                    return error;
                }
            }
            return null;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter HTTP error code: ");
        int code = scanner.nextInt();

        HTTPError error = HTTPError.fromCode(code);
        if (error != null) {
            System.out.println("Error name: " + error);
        } else {
            System.out.println("Unknown HTTP error code");
        }

    }


}

