package com.solvd.hospital.interfaces.models.employees;

import com.solvd.hospital.models.Equipment;

@FunctionalInterface
public interface ITechnician {
    void repairEquipment(Equipment equipment);
}
