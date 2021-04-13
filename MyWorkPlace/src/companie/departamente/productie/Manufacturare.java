package companie.departamente.productie;

import employee.Employee;

import java.util.List;

public class Manufacturare extends Productie{

    private String departmentName;
    private List<Employee> employees;

    public Manufacturare(String activity,String departmentName,List<Employee>employees) {
        super(activity);
        this.departmentName=departmentName;
        this.employees=employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public void departmentMembers() {

    }

    @Override
    public void removeMembers() {

    }

    @Override
    public void addMembers() {

    }

    @Override
    public Employee searchByName() {
        return null;
    }

    @Override
    public Employee searchByBadgeNumber() {
        return null;
    }

}
