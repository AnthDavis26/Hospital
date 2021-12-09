package com.solvd.hospital.models;

import com.solvd.hospital.enums.PatientCondition;
import com.solvd.hospital.interfaces.models.IPatient;

public class Patient extends Person implements IPatient {
	private PatientCondition condition;

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public void tellSymptomsTo(Person person) {
		// ...
	}

	@Override
	public void waitForDoctor() {
		// ...
	}

	@Override
	public void takeMedication() {
	}

	@Override
	public void eat() {
	}

	@Override
	public void sleep() {
	}

	public PatientCondition getCondition() {
		return condition;
	}
}
