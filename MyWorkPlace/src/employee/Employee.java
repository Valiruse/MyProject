package employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee implements Person {

    private String fullName;
    private int salary;
    private String position;
    private int badgeNumber;

    public Employee(String fullName, int salary, String position, int badgeNumber) {
        this.fullName = fullName;
        this.salary = salary;
        this.position = position;
        this.badgeNumber = badgeNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    @Override
    public void prezenta() {

    }

    @Override
    public void decontCombustibil() {

    }

    @Override
    public void masaTipDePlata() {

    }

}
