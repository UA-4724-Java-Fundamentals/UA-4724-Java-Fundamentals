import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    static List<Integer> fillRandom(int size, int min, int maxExclusive) {
        Random rnd = new Random();
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) list.add(rnd.nextInt(maxExclusive - min) + min);
        return list;
    }

    static List<Integer> fillFromConsole(int size, Scanner in) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            while (true) {
                System.out.print("Enter integer #" + (i + 1) + ": ");
                try {
                    list.add(in.nextInt());
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Not an integer, try again.");
                    in.next();
                }
            }
        }
        return list;
    }

    static void swapMinMax(List<Integer> list) {
        if (list.isEmpty()) return;
        int min = list.get(0), max = list.get(0);
        int imin = 0, imax = 0;
        for (int i = 1; i < list.size(); i++) {
            int v = list.get(i);
            if (v < min) { min = v; imin = i; }
            if (v > max) { max = v; imax = i; }
        }
        int tmp = list.get(imin);
        list.set(imin, list.get(imax));
        list.set(imax, tmp);
    }

    static void insertRandomBeforeFirstNegative(List<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                int threeDigit = 100 + rnd.nextInt(900);
                list.add(i, threeDigit);
                return;
            }
        }
    }

    static void insertZeroBetweenOppositeSigns(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int a = list.get(i), b = list.get(i + 1);
            if (a != 0 && b != 0 && (long) a * b < 0) {
                list.add(i + 1, 0);
                i++;
            }
        }
    }

    static SplitResult splitK(List<Integer> source, int k) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if (k < 0) k = 0;
        if (k > source.size()) k = source.size();
        for (int i = 0; i < k; i++) list1.add(source.get(i));
        for (int i = source.size() - 1; i >= k; i--) list2.add(source.get(i));
        return new SplitResult(list1, list2);
    }

    static boolean removeLastEven(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    static void removeAfterFirstMinimum(List<Integer> list) {
        if (list.isEmpty()) return;
        int min = list.get(0), imin = 0;
        for (int i = 1; i < list.size(); i++) {
            int v = list.get(i);
            if (v < min) { min = v; imin = i; }
        }
        if (imin < list.size() - 1) list.remove(imin + 1);
    }

    static class SplitResult {
        List<Integer> list1;
        List<Integer> list2;
        SplitResult(List<Integer> l1, List<Integer> l2) { this.list1 = l1; this.list2 = l2; }
    }

    static class Student {
        private String name;
        private String group;
        private int course;
        private List<Integer> grades;

        Student(String name, String group, int course, List<Integer> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = new ArrayList<>(grades);
        }

        double average() {
            if (grades.isEmpty()) return 0.0;
            int sum = 0;
            for (int g : grades) sum += g;
            return (double) sum / grades.size();
        }

        int getCourse() { return course; }
        String getName() { return name; }
        void promote() { course++; }

        @Override
        public String toString() {
            return "Student{name='" + name + "', group='" + group + "', course=" + course + ", avg=" + String.format("%.2f", average()) + "}";
        }
    }

    static void removeLowAndPromote(List<Student> students) {
        for (int i = 0; i < students.size(); ) {
            Student s = students.get(i);
            if (s.average() < 3.0) {
                students.remove(i);
            } else {
                s.promote();
                i++;
            }
        }
    }

    static void printStudents(List<Student> students, int course) {
        System.out.println("Students on course " + course + ":");
        boolean any = false;
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(" - " + s.getName());
                any = true;
            }
        }
        if (!any) System.out.println(" (none)");
    }

    public static void main(String[] args) {
        System.out.println("=== PART 1: myCollection tasks ===");
        List<Integer> myCollection = fillRandom(10, -50, 50);
        System.out.println("Initial myCollection: " + myCollection);
        swapMinMax(myCollection);
        System.out.println("After swapMinMax:     " + myCollection);
        insertRandomBeforeFirstNegative(myCollection);
        System.out.println("After insert 3-digit: " + myCollection);
        insertZeroBetweenOppositeSigns(myCollection);
        System.out.println("After insert zeros:   " + myCollection);
        SplitResult sr = splitK(myCollection, 4);
        System.out.println("list1 (first k):      " + sr.list1);
        System.out.println("list2 (rest reversed):" + sr.list2);
        boolean removed = removeLastEven(myCollection);
        System.out.println(removed ? "Removed last even.   " : "No even to remove.    " + myCollection);
        if (removed) System.out.println("After remove even:    " + myCollection);
        removeAfterFirstMinimum(myCollection);
        System.out.println("After remove after min:" + myCollection);

        System.out.println("\n=== PART 2: Students ===");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice",   "A-101", 1, List.of(4, 5, 3)));
        students.add(new Student("Bob",     "A-101", 1, List.of(2, 3, 2)));
        students.add(new Student("Charlie", "B-202", 2, List.of(5, 4, 4)));
        students.add(new Student("Diana",   "B-202", 3, List.of(3, 3, 3)));
        System.out.println("Initial students:");
        for (Student s : students) System.out.println(" " + s);
        removeLowAndPromote(students);
        System.out.println("\nAfter removeLowAndPromote:");
        for (Student s : students) System.out.println(" " + s);
        System.out.println();
        printStudents(students, 2);
        printStudents(students, 4);
    }
}
