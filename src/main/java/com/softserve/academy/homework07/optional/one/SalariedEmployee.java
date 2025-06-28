package com.softserve.academy.homework07.optional.one;

public class SalariedEmployee extends Employee implements Payment {
    private double hourlyRate;
    private double numberOfHoursWorked;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String name, double hourlyRate, double numberOfHoursWorked, String socialSecurityNumber) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * numberOfHoursWorked;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name " + this.getName() +
                " hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
