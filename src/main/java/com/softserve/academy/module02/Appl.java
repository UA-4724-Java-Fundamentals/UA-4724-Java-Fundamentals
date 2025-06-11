package com.softserve.academy.module02;

public class Appl {

    public static void work(String msg, Object... list) {
        System.out.println("msg = " + msg);
        for (Object current : list) {
            System.out.println("current = " + current); // current.toString()
        }
    }

    public static void main(String[] args) {
        Student stud1 = new Student("Ostap", "Petrenko", 18);
        Student stud2 = new Student("Maryna", "Romaniv", 21);
        /*
        System.out.println("stud1: firstname = " + stud1.getFirstname()
                + "  lastname = " + stud1.getLasttname()
                + "  age = " + stud1.getAge());
        //
        System.out.println("stud2: firstname = " + stud2.getFirstname()
                + "  lastname = " + stud2.getLasttname()
                + "  age = " + stud2.getAge());
        //
        System.out.println("stud1: " + stud1.toString()); // stud1.toString();
        System.out.println("stud2: " + stud2);
        */
        //work("message1", "Ivan", "Petro");
        //work("message2", "Ivan", "Ira", 1234, true);
        work("students: ", "Ivan", "Ira", stud1, stud2);
    }
}
  