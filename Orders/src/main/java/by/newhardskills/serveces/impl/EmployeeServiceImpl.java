package by.newhardskills.serveces.impl;

import by.newhardskills.serveces.EmployeeService;
import domain.entitties.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getEmployeeWithTargetSalary(List<Employee> employees, final int targetSalary) {

        return employees.stream()
                .filter(employee -> employee.getSalary()==targetSalary)
                .collect(Collectors.toList());

    }
}
