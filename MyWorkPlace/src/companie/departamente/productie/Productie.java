package companie.departamente.productie;

import companie.departamente.Departments;
import employee.Employee;

public abstract class Productie implements Departments {

    private String activity;

    public Productie(String activity){
        this.activity=activity;
    }

    public String getActivity() {
        return activity;
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
