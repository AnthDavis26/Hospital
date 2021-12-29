package com.solvd.hospital.models;

public class Prescription {
    private Patient patient;
    private String dosage;
    private String intakeInstructions;
    private String possibleSideEffects;

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

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getIntakeInstructions() {
        return intakeInstructions;
    }

    public void setIntakeInstructions(String intakeInstructions) {
        this.intakeInstructions = intakeInstructions;
    }

    public String getPossibleSideEffects() {
        return possibleSideEffects;
    }

    public void setPossibleSideEffects(String possibleSideEffects) {
        this.possibleSideEffects = possibleSideEffects;
    }
}
