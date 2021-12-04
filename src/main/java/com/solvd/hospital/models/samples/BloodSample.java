package com.solvd.hospital.models.samples;

import com.solvd.hospital.models.buildings.Hospital;

public class BloodSample extends Hospital {
	private String bloodType;
	
	public String getBloodType() {
		return bloodType;
	}
	
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
}
