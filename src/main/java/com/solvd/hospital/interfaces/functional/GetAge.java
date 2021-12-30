package com.solvd.hospital.interfaces.functional;

@FunctionalInterface
public interface GetAge<T> {
    Integer years(T arg);
}
