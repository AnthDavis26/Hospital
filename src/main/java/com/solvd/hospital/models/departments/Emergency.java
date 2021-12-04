package com.solvd.hospital.models.departments;

import java.util.Queue;
import com.solvd.hospital.models.Patient;

public class Emergency extends Department {
	private Queue<Patient> patientQueue;
	
	public Queue<Patient> getPatientQueue() {
		return patientQueue;
	}
	
	public void setPatientQueue(Queue<Patient> queue) {
		this.patientQueue = queue;
	}
	
	public void addPatientToLine(Patient patient) {
		patientQueue.add(patient);
	}
	
	public void dequeuePatientLine() {
		patientQueue.remove();
	}
}
