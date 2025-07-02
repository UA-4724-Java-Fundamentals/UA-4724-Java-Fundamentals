package com.softserve.academy.module08excep;


import java.util.Scanner;

class NonDigitException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NonDigitException(String message) {
        super(message);
    }

    public NonDigitException(Throwable cause) {
        super(cause);
    }
}

public class AppReadNum {

    public static int readNumber(int start, int end) {
        int num = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("num = ");
            String input = scanner.nextLine();
            num = Integer.valueOf(input);
            if ((num < start) || (end < num)) {
                throw new IllegalArgumentException("num = " + num);
            }
        } catch (NumberFormatException e) {
            throw new NonDigitException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println("result = " + readNumber(-100, 100));
    }
}
