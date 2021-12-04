package com.solvd.hospital.interfaces.models.employees;

import com.solvd.hospital.exceptions.InvalidEmployeeException;
import com.solvd.hospital.models.employees.Employee;

public interface IEmployee {
    void work();
    void rest();
    void retrieveEmployee(Employee employee) throws InvalidEmployeeException;
}
