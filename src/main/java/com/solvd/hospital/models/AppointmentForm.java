package com.solvd.hospital.models;

import java.util.Calendar;

import com.solvd.hospital.models.buildings.Hospital;
import com.solvd.hospital.models.employees.Doctor;
import com.solvd.hospital.models.employees.Nurse;

public class AppointmentForm {
	private Patient patient;
	private Calendar date;
	private Doctor doctor;
	private Nurse nurse;
	private String notes;
	
	public Patient getPatient() {
		return patient;
	}
	
	public Calendar getDate() {
		return date;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	
	public Nurse returnNurse() {
		return nurse;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
