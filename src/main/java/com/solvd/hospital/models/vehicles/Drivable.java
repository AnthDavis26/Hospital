package com.solvd.hospital.models.vehicles;

import com.solvd.hospital.interfaces.models.vehicles.IDrivable;

abstract class Drivable implements IDrivable {
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

	public void drive() {

	}

	public void brake() {

	}
}
