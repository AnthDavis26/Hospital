package com.solvd.hospital.models.departments;

import java.util.List;
import com.solvd.hospital.models.samples.BloodSample;
import com.solvd.hospital.models.samples.UrineSample;

public class Lab extends Department {
	private List<BloodSample> bloodSamples;
	private List<UrineSample> urineSamples;
	
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
