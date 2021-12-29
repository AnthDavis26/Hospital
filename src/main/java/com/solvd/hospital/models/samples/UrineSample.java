package com.solvd.hospital.models.samples;

public class UrineSample extends Sample {
	private float acidityLevel;
	private float bloodLevel;
	private float proteinLevel;
	private float sugarLevel;

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

	public float getAcidityLevel() {
		return acidityLevel;
	}

	public void setAcidityLevel(float acidityLevel) {
		this.acidityLevel = acidityLevel;
	}

	public float getBloodLevel() {
		return bloodLevel;
	}

	public void setBloodLevel(float bloodLevel) {
		this.bloodLevel = bloodLevel;
	}

	public float getProteinLevel() {
		return proteinLevel;
	}

	public void setProteinLevel(float proteinLevel) {
		this.proteinLevel = proteinLevel;
	}

	public float getSugarLevel() {
		return sugarLevel;
	}

	public void setSugarLevel(float sugarLevel) {
		this.sugarLevel = sugarLevel;
	}
}
