package com.solvd.hospital.models;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {
	private List<String> prescriptions;

	enum Condition {
		STABLE,
		CRITICAL,
		DECEASED
	}

	public Patient() {
		prescriptions = new ArrayList<String>();
	}
	
	public List<String> getPrescriptions() {
		return prescriptions;
	}
	
	public void setPrescriptions(List<String> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public void addPrescription(String prescription) {
		this.prescriptions.add(prescription);
	}
	
	public void removePrescription(String prescription) {
		// ...
	}

	public void tellSymptomsTo(Person person) {
		// ...
	}

	public void waitForDoctor() {
		// ...
	}
}
