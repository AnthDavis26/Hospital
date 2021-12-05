package com.solvd.hospital.models;

import com.solvd.hospital.interfaces.models.IPatient;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person implements IPatient {
	enum Condition {
		STABLE,
		CRITICAL,
		DECEASED
	}

	public void tellSymptomsTo(Person person) {
		// ...
	}

	public void waitForDoctor() {
		// ...
	}
}
