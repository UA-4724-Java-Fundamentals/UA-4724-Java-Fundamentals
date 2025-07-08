package com.softserve.academy.homework09.practicaltask;

public class Department implements Cloneable {
    private final String name;
    private Address address = new Address();

    public Department(String name, String city, String street, int buildingNumber) {
        this.name = name;
        this.address.setCity(city);
        this.address.setStreet(street);
        this.address.setBuildingNumber(buildingNumber);
    }

    public String getName() {
        return name;
    }

    private class Address implements Cloneable {
        private String street;
        private String city;
        private int buildingNumber;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getBuildingNumber() {
            return buildingNumber;
        }

        public void setBuildingNumber(int buildingNumber) {
            this.buildingNumber = buildingNumber;
        }

        @Override
        protected Address clone() {
            Address clone = new Address();
            clone.setStreet(this.street);
            clone.setCity(this.city);
            clone.setBuildingNumber(this.buildingNumber);
            return clone;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", buildingNumber=" + buildingNumber +
                    '}';
        }
    }

    public void setCity(String city) {
        this.address.setCity(city);
    }

    @Override
    protected Department clone() throws CloneNotSupportedException {
        Department clone = (Department) super.clone();
        clone.address = this.address.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
