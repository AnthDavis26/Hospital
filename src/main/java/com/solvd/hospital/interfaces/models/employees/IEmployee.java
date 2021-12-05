package com.solvd.hospital.interfaces.models.employees;

import com.solvd.hospital.exceptions.InvalidEmployeeException;
import com.solvd.hospital.interfaces.models.IPerson;
import com.solvd.hospital.models.employees.Employee;

public interface IEmployee extends IPerson {
    void work();
    void rest();
    void retrieveEmployee(Employee employee) throws InvalidEmployeeException;
}
