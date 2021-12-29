package com.solvd.hospital.locations;

import com.solvd.hospital.exceptions.InvalidGeographyException;

import java.util.Objects;
import java.util.Optional;

public class Address extends Location {
	private String street;
	private String number;
	private String unit;
	private City city;
	private String zip;

	public Address(String number, String street, City city, String zip) {
		this(number, street, "", city, zip);
	}

	public Address(String number, String street, String unit, City city, String zip) {
		this.number = number;
		this.street = street;
		this.unit = unit;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Address address = (Address) o;
		return Objects.equals(street, address.street) && Objects.equals(number, address.number)
				&& Objects.equals(unit, address.unit) && Objects.equals(city, address.city)
				&& Objects.equals(zip, address.zip);
	}

	@Override
	public String toString() {
		return number + " " + street + (!Objects.equals(unit, "") ? "\n" + unit : "")
				+ "\n" + city + ", " + city.getState() + "\n" + zip + "\n" + city.getState().getCountry();
	}
	
	public String getStreet() throws InvalidGeographyException {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public Optional<String> getUnit() {
		return Optional.ofNullable(unit);
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
