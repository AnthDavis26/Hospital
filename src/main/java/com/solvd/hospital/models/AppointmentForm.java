package com.solvd.hospital.models;

import java.time.LocalDate;
import com.solvd.hospital.models.employees.Doctor;
import com.solvd.hospital.models.employees.Nurse;

public class AppointmentForm {
	private Patient patient;
	private LocalDate date;
	private Doctor doctor;
	private Nurse nurse;
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
}
