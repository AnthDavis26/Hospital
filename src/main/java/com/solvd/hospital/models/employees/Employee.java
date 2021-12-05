package com.solvd.hospital.models.employees;

import com.solvd.hospital.exceptions.InvalidEmployeeException;
import com.solvd.hospital.interfaces.models.employees.IEmployee;
import com.solvd.hospital.models.Person;

public abstract class Employee extends Person implements IEmployee {
	private float monthlyPay;

	@Override
	public void work() {
	}

	@Override
	public void rest() {
	}

	@Override
	public void retrieveEmployee(Employee employee)
			throws InvalidEmployeeException {
	}

	public float getMonthlyPay() {
		return monthlyPay;
	}

	public void setMonthlyPay(float pay) {
		this.monthlyPay = pay;
	}
}
