package com.softserve.academy.module01.Homework09.PracticalTasks;

public class Department implements Cloneable {
    private String name;
    public Address adress;

    public Department(String name, Address adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public Address getAdress() {
        return adress;
    }

    static class Address {
        private String city;
        private String street;
        private int house;

        public Address(String city, String street, int house) {
            this.city = city;
            this.street = street;
            this.house = house;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getHouse() {
            return house;
        }
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Department" +
                " name='" + name + '\'' +
                " \nadress:\n CITY:" + adress.city +
                "\n STREET:" + adress.street +
                "\n HOUSE:" + adress.house;
    }

    @Override
    public Object clone() {
        Address address = new Address(this.getAdress().getCity(),
                this.getAdress().getStreet(),
                this.getAdress().getHouse());
        return new Department(this.getName(), address);
    }
}
