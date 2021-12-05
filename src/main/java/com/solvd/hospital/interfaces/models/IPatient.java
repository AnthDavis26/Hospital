package com.solvd.hospital.interfaces.models;

import com.solvd.hospital.models.Person;

public interface IPatient extends IPerson {
    void tellSymptomsTo(Person person);
    void waitForDoctor();
}
