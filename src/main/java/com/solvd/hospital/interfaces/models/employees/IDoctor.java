package com.solvd.hospital.interfaces.models.employees;

import com.solvd.hospital.exceptions.UndiagnosedPatientException;
import com.solvd.hospital.models.Diagnosis;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.Prescription;
import com.solvd.hospital.models.TestResult;

public interface IDoctor extends IEmployee {
    void diagnose(Patient patient, Diagnosis diagnosis);
    void prescribe(Patient patient, Prescription prescription) throws UndiagnosedPatientException;
    void startAppointment();
    void endAppointment();
    void readForm();
    void orderProcedure(String procedure);
    void prescribe(Patient patient, String prescription) throws UndiagnosedPatientException;
    void askAboutSymptoms(Patient patient);
    TestResult runTestsOn(Patient patient);
    void retrieveTestResult(TestResult testResult);
    void giveInstructionsTo(Patient patient, String instructions);
    void orderLabTestsFor(Patient patient);
}
