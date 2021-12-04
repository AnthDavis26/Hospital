package com.solvd.hospital.interfaces.models.employees;

import com.solvd.hospital.models.Patient;

public interface INurse extends IEmployee {
    void performPhysicalExam(Patient patient);
    void endPhysicalExam();
    void callInPatient(Patient patient);
}
