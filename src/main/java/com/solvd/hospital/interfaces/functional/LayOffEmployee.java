package com.solvd.hospital.interfaces.functional;

import com.solvd.hospital.models.employees.Employee;

@FunctionalInterface
public interface LayOffEmployee {
    void statement(Employee employee);
}
