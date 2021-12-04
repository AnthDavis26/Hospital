package com.solvd.hospital.locations;

import com.solvd.hospital.exceptions.InvalidGeographyException;

public class Address {
	private String street;
	private String unit;
	private City city;
	private String zip;
	
	public String getStreet() throws InvalidGeographyException {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getUnit() throws InvalidGeographyException {
		return unit;
	}
	
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	public City getCity() throws InvalidGeographyException {
		return city;
	}
	
	public void setCity(City city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
}
