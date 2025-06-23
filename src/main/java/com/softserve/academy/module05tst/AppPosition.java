package com.softserve.academy.module05tst;

public class AppPosition {

    public static void main(String[] args) {
        int[] arr = {-4, -2, 1, 0, -5, 5, 8, -8, -9, 4};
        //
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[ " + i + " ] = " + arr[i]);
        }
        //
        int countPos = 0;
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                countPos++;
            }
            if (countPos == 2) {
                pos = i;
                break;
            }
        }
        System.out.println("pos = " + pos);
    }
}
