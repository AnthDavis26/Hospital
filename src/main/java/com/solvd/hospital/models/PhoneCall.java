package com.solvd.hospital.models;

import java.util.Optional;

public class PhoneCall {
    private String senderNumber;

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

    public Optional<String> getSenderNumber() {
        return Optional.of(senderNumber);
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }
}
