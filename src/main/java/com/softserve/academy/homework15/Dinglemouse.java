package com.softserve.academy.homework15;

public class Dinglemouse {

    private static class Logan5 implements Runnable {
        public void run() {
            System.out.println("Hello from Logan5");
            ThreadUtil.method1();
        }
    }

    private static class Jessica6 implements Runnable {
        public void run() {
            System.out.println("Hello from Jessica6");
            ThreadUtil.method2();
        }
    }

    public static void runRunners() {
        new Thread(new Logan5()).start();
        new Thread(new Jessica6()).start();
    }

    class ThreadUtil {
        public static void method1() {
        }

        public static void method2() {
        }
    }
}