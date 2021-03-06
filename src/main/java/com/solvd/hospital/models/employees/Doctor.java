package com.solvd.hospital.models.employees;

import com.solvd.hospital.exceptions.UndiagnosedPatientException;
import com.solvd.hospital.interfaces.models.employees.IDoctor;
import com.solvd.hospital.models.Diagnosis;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.Prescription;

public class Doctor extends Employee implements IDoctor {
	@Override
	public void diagnose(Patient patient, Diagnosis diagnosis) {
	}

	@Override
	public void prescribe(Patient patient, Prescription prescription)
			throws UndiagnosedPatientException {
	}

	@Override
	public void work() {
	}

	@Override
	public void rest() {
	}

	@Override
	public void startAppointment() {
	}

	@Override
	public void endAppointment() {
	}

	@Override
	public void readForm() {
	}

	@Override
	public void orderProcedure(String procedure) {
	}

	@Override
	public void askAboutSymptoms(Patient patient) {
	}

	@Override
	public void runTestsOn(Patient patient) {
	}

	@Override
	public void retrieveTestResult() {
	}

	@Override
	public void giveInstructionsTo(Patient patient, String instructions) {
	}

	@Override
	public void orderLabTestsFor(Patient patient) {
	}

	@Override
	public void eat() {

	}

	@Override
	public void sleep() {

	}
}
