package companie.departamente.productie;

import companie.departamente.productie.Productie;
import employee.Employee;

import java.util.List;

public class Asamblare extends Productie {

    private String departmentName;
    private List<Employee> employees;


    public Asamblare(String activity,String departmentName,List<Employee> employees) {
        super(activity);
        this.departmentName=departmentName;
        this.employees=employees;
    }

    public String getDepartmentName() {
        return departmentName;
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
