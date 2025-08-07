package com.example.payment;

/** Контрактний (погодинний) співробітник */
public class ContractEmployee extends Employee {
    private String federalTaxIdMember;
    private double hourlyRate;    // ставка за годину
    private double hoursWorked;   // відпрацьовано годин

    public ContractEmployee(String employeeId,
                            String name,
                            String federalTaxIdMember,
                            double hourlyRate,
                            double hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        // average monthly salary = hourly rate * number of hours worked
        return hourlyRate * hoursWorked;
    }


}
