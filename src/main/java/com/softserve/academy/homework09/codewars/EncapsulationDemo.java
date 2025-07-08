package com.softserve.academy.homework09.codewars;

public class EncapsulationDemo {
    private int number;
    private String stringValue;
    private Object anObject;

    public EncapsulationDemo() {
    }

    public EncapsulationDemo(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        if (stringValue == null) {
            throw new IllegalArgumentException("stringValue is null");
        }
        this.stringValue = stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public void setAnObject(Object anObject) {
        if (anObject == null) {
            throw new IllegalArgumentException("An object is null");
        }
        this.anObject = anObject;
    }

    @Override
    public String toString() {
        return "EncapsulationDemo{" +
                "number=" + number +
                ", stringValue='" + stringValue + '\'' +
                ", anObject=" + anObject +
                '}';
    }
}
