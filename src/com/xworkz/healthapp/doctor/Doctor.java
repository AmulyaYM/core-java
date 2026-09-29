package com.xworkz.healthapp.doctor;

public class Doctor {

    private int doctorId;
    private String doctorName;
    private String designation;
    private String experience;
    private int fees;
    private String specilization;

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getSpecilization() {
        return specilization;
    }

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName +
                ", designation='" + designation +
                ", experience='" + experience +
                ", fees=" + fees +
                ", specilization='" + specilization +
                '}';
    }

    public void setSpecilization(String principalDirector, String s, String s1, String s2) {
    }

    public void setSpecilization(String ancology, String gastrology) {
    }
}