package com.softserve.academy.homework9clone;

public class AppStudent {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1 = new Student("Nik", "White", 25, 1);
        print(student1, 1);
        Student student2 = new Student("Tom", "Kolin", 30, 2);
        print(student2, 2);
        Student st3 = (Student) student1.clone();
        st3.setCours(3);
        print(st3, 3);

    }

    private static void print(Student st, int number) {
        System.out.println("Student "+number+": " + st.info());
        System.out.println(st.activity());
    }

}
