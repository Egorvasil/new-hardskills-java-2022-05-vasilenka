package by.newhardskills.serveces;

import domain.entitties.Employee;

import java.util.List;

/**
 *  API for find Employee with target salary
 */
public interface EmployeeService {

    /*
    * @param employees - all employees in company
    * @param targetSalary - the salary we want to see for certain employee
    * */

    List<Employee>getEmployeeWithTargetSalary(List<Employee>employees, final int targetSalary);
}
