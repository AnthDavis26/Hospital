package com.solvd.hospital.models.departments;

import com.solvd.hospital.models.samples.BloodSample;
import com.solvd.hospital.models.samples.UrineSample;

import java.util.List;

public class Lab extends Department {
	private List<BloodSample> bloodSamples;
	private List<UrineSample> urineSamples;

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
	
	public List<BloodSample> getBloodSamples() {
		return bloodSamples;
	}
	
	public void setBloodSamples(List<BloodSample> bloodSamples) {
		this.bloodSamples = bloodSamples;
	}
	
	public List<UrineSample> getUrineSamples() {
		return urineSamples;
	}
	
	public void setUrineSamples(List<UrineSample> urineSamples) {
		this.urineSamples = urineSamples;
	}
}
