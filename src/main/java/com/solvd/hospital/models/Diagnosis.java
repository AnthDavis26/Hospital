package com.solvd.hospital.models;

import com.solvd.hospital.enums.PatientCondition;

public class Diagnosis {
    private String ailment;
    private String prognosis;
    private PatientCondition patientCondition;

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

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public String getPrognosis() {
        return prognosis;
    }

    public void setPrognosis(String prognosis) {
        this.prognosis = prognosis;
    }

    public PatientCondition getPatientCondition() {
        return patientCondition;
    }

    public void setPatientCondition(PatientCondition patientCondition) {
        this.patientCondition = patientCondition;
    }
}
