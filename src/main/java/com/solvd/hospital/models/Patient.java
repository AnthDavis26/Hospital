package com.solvd.hospital.models;

import com.solvd.hospital.interfaces.models.IPatient;

public class Patient extends Person implements IPatient {

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
}
