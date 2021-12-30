package com.solvd.hospital.models;

import java.util.Optional;

public abstract class Equipment {
	private String brand;
	private String model;

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

	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Optional<String> getModel() {
		return Optional.of(model);
	}

	public void setModel(String model) {
		this.model = model;
	}
}
