package com.solvd.hospital;

import com.solvd.hospital.enums.PatientCondition;
import com.solvd.hospital.interfaces.functional.GetAge;
import com.solvd.hospital.interfaces.functional.LayOffEmployee;
import com.solvd.hospital.interfaces.functional.NoArgumentFunction;
import com.solvd.hospital.interfaces.functional.StringToDoubleFunction;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.models.PhoneCall;
import com.solvd.hospital.models.employees.Receptionist;
import com.solvd.hospital.models.employees.Technician;
import com.solvd.hospital.utils.LinkedList;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntPredicate;
import java.util.function.UnaryOperator;

public class LambdasAndStreams {
    public static final Logger LOGGER = LogManager.getLogger(LambdasAndStreams.class);

    public static void main(String args[]) throws IOException {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 1; i <= 25; i++)
            linkedList.add(i);

        linkedList.forEach(
                (n) -> LOGGER.info(n)
        );

        Receptionist receptionist = new Receptionist();
        Technician technician = new Technician();
        technician.setFirstName("Anthony");

        PhoneCall[] phoneCalls = new PhoneCall[25];
        Arrays.stream(phoneCalls).forEach(
                (p) -> receptionist.transferPhoneCall(p, technician)
        );

        // Output unique words in file and their counts
        File file = FileUtils.getFile("src/main/resources/input.txt");
        String[] fileWords = StringUtils.split(
                StringUtils.lowerCase(
                RegExUtils.replacePattern(
                (FileUtils.readFileToString(file, StandardCharsets.UTF_8)),
                    "(\\'s)|(\\d(st|nd|rd|th))|\\d|[^\\w]", " "))
                // Omit possessions, numbers, and numeric representations
        );

        SortedMap<String, Integer> map = new TreeMap<>();

        Arrays.stream(fileWords).forEach(
                (s) -> map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1)
        );

        // Output result
        FileUtils.write(FileUtils.getFile("src/main/resources/output.txt"),
                map.entrySet().toString(), StandardCharsets.UTF_8);

        // java.util.functions
        BiConsumer<Integer, Double> bc = (x, y) -> LOGGER.info(x + y);
        bc.accept(25,50.2);

        DoubleToLongFunction dtl = (x) -> Double.doubleToLongBits(x);
        LOGGER.info(dtl.applyAsLong(1234.5678));

        IntPredicate ip = (x) -> x > 10;
        LOGGER.info(ip.test(5));

        UnaryOperator<Patient> makePatientHealthy = (x) -> {
            x.setCondition(PatientCondition.GOOD);
            return x;
        };

        Patient patient = new Patient();
        patient.setCondition(PatientCondition.SERIOUS);
        patient = makePatientHealthy.apply(patient);

        // Custom functional interfaces
        StringToDoubleFunction stf = (x) -> x.length() * 3.14;
        LOGGER.info(stf.convert("Some String"));

        LayOffEmployee loe = (x) -> LOGGER.info(x.getFirstName() + " has been laid off.");
        loe.statement(technician);

        GetAge<LinkedList<Integer>> ga = (x) -> x.size() + 100;
        LOGGER.info(ga.years(linkedList));

        NoArgumentFunction naf = ()-> LOGGER.info("This will always be performed when called.");
        naf.task();
    }
}
