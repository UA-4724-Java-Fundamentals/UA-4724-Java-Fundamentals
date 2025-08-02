package module11.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class hwTask3 {
    public static void main(String[] args) {
        // 1. Створюємо список і додаємо п'ять студентів
        List<Student> students = new ArrayList<>();
        students.add(new Student("Olena", 3));
        students.add(new Student("Andriy", 2));
        students.add(new Student("Yana", 1));
        students.add(new Student("Petro", 3));
        students.add(new Student("Maksym", 2));

        System.out.println("## Початковий список студентів:");
        students.forEach(System.out::println);

        // 2. Відображаємо список, відсортований за іменем
        System.out.println("\n## Список, відсортований за іменем:");
        students.sort(Student.byNameComparator);
        students.forEach(System.out::println);

        // 3. Відображаємо список, відсортований за курсом
        System.out.println("\n## Список, відсортований за курсом:");
        students.sort(Student.byCourseComparator);
        students.forEach(System.out::println);

        // 4. Тестуємо метод printStudents
        Student.printStudents(students, 2); // Виведе Andriy та Maksym
    }
}

// Прибираємо 'public', щоб клас міг існувати в одному файлі з hwTask3
class Student {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", course=" + course + '}';
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("\nСтуденти з курсу " + course + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static Comparator<Student> byNameComparator = Comparator.comparing(Student::getName);
    public static Comparator<Student> byCourseComparator = Comparator.comparingInt(Student::getCourse);
}