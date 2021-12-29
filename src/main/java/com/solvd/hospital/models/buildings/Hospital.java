package com.solvd.hospital.models.buildings;

import com.solvd.hospital.exceptions.InvalidBedCapacityException;
import com.solvd.hospital.exceptions.InvalidEmployeeCountException;

public class Hospital extends Building {
    private int bedCapacity;
    private int usedBedsCount;
    private int employeeCount;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(int bedCapacity) throws InvalidBedCapacityException {
        if (bedCapacity < 0)
            throw new InvalidBedCapacityException();
        else
            this.bedCapacity = bedCapacity;
    }

    public int getUsedBedsCount() {
        return usedBedsCount;
    }

    public void setUsedBedsCount (int usedBedsCount) throws InvalidBedCapacityException {
        if (usedBedsCount > bedCapacity)
            throw new InvalidBedCapacityException();
        else
            this.usedBedsCount = usedBedsCount;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) throws InvalidEmployeeCountException {
        if (employeeCount < 0)
            throw new InvalidEmployeeCountException();

        this.employeeCount = employeeCount;
    }
}

