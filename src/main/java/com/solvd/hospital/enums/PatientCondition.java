package com.solvd.hospital.enums;

public enum PatientCondition {
    UNDETERMINED(0), GOOD(1), FAIR(2), SERIOUS(3), CRITICAL(4);

    private int severityLevel;

    PatientCondition(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }
}
