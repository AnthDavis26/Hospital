package com.solvd.hospital.models.departments;

import java.util.Queue;

import com.solvd.hospital.interfaces.models.departments.IEmergency;
import com.solvd.hospital.models.Patient;

public class Emergency extends Department implements IEmergency {
	private Queue<Patient> patientQueue;

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

	public Queue<Patient> getPatientQueue() {
		return patientQueue;
	}

	public void setPatientQueue(Queue<Patient> queue) {
		this.patientQueue = queue;
	}

	@Override
	public void addPatientToLine(Patient patient) {
		patientQueue.add(patient);
	}

	@Override
	public void dequeuePatientLine() {
		patientQueue.remove();
	}
}
