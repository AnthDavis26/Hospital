package com.solvd.hospital.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.List;
import java.time.LocalDate;

import com.solvd.hospital.enums.Sex;
import com.solvd.hospital.interfaces.models.IPerson;
import com.solvd.hospital.locations.Address;
import org.apache.commons.lang3.time.DateUtils;

public abstract class Person implements IPerson {
	private String firstName;
	private String middleName;
	private String lastName;
	private String maidenName;
	private String prefix;
	private String suffix;
	private String gender;
	private String pronoun;
	private Sex sex;
	private String race;
	private String phone;
	private Double weightLbs;
	private Address address;
	private LocalDate dateOfBirth;
	private List<String> allergies;
	private List<String> illnesses;

	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getMaidenName() {
		return maidenName;
	}
	
	public void setMaidenName(String maidenName) {
		this.maidenName = maidenName;
	}
	
	public String getPrefix() {
		return prefix;
	}
	
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	
	public String getSuffix() {
		return suffix;
	}
	
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPronoun() {
		return pronoun;
	}
	
	public void setPronoun(String pronoun) {
		this.pronoun = pronoun;
	}
	
	public Sex getSex() {
		return sex;
	}
	
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
	public String getRace() {
		return race;
	}
	
	public void setRace(String race) {
		this.race = race;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Double getWeightLbs() {
		return weightLbs;
	}
	
	public void setWeightLbs(Double weightLbs) {
		this.weightLbs = weightLbs;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) throws ParseException {
		this.dateOfBirth = DateUtils.parseDate(dateOfBirth, "MMM dd yyyy", "MMM dd, yyyy",
						"M/dd/yyyy").toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public void setDateOfBirth(LocalDate localDate) {
		this.dateOfBirth = localDate;
	}
	
	public List<String> getAllergies() {
		return allergies;
	}
	
	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	public List<String> getIllnesses() {
		return illnesses;
	}
	
	public void setIllnesses(List<String> illnesses) {
		this.illnesses = illnesses;
	}
}
