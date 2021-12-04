package com.solvd.hospital.exceptions;

public class UndiagnosedPatientException extends Exception {
	public UndiagnosedPatientException() {
		super("This patient has not been diagnosed.");
	}
}
