package module07.homework1;

public class ContractEmployee extends Employee implements Payment{
    private double hourlyRate;
    private double hoursWorked;
    private String federalTaxIdmember;

    public ContractEmployee(String employeeId, double hourlyRate, double hoursWorked, String federalTaxIdmember) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }



}
