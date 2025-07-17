package module09.homework.task2;

import module09.homework.task1.FullName;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1 = new Student(new FullName("Alice", "Smith"), 20, 2);
        Student student2 = new Student(new FullName("Bob", "Johnson"), 21, 3);

        System.out.println("--- Original Students ---");
        System.out.println(student1.info());
        System.out.println("Activity: " + student1.activity());
        System.out.println("---");
        System.out.println(student2.info());
        System.out.println("Activity: " + student2.activity());

        // Клонування першого студента
        Student student3_clone = student1.clone();

        // Зміна курсу у клона
        student3_clone.setCourse(4);

        System.out.println("\n--- After cloning and changing course ---");
        System.out.println("Original Student 1: " + student1.info());
        System.out.println("Cloned Student 3:   " + student3_clone.info());
    }
}
