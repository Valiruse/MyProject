package inheritance.exercise3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee extends Person {

    private double annualSalary;
    private int startWorkingYear;
    private String nationalInsuranceNumber;


    public Employee(String name, double annualSalary, int startWorkingYear, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.startWorkingYear = startWorkingYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;

    }

    public double getAnnualSalary() {

        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartWorkingYear() {
        return startWorkingYear;
    }

    public void setStartWorkingYear(int startWorkingYear) {
        this.startWorkingYear = startWorkingYear;
    }

    public String getNationalInsuranceNumber() {
        if (isValidNationalInsuranceNumber(nationalInsuranceNumber)) {
            return nationalInsuranceNumber;

        }
        throw new IllegalStateException("Invalid National Insurance Number");

    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "annualSalary=" + getAnnualSalary() +
                ", startWorkingYear=" + getStartWorkingYear() +
                ", nationalInsuranceNumber='" + getNationalInsuranceNumber() + '\'' +
                '}';
    }

    public boolean isValidNationalInsuranceNumber(String nationalInsuranceNumber) {
        Pattern pattern = Pattern.compile("^\\s*[a-zA-Z]{2}(?:\\s*\\d\\s*){6}[a-zA-Z]?\\s*$");
        Matcher matcher = pattern.matcher(nationalInsuranceNumber);

        return matcher.matches();

    }
}
