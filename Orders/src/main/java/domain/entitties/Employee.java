package domain.entitties;

import base.DomainObject;

public class Employee extends DomainObject {
    private String name;
    private int salary;
    private int genderId;
    private int departmentId;

    public Employee(int id, String name, int salary, int genderId, int departmentId) {
        super(id);
        this.name = name;
        this.salary = salary;
        this.genderId = genderId;
        this.departmentId = departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setGenderId(int genderId) {
        this.genderId = genderId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getGenderId() {
        return genderId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", genderId=" + genderId +
                ", departmentId=" + departmentId +
                '}';
    }
}
