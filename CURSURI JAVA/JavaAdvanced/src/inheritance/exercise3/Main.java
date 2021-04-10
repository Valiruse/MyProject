package inheritance.exercise3;


public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("John", 6500.5, 2015, "AA123456C");

        System.out.println(e1.getNationalInsuranceNumber());
        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.getName());
        System.out.println(e1.getStartWorkingYear());
    }
}
