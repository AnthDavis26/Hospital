package com.solvd.hospital.models.vehicles;

import com.solvd.hospital.locations.Address;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.buildings.Hospital;

public class Ambulance extends Vehicle {

	public void carryPatient(Patient patient) {
		// ...;
	}

	public void driveToDestination(Address address) {
		// ...
	}  
	
	public void driveToDestination(Hospital hospital) {
		// ...
	}
	
	public void toggleSiren() {
		// ...
	}
}
