package com.example.payment;

/** Співробітник із фіксованою місячною оплатою */
public class SalariedEmployee extends Employee {
    private String socialSecurityNumber;
    private double monthlySalary;  // фіксована місячна оплата

    public SalariedEmployee(String employeeId,
                            String name,
                            String socialSecurityNumber,
                            double monthlySalary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        // формула: average monthly salary = fixed monthly payment
        return monthlySalary;
    }


}
