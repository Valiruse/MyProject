package companie.departamente;

import employee.Employee;

public interface Departments {

   void departmentMembers();

   void removeMembers();

   void addMembers();

   Employee searchByName();

   Employee searchByBadgeNumber();

}
