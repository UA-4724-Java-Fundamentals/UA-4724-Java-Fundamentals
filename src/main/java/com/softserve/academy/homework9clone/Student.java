package com.softserve.academy.homework9clone;

public class Student extends Person implements Cloneable{
    private int cours;

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public Student(String fn, String ln, int age, int cours) {
        super();
        this.cours = cours;
        setFullname(new FullName(fn, ln));
        setAge(age);

    }

    @Override
    public String info(){
        return ("First name: " + getFullname().getFirstName() +
                " Last name: " + getFullname().getLastName() +
                " Age: " + getAge() +
                " Cours: " + cours);

    }

    @Override
    public String activity() {
        return "\"I study at university";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
