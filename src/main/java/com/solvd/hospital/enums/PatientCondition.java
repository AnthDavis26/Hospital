package com.solvd.hospital.enums;

public enum PatientCondition {
    STABLE (0),
    CRITICAL (1),
    DECEASED (2);

    private final int conditionLevel;

    PatientCondition(int conditionLevel) {
        this.conditionLevel = conditionLevel;
    }
}
