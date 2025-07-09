package module07.homework1;

public class SalariedEmployee extends Employee implements Payment{
    private double monthlySalary;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeeId, double monthlySalary, String socialSecurityNumber) {
        super(employeeId);
        this.monthlySalary = monthlySalary;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


}
