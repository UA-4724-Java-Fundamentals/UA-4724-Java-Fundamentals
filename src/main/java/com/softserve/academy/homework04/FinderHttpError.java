package com.softserve.academy.homework04;

import java.util.Scanner;

public class FinderHttpError {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a code HttpError: ");

        int numOfHttpError = Integer.parseInt(scanner.nextLine());

        Http400Error error = Http400Error.fromCode(numOfHttpError);

        if (error != null) {
            System.out.println("Error " + error.getCode() + ": " + error.getMessage());
        }
    }

    public enum Http400Error {
        BAD_REQUEST(400, "Bad Request"),
        UNAUTHORIZED(401, "Unauthorized"),
        PAYMENT_REQUIRED(402, "Payment Required"),
        FORBIDDEN(403, "Forbidden"),
        NOT_FOUND(404, "Not Found"),
        METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
        NOT_ACCEPTABLE(406, "Not Acceptable"),
        PROXY_AUTHENTICATION_REQUIRED(407, "Proxy Authentication Required"),
        REQUEST_TIMEOUT(408, "Request Timeout"),
        CONFLICT(409, "Conflict"),
        GONE(410, "Gone"),
        LENGTH_REQUIRED(411, "Length Required"),
        PRECONDITION_FAILED(412, "Precondition Failed"),
        PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
        URI_TOO_LONG(414, "URI Too Long"),
        UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
        RANGE_NOT_SATISFIABLE(416, "Range Not Satisfiable"),
        EXPECTATION_FAILED(417, "Expectation Failed"),
        IM_A_TEAPOT(418, "I'm a teapot"), // Easter egg from RFC 2324
        MISDIRECTED_REQUEST(421, "Misdirected Request"),
        UNPROCESSABLE_ENTITY(422, "Unprocessable Entity"),
        LOCKED(423, "Locked"),
        FAILED_DEPENDENCY(424, "Failed Dependency"),
        TOO_EARLY(425, "Too Early"),
        UPGRADE_REQUIRED(426, "Upgrade Required"),
        PRECONDITION_REQUIRED(428, "Precondition Required"),
        TOO_MANY_REQUESTS(429, "Too Many Requests"),
        REQUEST_HEADER_FIELDS_TOO_LARGE(431, "Request Header Fields Too Large"),
        UNAVAILABLE_FOR_LEGAL_REASONS(451, "Unavailable For Legal Reasons");

        private final int code;
        private final String message;

        Http400Error(int code, String message) {
            this.code = code;
            this.message = message;
        }

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        public static Http400Error fromCode(int code) {
            for (Http400Error error : values()) {
                if (error.code == code) {
                    return error;
                }
            }
            return null;
        }
    }

}