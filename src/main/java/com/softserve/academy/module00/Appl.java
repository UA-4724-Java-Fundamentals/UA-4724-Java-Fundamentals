package com.softserve.academy.module00;

/**
 * <font color="red">Super</font> <b>Class</b>
 */
public class Appl {
    private int i = 123;

    /*-
     * asdad
     * asdasda  ada
     */
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        //
        Appl appl1 = new Appl();
        System.out.println("appl1.i = " + appl1.i);  // 123
        //appl1.main(null);
        appl1.i = 456;
        //
        Appl appl2 = new Appl();
        System.out.println("appl2.i = " + appl2.i);  // 123
        //
        System.out.println("appl1.i = " + appl1.i);  // 456
        System.out.println("appl2.i = " + appl2.i);  // 123
        //
        //appl1 = null;
        //System.out.println("appl1.i = " + appl1.i);
        //
        byte b = 1;
        b = (byte) (b + 2); // 2 is int; 3 int type;
        System.out.println("b = " + b);
        //
        float pi = 3.14159f;
        System.out.println("pi = " + pi);
        //
        String s = "abc\nefg";
        System.out.println(s);
        //
        System.out.print("ABCDEFGH");
        Thread.sleep(2000);
        System.out.println("\r01234");
        //
    }
}
