package by.newhardskills;

import by.newhardskills.serveces.EmployeeService;
import by.newhardskills.serveces.impl.EmployeeServiceImpl;
import domain.entitties.Employee;
import fabric.AbstractFabric;
import fabric.impl.EmployeeFabricImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static EmployeeService employeeService = new EmployeeServiceImpl();

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        AbstractFabric<Employee>employeeAbstractFabric = new EmployeeFabricImpl();

        Class.forName("org.postgresql.Driver");
        Connection connection =
                DriverManager
                        .getConnection("jdbc:postgresql://localhost:5432/postgres",
                                "postgres","egorka02+");
        Statement statement = connection.createStatement();
        statement.executeQuery("SELECT * FROM Employee");
        ResultSet resultSet = statement.getResultSet();
        List<Employee>employeeList = new ArrayList<>();
        while (resultSet.next()){

            //Start initialize values of mock-object in accordance with entry database
            Employee employee = employeeAbstractFabric.create(); //created mock-object
            employee.setId(resultSet.getInt("id"));
            employee.setName(resultSet.getString("name"));
            employee.setSalary(resultSet.getInt("salary"));
            employee.setGenderId(resultSet.getInt("gender_id"));
            employee.setDepartmentId(resultSet.getInt("department_id"));
            employeeList.add(employee);
            //ORM technology
        }
        checkOurEmployees(employeeList);

        List<Employee> resultList = filterEmployees(employeeList,1500 );
        System.out.println();
        resultList.forEach(System.out::println);

    }
    public static void checkOurEmployees(List<?>employees){
        employees.forEach(System.out::println);
    }
    public static List<Employee> filterEmployees(List<Employee>employees, final int targetSalary){
        return employeeService.getEmployeeWithTargetSalary(employees, targetSalary);
    }
}
