package com.solvd.hospital.models.vehicles;

import com.solvd.hospital.locations.Address;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.buildings.Hospital;

public class Ambulance extends Vehicle {
	private boolean sirenStatus;

	public Ambulance() {
		sirenStatus = false;
	}

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

	public boolean isSirenOn() {
		return getSirenStatus();
	}

	public boolean getSirenStatus() {
		return sirenStatus;
	}

	public void setSirenStatus(boolean sirenStatus) {
		this.sirenStatus = sirenStatus;
	}

	public void toggleSiren() {
		sirenStatus = !sirenStatus;
	}

	public void carryPatient(Patient patient) {
	}

	public void driveToDestination(Address address) {
	}  
	
	public void driveToDestination(Hospital hospital) {
	}
}
