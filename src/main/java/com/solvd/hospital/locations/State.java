package com.solvd.hospital.locations;

import com.solvd.hospital.enums.StateName;

public class State extends Location{
    private Country country;
    private String acronym;

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
        return super.getName();
    }

    public State(StateName name, Country country) {
        super.setName(name.getName());
        this.acronym = name.getAcronym();
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }
}
