package com.solvd.hospital.models.employees;

import com.solvd.hospital.exceptions.UndiagnosedPatientException;
import com.solvd.hospital.interfaces.models.employees.IDoctor;
import com.solvd.hospital.models.Diagnosis;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.Prescription;
import com.solvd.hospital.models.TestResult;

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

	public void startAppointment() {
	}
	
	public void endAppointment() {
	}
	
	public void readForm() {
	}
	
	public void orderProcedure(String procedure) {
	}
	
	public void prescribe(Patient patient, String prescription)
			throws UndiagnosedPatientException
	{
		patient.addPrescription(prescription);
	}

	public void askAboutSymptoms(Patient patient) {
	}

	public TestResult runTestsOn(Patient patient) {
		return new TestResult();
	}

	public void retrieveTestResult(TestResult testResult) {
	}

	public void giveInstructionsTo(Patient patient, String instructions) {
	}

	public void orderLabTestsFor(Patient patient) {
	}
}
