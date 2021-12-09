package com.solvd.hospital.runner;

import com.solvd.hospital.exceptions.InvalidEmployeeException;
import com.solvd.hospital.exceptions.InvalidWeightException;
import com.solvd.hospital.exceptions.UndiagnosedPatientException;
import com.solvd.hospital.models.Diagnosis;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.Prescription;
import com.solvd.hospital.models.TestResult;
import com.solvd.hospital.models.employees.Doctor;
import com.solvd.hospital.models.employees.Nurse;
import com.solvd.hospital.models.employees.Receptionist;
import com.solvd.hospital.utils.LinkedList;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.*;

public class Runner {
    private static final Logger logger = LogManager.getLogger(Runner.class);

	public static void main(String[] args) throws IOException, ParseException {
		// Doctor-patient treatment simulation
		Doctor doctor = new Doctor();
		Nurse nurse = new Nurse();
		Receptionist receptionist = new Receptionist();
		Patient patient = new Patient();
		TestResult testResult = new TestResult();
		Diagnosis diagnosis = new Diagnosis();
		String instructions = "Instruction stuff";
		Prescription prescription = new Prescription();

		receptionist.addToWaitingLine(patient);
		nurse.callInPatient(patient);

		try {
			nurse.logWeightOf(patient, 1.0);
		} catch (InvalidWeightException e) {
			logger.error(e.getLocalizedMessage());
		}

		nurse.askAboutSymptoms(patient);
		patient.tellSymptomsTo(nurse);

		try {
			nurse.retrieveEmployee(doctor);
		} catch (InvalidEmployeeException e) {
			logger.error(e.getLocalizedMessage());
		}

		patient.waitForDoctor();
		doctor.askAboutSymptoms(patient);
		patient.tellSymptomsTo(doctor);
		doctor.retrieveTestResult(testResult);
		doctor.diagnose(patient, diagnosis);
		doctor.giveInstructionsTo(patient, instructions);

		try {
			doctor.prescribe(patient, prescription);
			doctor.orderLabTestsFor(patient);
		} catch (UndiagnosedPatientException e) {
			logger.error(e.getLocalizedMessage());
		}

		// LinkedList implementation test
		LinkedList<Integer> linkedList = new LinkedList<>();

		for (int i = 1; i <= 25; i++)
			linkedList.add(i);

		linkedList.forEach(
				(n) -> logger.info(n)
		);

		// Output unique words in file and their frequencies
		File file = FileUtils.getFile("src/main/resources/stuff.txt");
		String[] fileWords = StringUtils.split(
				StringUtils.lowerCase(
				RegExUtils.replacePattern(
				(FileUtils.readFileToString(file, StandardCharsets.UTF_8)),
						"(\\'s)|(\\d(st|nd|rd|th))|\\d|[^\\w]", " "))
							// Omit possessions, numbers, and non-word symbols
		);

		SortedMap<String, Integer> map = new TreeMap<>();

		Arrays.stream(fileWords).forEach(
				(s) -> map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1)
		);

		map.entrySet().forEach(
			(e) -> logger.info(e)
		);
	}
}