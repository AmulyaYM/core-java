package com.xworkz.healthapp.fortis;

import com.xworkz.healthapp.doctor.Doctor;

public class Hospital {
    private Doctor[] doctors = new Doctor[5];
    int index;
    public boolean addDoctor(Doctor doctor) {
        boolean isAdded = false;

        boolean isDoctorIdValid = false;
        boolean isDoctorNameValid = false;

        int doctorId = doctor.getDoctorId();
        if (doctorId > 0) {
            isDoctorIdValid = true;
        } else System.out.println("invalid doctor id");

        String doctorName = doctor.getDoctorName();
        if (doctorName != null) {
            isDoctorNameValid = true;
        } else System.out.println("invalid doctor name ");


        if (isDoctorIdValid && isDoctorNameValid) {
            doctors[index++] = doctor;
            isAdded = true;

        }
    return isAdded;
    }
    public void getAllDoctors(){
        for(Doctor doctor:doctors){
            System.out.println(doctor);
        }
    }
}
