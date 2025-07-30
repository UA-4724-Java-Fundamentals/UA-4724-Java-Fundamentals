public class Main {
    public static void main(String[] args) {
        // Звичайний співробітник
        Employee e = new Employee("Olena", 28, 50000.00);
        // Розробник
        Developer d = new Developer(
                "Taras",
                32,
                32735.35,
                "Average Java developer"
        );

        // Друкуємо звіт для обох
        System.out.println( e.report() );
        System.out.println( d.report() );
    }
}
