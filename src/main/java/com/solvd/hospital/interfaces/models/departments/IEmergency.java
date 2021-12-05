package com.solvd.hospital.interfaces.models.departments;

import com.solvd.hospital.models.Patient;

import java.util.Queue;

public interface IEmergency extends IDepartment {
	void addPatientToLine(Patient patient);
	void dequeuePatientLine();
}
