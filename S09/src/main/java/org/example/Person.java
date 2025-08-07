
public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age      = age;
    }

    public FullName getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }


    public String info() {
        return String.format(
                "First name: %s, Last name: %s, Age: %d",
                fullName.getFirstName(),
                fullName.getLastName(),
                age
        );
    }


    public abstract String activity();
}
