public class Main {
    public static void main(String[] args) {
        // Два початкові студенти
        FullName fn1 = new FullName("Іван", "Петренко");
        Student   s1 = new Student(fn1, 20, 2);

        FullName fn2 = new FullName("Марія", "Коваленко");
        Student   s2 = new Student(fn2, 22, 3);

        // Виводимо info() та activity() для обох
        System.out.println(s1.info());
        System.out.println("Activity: " + s1.activity());
        System.out.println();
        System.out.println(s2.info());
        System.out.println("Activity: " + s2.activity());

        // Клонуємо першого студента, змінюємо курс
        Student s3 = s1.clone();
        s3.setCourse(4);

        System.out.println("\nCloned and modified:");
        System.out.println(s3.info());
        System.out.println("Activity: " + s3.activity());
    }
}
