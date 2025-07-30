public class Developer extends Employee {
    private String position;

    /**
     * Розробник має всі поля Employee плюс поле position.
     */
    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        // Використовуємо геттери батьківського класу
        return String.format(
                "Name: %s, Age: %d years, Position: %s, Salary: %.2f",
                getName(), getAge(), position, getSalary()
        );
    }
}
