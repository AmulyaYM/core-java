package com.xworkz.healthapp;

import com.xworkz.healthapp.doctor.Doctor;
import com.xworkz.healthapp.fortis.Hospital;


public class HospitalRunner {
    public static void main(String[] args) {

        Hospital hospital= new Hospital();
        Doctor  doctor =new Doctor();
        doctor.setDoctorId(1);
        doctor.setDoctorName("annop");
        doctor.setDesignation("pricipal");
        doctor.setExperience("40 years");
        doctor.setFees(3000);
        doctor.setSpecilization("ancology","gastrology");


        Doctor  doctor1 =new Doctor();
        doctor1.setDoctorId(1);
        doctor1.setDoctorName("Amit");
        doctor1.setDesignation("chairman");
        doctor1.setExperience("40 years");
        doctor1.setFees(5000);
        doctor1.setSpecilization("Principal Director "," HOD Lap GI","GI Onco, Bariatric "," MIS Surgery | FMRI Gurgaon");

        hospital.addDoctor(doctor);
        hospital.addDoctor(doctor1);
        hospital.getAllDoctors();
    }
}
