import java.util.*;

public class CollectionsHomework {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> res = new HashSet<>();
        if (set1 != null) res.addAll(set1);
        if (set2 != null) res.addAll(set2);
        return res;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> res = new HashSet<>();
        if (set1 == null || set2 == null) return res;
        for (T v : set1) if (set2.contains(v)) res.add(v);
        return res;
    }

    static class Student {
        private final String name;
        private int course;

        public Student(String name, int course) {
            this.name = name;
            this.course = course;
        }
        public String getName() { return name; }
        public int getCourse() { return course; }

        public static void printStudents(List<Student> students, int course) {
            System.out.println("Students of course " + course + ":");
            for (Iterator<Student> it = students.iterator(); it.hasNext();) {
                Student s = it.next();
                if (s.getCourse() == course) System.out.println(" - " + s.getName());
            }
        }

        public static final Comparator<Student> BY_NAME =
                Comparator.comparing(Student::getName, Comparator.nullsFirst(String::compareTo));

        public static final Comparator<Student> BY_COURSE_THEN_NAME =
                Comparator.comparingInt(Student::getCourse).thenComparing(BY_NAME);

        @Override public String toString() { return name + " (course " + course + ")"; }
    }

    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5,6));
        System.out.println("Union:      " + union(s1, s2));
        System.out.println("Intersect:  " + intersect(s1, s2));

        Map<String,String> personMap = new LinkedHashMap<>();
        personMap.put("Ivanov", "Ivan");
        personMap.put("Petrenko", "Orest");
        personMap.put("Shevchenko", "Taras");
        personMap.put("Melnyk", "Andriy");
        personMap.put("Kovalenko", "Oksana");
        personMap.put("Boyko", "Ivan");
        personMap.put("Tkachenko", "Olena");
        personMap.put("Kravets", "Ihor");
        personMap.put("Bondar", "Orest");
        personMap.put("Lysenko", "Serhii");

        System.out.println("\npersonMap:");
        for (Map.Entry<String,String> e : personMap.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());

        Set<String> seen = new HashSet<>();
        boolean hasSameFirstNames = false;
        for (String fn : personMap.values()) if (!seen.add(fn)) { hasSameFirstNames = true; break; }
        System.out.println("\nHas duplicates by first name: " + hasSameFirstNames);

        String nameToRemove = "Orest";
        String keyToRemove = null;
        for (Map.Entry<String,String> e : personMap.entrySet())
            if (e.getValue().equals(nameToRemove)) { keyToRemove = e.getKey(); break; }
        if (keyToRemove != null) personMap.remove(keyToRemove);

        System.out.println("\nAfter removing first '" + nameToRemove + "':");
        for (Map.Entry<String,String> e : personMap.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 2));
        students.add(new Student("Bob", 1));
        students.add(new Student("Charlie", 3));
        students.add(new Student("Diana", 2));
        students.add(new Student("Evan", 1));

        System.out.println("\nStudents (original): " + students);

        List<Student> byName = new ArrayList<>(students);
        byName.sort(Student.BY_NAME);
        System.out.println("Sorted by name:      " + byName);

        List<Student> byCourse = new ArrayList<>(students);
        byCourse.sort(Student.BY_COURSE_THEN_NAME);
        System.out.println("Sorted by course:    " + byCourse);

        System.out.println();
        Student.printStudents(students, 2);
    }
}
