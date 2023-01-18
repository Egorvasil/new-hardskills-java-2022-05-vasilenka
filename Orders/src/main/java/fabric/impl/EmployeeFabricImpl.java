package fabric.impl;

import domain.entitties.Employee;
import fabric.AbstractFabric;

public class EmployeeFabricImpl implements AbstractFabric<Employee> {
    @Override
    public Employee create() {
        return new Employee(0, null, 0, 0, 0); //mok object - empty object
    }
}
