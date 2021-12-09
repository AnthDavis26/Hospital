package com.solvd.hospital.models.buildings;

import com.solvd.hospital.locations.Address;

import java.util.Objects;

public abstract class Building {
	private Address address;
	private String name;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Building building = (Building) o;
		return Objects.equals(address, building.address) && Objects.equals(name, building.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, name);
	}

	@Override
	public String toString() {
		return address.toString();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
