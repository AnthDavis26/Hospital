package com.solvd.hospital.models.employees;

import com.solvd.hospital.exceptions.InvalidWeightException;
import com.solvd.hospital.interfaces.models.employees.INurse;
import com.solvd.hospital.models.Patient;

public class Nurse extends Employee implements INurse {
	@Override
	public void performPhysicalExam(Patient patient) {

	}

	@Override
	public void endPhysicalExam() {
		// ...
	}

	@Override
	public void callInPatient(Patient patient) {

	}

	public void logWeightOf (Patient patient, Double weight)
			throws InvalidWeightException {
		if (weight <= 0)
			throw new InvalidWeightException();
	}

	public void askAboutSymptoms(Patient patient) {
		// ...
	}

	@Override
	public void work() {

	}

	@Override
	public void rest() {
	}

	@Override
	public void eat() {

	}

	@Override
	public void sleep() {

	}
}
