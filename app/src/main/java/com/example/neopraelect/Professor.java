package com.example.neopraelect;

import androidx.annotation.NonNull;

public class Professor {
    private String instructor;
    private String location;
    private String officeHours;

    public Professor(String instructor, String location, String officeHours) {
        this.instructor = instructor;
        this.location = location;
        this.officeHours = officeHours;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getLocation() {
        return location;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    @NonNull
    @Override
    public String toString() {
        return instructor + " " + location + " " + officeHours;
    }
}
