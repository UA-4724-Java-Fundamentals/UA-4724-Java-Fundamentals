package module09.homework.task1;

public abstract class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String info() {
        return "First name: " + this.fullName.getFirstName() +
                ", Last name: " + this.fullName.getLastName() +
                ", Age: " + this.age;
    }

    public abstract String activity();

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.fullName = this.fullName.clone();
        return cloned;
    }
}


