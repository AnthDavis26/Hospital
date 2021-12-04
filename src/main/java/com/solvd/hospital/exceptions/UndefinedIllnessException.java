package com.solvd.hospital.exceptions;

public class UndefinedIllnessException extends Exception {
	public UndefinedIllnessException() {
		super("This illness is undefined.");
	}
}
