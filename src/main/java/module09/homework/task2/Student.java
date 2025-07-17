package module09.homework.task2;

import module09.homework.task1.FullName;
import module09.homework.task1.Person;

public class Student extends Person {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", Course: " + this.course;
    }

    @Override
    public String activity() {
        return "I study at university.";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
