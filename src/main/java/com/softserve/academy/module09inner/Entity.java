package com.softserve.academy.module09inner;

class Entity {

    private static class Counter { // Nested Class
        private void setCount() {
            count = count + 1;
            // num++; // Compile Error
        }
    }

    //---------------------------------------------

    private static int count = 0;
    private static Counter counter;

    private int num = 1;

    // Static block
    static {
        counter = new Counter();
        System.out.println("Static block done");
    }

    // Init block
    {
        System.out.println("\tInit block2 done");
    }

    public Entity() {
        // new Counter().setCount();
        counter.setCount();
        System.out.println("\tEntity() constructor done");
    }

    public static int getCount() {
        return count;
    }
}