package com.softserve.academy.module01.Homework04;

import java.util.Scanner;

public class HTTPError {
    enum HTTPErrors {
        ERROR_400(400, "Bad Request"),
        ERROR_401(401, "Unauthorized"),
        ERROR_402(402, "Payment Required"),
        ERROR_403(403, "Forbidden"),
        ERROR_404(404, "Not Found"),
        ERROR_500(500, "Internal Server Error");

        private int code;

        private String message;

        HTTPErrors(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        public static HTTPErrors fromCode(int code) {
            for (HTTPErrors error : HTTPErrors.values()) {
                if (error.getCode() == code) {
                    return error;
                }
            }
            return null;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter HTTP error code: ");
        int code = sc.nextInt();

        HTTPErrors error = HTTPErrors.fromCode(code);

        if (error != null) {
            System.out.println("Error code: " + error.getCode());
            System.out.println("Message: " + error.getMessage());
        } else {
            System.out.println("Unknown HTTP error code: " + code);
        }


    }

}
