package com.solvd.hospital.runner;

import com.solvd.hospital.exceptions.InvalidEmployeeException;
import com.solvd.hospital.exceptions.InvalidWeightException;
import com.solvd.hospital.exceptions.UndiagnosedPatientException;
import com.solvd.hospital.models.*;
import com.solvd.hospital.models.employees.Doctor;
import com.solvd.hospital.models.employees.Nurse;
import com.solvd.hospital.models.employees.Receptionist;
import com.solvd.hospital.utils.DeadlockThread1;
import com.solvd.hospital.utils.DeadlockThread2;
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
import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

public class Runner {
    public static final Logger logger = LogManager.getLogger(Runner.class);

	public static void main(String[] args) throws IOException, ParseException {
		// Doctor-patient treatment simulation

		// LinkedList implementation test
		LinkedList<Integer> linkedList = new LinkedList<>();

		for (int i = 1; i <= 25; i++)
			linkedList.add(i);

		linkedList.forEach(
				(n) -> logger.info(n)
		);

		// Output unique words in file and their counts
		File file = FileUtils.getFile("src/main/resources/input.txt");
		String[] fileWords = StringUtils.split(
				StringUtils.lowerCase(
				RegExUtils.replacePattern(
				(FileUtils.readFileToString(file, StandardCharsets.UTF_8)),
						"(\\'s)|(\\d(st|nd|rd|th))|\\d|[^\\w]", " "))
							// Omit possessions, numbers, and numeric interpretations
		);

		SortedMap<String, Integer> map = new TreeMap<>();

		Arrays.stream(fileWords).forEach(
				(s) -> map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1)
		);

		// Output result
		FileUtils.write(FileUtils.getFile("src/main/resources/output.txt"),
				map.entrySet().toString(), StandardCharsets.UTF_8);

		// Deadlock example
		DeadlockThread1 thread1 = new DeadlockThread1();
		DeadlockThread2 thread2 = new DeadlockThread2();

		thread1.start();
		thread2.start();
	}
}