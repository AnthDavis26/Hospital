package com.solvd.hospital;

import com.solvd.hospital.exceptions.InvalidEmployeeException;
import com.solvd.hospital.exceptions.InvalidWeightException;
import com.solvd.hospital.exceptions.UndiagnosedPatientException;
import com.solvd.hospital.models.Diagnosis;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.Prescription;
import com.solvd.hospital.models.employees.Doctor;
import com.solvd.hospital.models.employees.Nurse;
import com.solvd.hospital.models.employees.Receptionist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PatientSimulation {
        public static final Logger logger = LogManager.getLogger(PatientSimulation.class);

        public static void main(String[] args) {
            Doctor doctor = new Doctor();
            Nurse nurse = new Nurse();
            Receptionist receptionist = new Receptionist();
            Patient patient = new Patient();
            Diagnosis diagnosis = new Diagnosis();
            String instructions = "Instruction stuff";
            Prescription prescription = new Prescription();

            receptionist.addToWaitingLine(patient);
            nurse.callInPatient(patient);

            try {
                nurse.logWeightOf(patient, 1.0);
            } catch (InvalidWeightException e) {
                logger.error(e);
            }

            nurse.askAboutSymptoms(patient);
            patient.tellSymptomsTo(nurse);

            try {
                nurse.retrieveEmployee(doctor);
            } catch (InvalidEmployeeException e) {
                logger.error(e);
            }

            patient.waitForDoctor();
            doctor.askAboutSymptoms(patient);
            patient.tellSymptomsTo(doctor);
            doctor.runTestsOn(patient);
            doctor.retrieveTestResult();
            doctor.diagnose(patient, diagnosis);
            doctor.giveInstructionsTo(patient, instructions);

            try {
                doctor.prescribe(patient, prescription);
                doctor.orderLabTestsFor(patient);
            } catch (UndiagnosedPatientException e) {
                logger.error(e);
            }
        }
}
