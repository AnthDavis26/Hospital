package com.solvd.hospital.interfaces.models.employees;

import com.solvd.hospital.exceptions.UndiagnosedPatientException;
import com.solvd.hospital.models.Diagnosis;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.Prescription;

public interface IDoctor extends IEmployee {
    void diagnose(Patient patient, Diagnosis diagnosis);
    void prescribe(Patient patient, Prescription prescription) throws UndiagnosedPatientException;
    void startAppointment();
    void endAppointment();
    void readForm();
    void orderProcedure(String procedure);
    void askAboutSymptoms(Patient patient);
    void runTestsOn(Patient patient);
    void retrieveTestResult();
    void giveInstructionsTo(Patient patient, String instructions);
    void orderLabTestsFor(Patient patient);
}
