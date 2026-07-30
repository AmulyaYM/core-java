class DoctorRunner {
    public static void main(String[] doct) {
Doctor doctor1 = new Doctor();
doctor1.doctorId = 1;
doctor1.doctorName = "Anoop Misra";
doctor1.designation = "Executive Chairman Fortis C Doc | Fortis C-Doc";
String doctor1Specializations[] = {"Diabetology/Endocrinology", "Endocrinology"};
doctor1.specializations = doctor1Specializations;
doctor1.experience = "40 Years";
doctor1.fees = 2800;

System.out.println("Page-1 Doctors details are:");

System.out.println("Doctor ID is " + doctor1.doctorId);
System.out.println("Doctor name is " + doctor1.doctorName);
System.out.println("Designation is " + doctor1.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor1.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor1.experience);
System.out.println("Fees for treatment is " + doctor1.fees);

Doctor doctor2 = new Doctor();
doctor2.doctorId = 2;
doctor2.doctorName = "(Prof.) Amit Javed";
doctor2.designation = "Principal Director & HOD Lap GI, GI Onco, Bariatric & MIS Surgery | FMRI Gurgaon";
String doctor2Specializations[] = {
    "General Surgery",
    "Bariatric Surgery",
    "Robotic Surgery",
    "General Surgery",
    "General and Minimal Access Surgery",
    "General and Laparoscopic Surgery",
    "Oncology",
    "GI Oncology",
    "Surgical Oncology"
};
doctor2.specializations = doctor2Specializations;
doctor2.experience = "25 Years";
doctor2.fees = 1500;

System.out.println("Doctor ID is " + doctor2.doctorId);
System.out.println("Doctor name is " + doctor2.doctorName);
System.out.println("Designation is " + doctor2.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor2.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor2.experience);
System.out.println("Fees for treatment is " + doctor2.fees);


Doctor doctor3 = new Doctor();
doctor3.doctorId = 3;
doctor3.doctorName = "(Col) Manjinder Sandhu";
doctor3.designation = "Principal Director Cardiology | FMRI Gurgaon";
String doctor3Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor3.specializations = doctor3Specializations;
doctor3.experience = "35 Years";
doctor3.fees = 2000;

System.out.println("Doctor ID is " + doctor3.doctorId);
System.out.println("Doctor name is " + doctor3.doctorName);
System.out.println("Designation is " + doctor3.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor3.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor3.experience);
System.out.println("Fees for treatment is " + doctor3.fees);

Doctor doctor4 = new Doctor();
doctor4.doctorId = 4;
doctor4.doctorName = "Ajay Agarwal";
doctor4.designation = "Chairman - Internal Medicine | Fortis Noida";
String doctor4Specializations[] = {
    "Support Specialties",
    "General Physician",
    "Internal Medicine",
    "Internal Medicine"
};
doctor4.specializations = doctor4Specializations;
doctor4.experience = "25 Years";
doctor4.fees = 1400;

System.out.println("Doctor ID is " + doctor4.doctorId);
System.out.println("Doctor name is " + doctor4.doctorName);
System.out.println("Designation is " + doctor4.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor4.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor4.experience);
System.out.println("Fees for treatment is " + doctor4.fees);

Doctor doctor5 = new Doctor();
doctor5.doctorId = 5;
doctor5.doctorName = "Ajay Kaul";
doctor5.designation = "Chairman Cardiac Science | Fortis Noida";
String doctor5Specializations[] = {
    "Cardiac Sciences",
    "Vascular Surgery",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)",
    "Paediatric CTVS (Cardiothoracic and Vascular Surgery)",
    "Heart Transplant"
};
doctor5.specializations = doctor5Specializations;
doctor5.experience = "38 Years";
doctor5.fees = 1600;

System.out.println("Doctor ID is " + doctor5.doctorId);
System.out.println("Doctor name is " + doctor5.doctorName);
System.out.println("Designation is " + doctor5.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor5.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor5.experience);
System.out.println("Fees for treatment is " + doctor5.fees);


Doctor doctor6 = new Doctor();
doctor6.doctorId = 6;
doctor6.doctorName = "Ajay Kumar Kriplani";
doctor6.designation = "Principal Director & HOD Lap GI, GI Onco, Bariatric & MIS Surgery | FMRI Gurgaon";
String doctor6Specializations[] = {
    "General Surgery",
    "General and Minimal Access Surgery",
    "General and Laparoscopic Surgery",
    "General Surgery",
    "Gastroenterology and Hepatobiliary Sciences",
    "Metabolic & Bariatric Surgery",
    "GI, Minimal Access and Bariatric Surgery",
    "Robotic Surgery"
};
doctor6.specializations = doctor6Specializations;
doctor6.experience = "40 Years";
doctor6.fees = 1500;

System.out.println("Doctor ID is " + doctor6.doctorId);
System.out.println("Doctor name is " + doctor6.doctorName);
System.out.println("Designation is " + doctor6.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor6.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor6.experience);
System.out.println("Fees for treatment is " + doctor6.fees);

Doctor doctor7 = new Doctor();
doctor7.doctorId = 7;
doctor7.doctorName = "Ajit Singh Narula";
doctor7.designation = "Principal Director Nephrology | Fortis Okhla";
String doctor7Specializations[] = {
    "Organ Transplant",
    "Kidney Transplant",
    "Nephrology",
    "Nephrology"
};
doctor7.specializations = doctor7Specializations;
doctor7.experience = "40 Years";
doctor7.fees = 2000;

System.out.println("Doctor ID is " + doctor7.doctorId);
System.out.println("Doctor name is " + doctor7.doctorName);
System.out.println("Designation is " + doctor7.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor7.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor7.experience);
System.out.println("Fees for treatment is " + doctor7.fees);


Doctor doctor8 = new Doctor();
doctor8.doctorId = 8;
doctor8.doctorName = "Amite Pankaj Aggarwal";
doctor8.designation = "Principal Director & HOD - Orthopaedics | Fortis Shalimar Bagh";
String doctor8Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Orthopaedics",
    "Sports Medicine",
    "Robotic and Computer navigated Joint reconstruction"
};
doctor8.specializations = doctor8Specializations;
doctor8.experience = "27 Years";
doctor8.fees = 1500;

System.out.println("Doctor ID is " + doctor8.doctorId);
System.out.println("Doctor name is " + doctor8.doctorName);
System.out.println("Designation is " + doctor8.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor8.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor8.experience);
System.out.println("Fees for treatment is " + doctor8.fees);


Doctor doctor9 = new Doctor();
doctor9.doctorId = 9;
doctor9.doctorName = "Anil Mandhani";
doctor9.designation = "Chairman-Urology | FMRI Gurgaon";
String doctor9Specializations[] = {
    "Urology",
    "Uro-Oncology",
    "Robotic Surgery",
    "Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor9.specializations = doctor9Specializations;
doctor9.experience = "35 Years";
doctor9.fees = 2000;

System.out.println("Doctor ID is " + doctor9.doctorId);
System.out.println("Doctor name is " + doctor9.doctorName);
System.out.println("Designation is " + doctor9.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor9.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor9.experience);
System.out.println("Fees for treatment is " + doctor9.fees);


Doctor doctor10 = new Doctor();
doctor10.doctorId = 10;
doctor10.doctorName = "Anil Saxena";
doctor10.designation = "Chairman Cardiology | Fortis Okhla";
String doctor10Specializations[] = {
    "Cardiac Sciences",
    "Electrophysiology"
};
doctor10.specializations = doctor10Specializations;
doctor10.experience = "35 Years";
doctor10.fees = 2000;

System.out.println("Doctor ID is " + doctor10.doctorId);
System.out.println("Doctor name is " + doctor10.doctorName);
System.out.println("Designation is " + doctor10.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor10.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor10.experience);
System.out.println("Fees for treatment is " + doctor10.fees);


Doctor doctor11 = new Doctor();
doctor11.doctorId = 11;
doctor11.doctorName = "Anita Saxena";
doctor11.designation = "Executive Director Paediatric Cardiology | Fortis Okhla";
String doctor11Specializations[] = {
    "Paediatrics",
    "Paediatric Cardiac Sciences"
};
doctor11.specializations = doctor11Specializations;
doctor11.experience = "40 Years";
doctor11.fees = 2000;

System.out.println("Doctor ID is " + doctor11.doctorId);
System.out.println("Doctor name is " + doctor11.doctorName);
System.out.println("Designation is " + doctor11.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor11.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor11.experience);
System.out.println("Fees for treatment is " + doctor11.fees);



Doctor doctor12 = new Doctor();
doctor12.doctorId = 12;
doctor12.doctorName = "Ankur BAHL";
doctor12.designation = "Principal Director Medical Oncology | FMRI Gurgaon";
String doctor12Specializations[] = {
    "Oncology",
    "Oncology",
    "Medical Oncology"
};
doctor12.specializations = doctor12Specializations;
doctor12.experience = "20 Years";
doctor12.fees = 1800;

System.out.println("Doctor ID is " + doctor12.doctorId);
System.out.println("Doctor name is " + doctor12.doctorName);
System.out.println("Designation is " + doctor12.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor12.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor12.experience);
System.out.println("Fees for treatment is " + doctor12.fees);



Doctor doctor13 = new Doctor();
doctor13.doctorId = 13;
doctor13.doctorName = "Arvind Kumar";
doctor13.designation = "Principal Director & HOD Paediatrics | Fortis Shalimar Bagh";
String doctor13Specializations[] = {
    "Paediatrics",
    "Paediatrics"
};
doctor13.specializations = doctor13Specializations;
doctor13.experience = "42 Years";
doctor13.fees = 1500;

System.out.println("Doctor ID is " + doctor13.doctorId);
System.out.println("Doctor name is " + doctor13.doctorName);
System.out.println("Designation is " + doctor13.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor13.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor13.experience);
System.out.println("Fees for treatment is " + doctor13.fees);


Doctor doctor14 = new Doctor();
doctor14.doctorId = 14;
doctor14.doctorName = "Arvind Kumar Khurana";
doctor14.designation = "Principal Director Gastroenterology | FMRI Gurgaon";
String doctor14Specializations[] = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology",
    "Gastroenterology and Hepatobiliary Sciences"
};
doctor14.specializations = doctor14Specializations;
doctor14.experience = "35 Years";
doctor14.fees = 1500;

System.out.println("Doctor ID is " + doctor14.doctorId);
System.out.println("Doctor name is " + doctor14.doctorName);
System.out.println("Designation is " + doctor14.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor14.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor14.experience);
System.out.println("Fees for treatment is " + doctor14.fees);


Doctor doctor15 = new Doctor();
doctor15.doctorId = 15;
doctor15.doctorName = "Ashok Seth";
doctor15.designation = "Chairman Cardiac Science | Fortis Okhla";
String doctor15Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor15.specializations = doctor15Specializations;
doctor15.experience = "40 Years";
doctor15.fees = 7500;

System.out.println("Doctor ID is " + doctor15.doctorId);
System.out.println("Doctor name is " + doctor15.doctorName);
System.out.println("Designation is " + doctor15.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor15.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor15.experience);
System.out.println("Fees for treatment is " + doctor15.fees);

Doctor doctor16 = new Doctor();
doctor16.doctorId = 16;
doctor16.doctorName = "Atul Mathur";
doctor16.designation = "Chairman Cardiology | Fortis Okhla";
String doctor16Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor16.specializations = doctor16Specializations;
doctor16.experience = "34 Years";
doctor16.fees = 2000;

System.out.println("Doctor ID is " + doctor16.doctorId);
System.out.println("Doctor name is " + doctor16.doctorName);
System.out.println("Designation is " + doctor16.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor16.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor16.experience);
System.out.println("Fees for treatment is " + doctor16.fees);


Doctor doctor17 = new Doctor();
doctor17.doctorId = 17;
doctor17.doctorName = "Atul Mishra";
doctor17.designation = "Chairman – Orthopaedics & Joint Replacement | Fortis Noida";
String doctor17Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Orthopaedics",
    "Sports Medicine",
    "Robotic and Computer navigated Joint reconstruction"
};
doctor17.specializations = doctor17Specializations;
doctor17.experience = "27 Years";
doctor17.fees = 1500;

System.out.println("Doctor ID is " + doctor17.doctorId);
System.out.println("Doctor name is " + doctor17.doctorName);
System.out.println("Designation is " + doctor17.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor17.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor17.experience);
System.out.println("Fees for treatment is " + doctor17.fees);


Doctor doctor18 = new Doctor();
doctor18.doctorId = 18;
doctor18.doctorName = "Atul Kumar Mittal";
doctor18.designation = "Chairman ENT | FMRI Gurgaon";
String doctor18Specializations[] = {
    "ENT",
    "ENT (Ear, Nose and Throat)"
};
doctor18.specializations = doctor18Specializations;
doctor18.experience = "33 Years";
doctor18.fees = 2000;

System.out.println("Doctor ID is " + doctor18.doctorId);
System.out.println("Doctor name is " + doctor18.doctorName);
System.out.println("Designation is " + doctor18.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor18.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor18.experience);
System.out.println("Fees for treatment is " + doctor18.fees);


Doctor doctor19 = new Doctor();
doctor19.doctorId = 19;
doctor19.doctorName = "Balkar Singh";
doctor19.designation = "Principal Director Anaesthesiology | FMRI Gurgaon";
String doctor19Specializations[] = {
    "Support Specialties",
    "Anaesthesia"
};
doctor19.specializations = doctor19Specializations;
doctor19.experience = "30 Years";
doctor19.fees = 2500;

System.out.println("Doctor ID is " + doctor19.doctorId);
System.out.println("Doctor name is " + doctor19.doctorName);
System.out.println("Designation is " + doctor19.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor19.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor19.experience);
System.out.println("Fees for treatment is " + doctor19.fees);


Doctor doctor20 = new Doctor();
doctor20.doctorId = 20;
doctor20.doctorName = "Biswajyoti Hazarika";
doctor20.designation = "Principal Director Surgical Oncology | FMRI Gurgaon";
String doctor20Specializations[] = {
    "Oncology",
    "Head and Neck Oncosurgery",
    "Surgical Oncology",
    "Oncology"
};
doctor20.specializations = doctor20Specializations;
doctor20.experience = "25 Years";
doctor20.fees = 1800;

System.out.println("Doctor ID is " + doctor20.doctorId);
System.out.println("Doctor name is " + doctor20.doctorName);
System.out.println("Designation is " + doctor20.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor20.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor20.experience);
System.out.println("Fees for treatment is " + doctor20.fees);


Doctor doctor21 = new Doctor();
doctor21.doctorId = 21;
doctor21.doctorName = "Gourdas Choudhuri";
doctor21.designation = "Chairman-Gastroenterology | FMRI Gurgaon";
String doctor21Specializations[] = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology"
};
doctor21.specializations = doctor21Specializations;
doctor21.experience = "42 Years";
doctor21.fees = 2000;

System.out.println("Doctor ID is " + doctor21.doctorId);
System.out.println("Doctor name is " + doctor21.doctorName);
System.out.println("Designation is " + doctor21.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor21.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor21.experience);
System.out.println("Fees for treatment is " + doctor21.fees);


Doctor doctor22 = new Doctor();
doctor22.doctorId = 22;
doctor22.doctorName = "Gurinder Bedi";
doctor22.designation = "Principal Director & HOD - Orthopaedics | Fortis Vasant Kunj";
String doctor22Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Spine Surgery",
    "Orthopaedics",
    "Paediatric Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer navigated Joint reconstruction"
};
doctor22.specializations = doctor22Specializations;
doctor22.experience = "30 Years";
doctor22.fees = 1800;

System.out.println("Doctor ID is " + doctor22.doctorId);
System.out.println("Doctor name is " + doctor22.doctorName);
System.out.println("Designation is " + doctor22.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor22.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor22.experience);
System.out.println("Fees for treatment is " + doctor22.fees);


Doctor doctor23 = new Doctor();
doctor23.doctorId = 23;
doctor23.doctorName = "Ishita B.Sen";
doctor23.designation = "Principal Director Nuclear Medicine | FMRI Gurgaon";
String doctor23Specializations[] = {
    "Nuclear Medicine",
    "Nuclear Medicine",
    "Oncology",
    "Oncology"
};
doctor23.specializations = doctor23Specializations;
doctor23.experience = "26 Years";
doctor23.fees = 2500;

System.out.println("Doctor ID is " + doctor23.doctorId);
System.out.println("Doctor name is " + doctor23.doctorName);
System.out.println("Designation is " + doctor23.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor23.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor23.experience);
System.out.println("Fees for treatment is " + doctor23.fees);


Doctor doctor24 = new Doctor();
doctor24.doctorId = 24;
doctor24.doctorName = "Jaideep Bansal";
doctor24.designation = "Principal Director & HOD Neurology | Fortis Shalimar Bagh";
String doctor24Specializations[] = {
    "Neurology",
    "Neurology"
};
doctor24.specializations = doctor24Specializations;
doctor24.experience = "30 Years";
doctor24.fees = 2200;

System.out.println("\nDoctor ID is " + doctor24.doctorId);
System.out.println("Doctor name is " + doctor24.doctorName);
System.out.println("Designation is " + doctor24.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor24.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor24.experience);
System.out.println("Fees for treatment is " + doctor24.fees);


Doctor doctor25 = new Doctor();
doctor25.doctorId = 25;
doctor25.doctorName = "Jayant Arora";
doctor25.designation = "Principal Director & Unit Head Orthopaedics | FMRI Gurgaon";
String doctor25Specializations[] = {
    "Orthopaedics",
    "Orthopaedics",
    "Sports Medicine",
    "Orthopaedics and Spine Surgery",
    "Orthopaedic Oncology",
    "Robotic and Computer navigated Joint reconstruction"
};
doctor25.specializations = doctor25Specializations;
doctor25.experience = "26 Years";
doctor25.fees = 2500;

System.out.println("Doctor ID is " + doctor25.doctorId);
System.out.println("Doctor name is " + doctor25.doctorName);
System.out.println("Designation is " + doctor25.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor25.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor25.experience);
System.out.println("Fees for treatment is " + doctor25.fees);


Doctor doctor26 = new Doctor();
doctor26.doctorId = 26;
doctor26.doctorName = "Kameshwar Prasad";
doctor26.designation = "Principal Director Neurology | Fortis Vasant Kunj";
String doctor26Specializations[] = {
    "Neurology",
    "Neurology"
};
doctor26.specializations = doctor26Specializations;
doctor26.experience = "40 Years";
doctor26.fees = 1800;

System.out.println("Doctor ID is " + doctor26.doctorId);
System.out.println("Doctor name is " + doctor26.doctorName);
System.out.println("Designation is " + doctor26.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor26.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor26.experience);
System.out.println("Fees for treatment is " + doctor26.fees);

Doctor doctor27 = new Doctor();
doctor27.doctorId = 27;
doctor27.doctorName = "Krishan Chugh";
doctor27.designation = "Principal Director & HOD- Pediatrics | FMRI Gurgaon";
String doctor27Specializations[] = {
    "Paediatrics",
    "Paediatrics"
};
doctor27.specializations = doctor27Specializations;
doctor27.experience = "32 Years";
doctor27.fees = 2000;

System.out.println("Doctor ID is " + doctor27.doctorId);
System.out.println("Doctor name is " + doctor27.doctorName);
System.out.println("Designation is " + doctor27.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor27.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor27.experience);
System.out.println("Fees for treatment is " + doctor27.fees);


Doctor doctor28 = new Doctor();
doctor28.doctorId = 28;
doctor28.doctorName = "Krishna Subramony Iyer";
doctor28.designation = "Chairman & Head Paediatric and Congenital Heart Surgery | Fortis Okhla";
String doctor28Specializations[] = {
    "Paediatrics",
    "Paediatric CTVS (Cardiothoracic and Vascular Surgery)",
    "Paediatric Cardiac Sciences"
};
doctor28.specializations = doctor28Specializations;
doctor28.experience = "40 Years";
doctor28.fees = 1500;

System.out.println("Doctor ID is " + doctor28.doctorId);
System.out.println("Doctor name is " + doctor28.doctorName);
System.out.println("Designation is " + doctor28.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor28.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor28.experience);
System.out.println("Fees for treatment is " + doctor28.fees);


Doctor doctor29 = new Doctor();
doctor29.doctorId = 29;
doctor29.doctorName = "Manoj Miglani";
doctor29.designation = "Principal Director Orthopaedics | Fortis Vasant Kunj";
String doctor29Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Spine Surgery",
    "Orthopaedics",
    "Orthopaedics and Joint Replacement"
};
doctor29.specializations = doctor29Specializations;
doctor29.experience = "20 Years";
doctor29.fees = 1500;

System.out.println("Doctor ID is " + doctor29.doctorId);
System.out.println("Doctor name is " + doctor29.doctorName);
System.out.println("Designation is " + doctor29.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor29.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor29.experience);
System.out.println("Fees for treatment is " + doctor29.fees);


Doctor doctor30 = new Doctor();
doctor30.doctorId = 30;
doctor30.doctorName = "Manoj Kumar Goel";
doctor30.designation = "Principal Director & Unit Head - Pulmonology & Sleep Medicine | FMRI Gurgaon";
String doctor30Specializations[] = {
    "Pulmonology",
    "Pulmonology",
    "Sleep Medicine",
    "Pulmonology and Critical care"
};
doctor30.specializations = doctor30Specializations;
doctor30.experience = "32 Years";
doctor30.fees = 2000;

System.out.println("Doctor ID is " + doctor30.doctorId);
System.out.println("Doctor name is " + doctor30.doctorName);
System.out.println("Designation is " + doctor30.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor30.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor30.experience);
System.out.println("Fees for treatment is " + doctor30.fees);

Doctor doctor31 = new Doctor();
doctor31.doctorId = 31;
doctor31.doctorName = "Meenakshi Ahuja";
doctor31.designation = "Principal Director Obstetrics & Gynaecology | Fortis LaFemme GK II";
String doctor31Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor31.specializations = doctor31Specializations;
doctor31.experience = "35 Years";
doctor31.fees = 2000;

System.out.println("Doctor ID is " + doctor31.doctorId);
System.out.println("Doctor name is " + doctor31.doctorName);
System.out.println("Designation is " + doctor31.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor31.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor31.experience);
System.out.println("Fees for treatment is " + doctor31.fees);



Doctor doctor32 = new Doctor();
doctor32.doctorId = 32;
doctor32.doctorName = "Mohan Keshavamurthy";
doctor32.designation = "Principal Director Urology | Fortis BG Road";
String doctor32Specializations[] = {
    "Urology",
    "Uro-Oncology",
    "Paediatric Urology",
    "Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor32.specializations = doctor32Specializations;
doctor32.experience = "37 Years";
doctor32.fees = 1800;

System.out.println("Doctor ID is " + doctor32.doctorId);
System.out.println("Doctor name is " + doctor32.doctorName);
System.out.println("Designation is " + doctor32.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor32.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor32.experience);
System.out.println("Fees for treatment is " + doctor32.fees);



Doctor doctor33 = new Doctor();
doctor33.doctorId = 33;
doctor33.doctorName = "Mohan Keshavamurthy and Team 1";
doctor33.designation = "Principal Director Urology | Fortis BG Road";
String doctor33Specializations[] = {
    "Urology",
    "Urology",
    "Uro-Oncology",
    "Paediatric Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor33.specializations = doctor33Specializations;
doctor33.experience = "37 Years";
doctor33.fees = 1800;

System.out.println("Doctor ID is " + doctor33.doctorId);
System.out.println("Doctor name is " + doctor33.doctorName);
System.out.println("Designation is " + doctor33.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor33.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor33.experience);
System.out.println("Fees for treatment is " + doctor33.fees);


Doctor doctor34 = new Doctor();
doctor34.doctorId = 34;
doctor34.doctorName = "Mohan Keshavamurthy and Team 2";
doctor34.designation = "Principal Director Urology | Fortis BG Road";
String doctor34Specializations[] = {
    "Urology",
    "Urology",
    "Uro-Oncology",
    "Paediatric Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor34.specializations = doctor34Specializations;
doctor34.experience = "25 Years";
doctor34.fees = 1800;

System.out.println("Doctor ID is " + doctor34.doctorId);
System.out.println("Doctor name is " + doctor34.doctorName);
System.out.println("Designation is " + doctor34.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor34.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor34.experience);
System.out.println("Fees for treatment is " + doctor34.fees);


Doctor doctor35 = new Doctor();
doctor35.doctorId = 35;
doctor35.doctorName = "Mohan Keshavamurthy and Team Clinic";
doctor35.designation = "Principal Director Urology | Fortis BG Road";
String doctor35Specializations[] = {
    "Urology",
    "Paediatric Urology",
    "Uro-Oncology",
    "Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor35.specializations = doctor35Specializations;
doctor35.experience = "37 Years";
doctor35.fees = 1800;

System.out.println("Doctor ID is " + doctor35.doctorId);
System.out.println("Doctor name is " + doctor35.doctorName);
System.out.println("Designation is " + doctor35.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor35.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor35.experience);
System.out.println("Fees for treatment is " + doctor35.fees);


Doctor doctor36 = new Doctor();
doctor36.doctorId = 36;
doctor36.doctorName = "Mohit Agarwal";
doctor36.designation = "Principal Director & Head Medical Oncology | Fortis Shalimar Bagh";
String doctor36Specializations[] = {
    "Oncology",
    "Medical Oncology",
    "Oncology"
};
doctor36.specializations = doctor36Specializations;
doctor36.experience = "14 Years";
doctor36.fees = 2000;

System.out.println("Doctor ID is " + doctor36.doctorId);
System.out.println("Doctor name is " + doctor36.doctorName);
System.out.println("Designation is " + doctor36.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor36.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor36.experience);
System.out.println("Fees for treatment is " + doctor36.fees);



Doctor doctor37 = new Doctor();
doctor37.doctorId = 37;
doctor37.doctorName = "Narayan Hulse & Team";
doctor37.designation = "Principal Director & HOD - Orthopaedics | Fortis BG Road";
String doctor37Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer navigated Joint reconstruction",
    "Orthopaedics"
};
doctor37.specializations = doctor37Specializations;
doctor37.experience = "21 Years";
doctor37.fees = 900;

System.out.println("Doctor ID is " + doctor37.doctorId);
System.out.println("Doctor name is " + doctor37.doctorName);
System.out.println("Designation is " + doctor37.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor37.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor37.experience);
System.out.println("Fees for treatment is " + doctor37.fees);


Doctor doctor38 = new Doctor();
doctor38.doctorId = 38;
doctor38.doctorName = "Naresh Kumar Goyal";
doctor38.designation = "Principal Director & HOD Cardiology & Heart Failure Programme | Fortis Shalimar Bagh";
String doctor38Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor38.specializations = doctor38Specializations;
doctor38.experience = "18 Years";
doctor38.fees = 2100;

System.out.println("Doctor ID is " + doctor38.doctorId);
System.out.println("Doctor name is " + doctor38.doctorName);
System.out.println("Designation is " + doctor38.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor38.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor38.experience);
System.out.println("Fees for treatment is " + doctor38.fees);


Doctor doctor39 = new Doctor();
doctor39.doctorId = 39;
doctor39.doctorName = "Nishith Chandra";
doctor39.designation = "Principal Director Cardiology | Fortis Okhla";
String doctor39Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor39.specializations = doctor39Specializations;
doctor39.experience = "30 Years";
doctor39.fees = 2000;

System.out.println("Doctor ID is " + doctor39.doctorId);
System.out.println("Doctor name is " + doctor39.doctorName);
System.out.println("Designation is " + doctor39.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor39.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor39.experience);
System.out.println("Fees for treatment is " + doctor39.fees);



Doctor doctor40 = new Doctor();
doctor40.doctorId = 40;
doctor40.doctorName = "Nitesh Rohatgi";
doctor40.designation = "Principal Director Medical Oncology | FCI Defence Colony";
String doctor40Specializations[] = {
    "Oncology",
    "Medical Oncology"
};
doctor40.specializations = doctor40Specializations;
doctor40.experience = "15 Years";
doctor40.fees = 3000;

System.out.println("Doctor ID is " + doctor40.doctorId);
System.out.println("Doctor name is " + doctor40.doctorName);
System.out.println("Designation is " + doctor40.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor40.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor40.experience);
System.out.println("Fees for treatment is " + doctor40.fees);

Doctor doctor41 = new Doctor();
doctor41.doctorId = 41;
doctor41.doctorName = "Niti Raizada & Team - Dr Shruthi/Dr Varsha";
doctor41.designation = "Principal Director Medical Oncology | Fortis CG Road";
String doctor41Specializations[] = {
    "Oncology",
    "Hemato-Oncology",
    "Medical Oncology"
};
doctor41.specializations = doctor41Specializations;
doctor41.experience = "20 Years";
doctor41.fees = 1400;

System.out.println("Doctor ID is " + doctor41.doctorId);
System.out.println("Doctor name is " + doctor41.doctorName);
System.out.println("Designation is " + doctor41.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor41.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor41.experience);
System.out.println("Fees for treatment is " + doctor41.fees);



Doctor doctor42 = new Doctor();
doctor42.doctorId = 42;
doctor42.doctorName = "Nityanand Tripathi";
doctor42.designation = "Principal Director & HOD Cardiology & Electrophysiology | Fortis Shalimar Bagh";
String doctor42Specializations[] = {
    "Cardiac Sciences",
    "Electrophysiology",
    "Interventional Cardiology"
};
doctor42.specializations = doctor42Specializations;
doctor42.experience = "21 Years";
doctor42.fees = 2000;

System.out.println("Doctor ID is " + doctor42.doctorId);
System.out.println("Doctor name is " + doctor42.doctorName);
System.out.println("Designation is " + doctor42.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor42.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor42.experience);
System.out.println("Fees for treatment is " + doctor42.fees);


Doctor doctor43 = new Doctor();
doctor43.doctorId = 43;
doctor43.doctorName = "Parvathi Unninayar Iyer";
doctor43.designation = "Principal Director Paediatrics | Fortis Okhla";
String doctor43Specializations[] = {
    "Paediatrics",
    "Paediatric Cardiac Sciences"
};
doctor43.specializations = doctor43Specializations;
doctor43.experience = "37 Years";
doctor43.fees = 1500;

System.out.println("Doctor ID is " + doctor43.doctorId);
System.out.println("Doctor name is " + doctor43.doctorName);
System.out.println("Designation is " + doctor43.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor43.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor43.experience);
System.out.println("Fees for treatment is " + doctor43.fees);


Doctor doctor44 = new Doctor();
doctor44.doctorId = 44;
doctor44.doctorName = "Pradeep Kumar Jain";
doctor44.designation = "Chairman – GI, GI Oncology, Minimal Access & Bariatric Surgery | Fortis Shalimar Bagh";
String doctor44Specializations[] = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastrointestinal Surgery",
    "Robotic Surgery",
    "Metabolic & Bariatric Surgery",
    "GI, Minimal Access and Bariatric Surgery",
    "GI Oncology",
    "General Surgery",
    "General and Minimal Access Surgery",
    "Bariatric Surgery",
    "General Surgery",
    "Robotic Surgery",
    "General and Laparoscopic Surgery",
    "Oncology",
    "GI Oncology",
    "Robotic Surgery",
    "Surgical Oncology",
    "Oncology"
};
doctor44.specializations = doctor44Specializations;
doctor44.experience = "35 Years";
doctor44.fees = 2500;

System.out.println("Doctor ID is " + doctor44.doctorId);
System.out.println("Doctor name is " + doctor44.doctorName);
System.out.println("Designation is " + doctor44.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor44.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor44.experience);
System.out.println("Fees for treatment is " + doctor44.fees);


Doctor doctor45 = new Doctor();
doctor45.doctorId = 45;
doctor45.doctorName = "Prashant Saxena";
doctor45.designation = "Principal Director - Pulmonology, Pulmonology Critical Care & Sleep Medicine | Fortis Vasant Kunj";
String doctor45Specializations[] = {
    "Pulmonology",
    "Sleep Medicine",
    "Pulmonology",
    "Pulmonology and Critical care"
};
doctor45.specializations = doctor45Specializations;
doctor45.experience = "22 Years";
doctor45.fees = 1800;

System.out.println("Doctor ID is " + doctor45.doctorId);
System.out.println("Doctor name is " + doctor45.doctorName);
System.out.println("Designation is " + doctor45.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor45.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor45.experience);
System.out.println("Fees for treatment is " + doctor45.fees);

Doctor doctor51 = new Doctor();
doctor51.doctorId = 51;
doctor51.doctorName = "Rakesh Kumar Dua";
doctor51.designation = "Principal Director & HOD Neuro and Spine Surgery | Fortis Shalimar Bagh";
String doctor51Specializations[] = {
    "Neurosurgery",
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor51.specializations = doctor51Specializations;
doctor51.experience = "25 Years";
doctor51.fees = 2000;

System.out.println("Doctor ID is " + doctor51.doctorId);
System.out.println("Doctor name is " + doctor51.doctorName);
System.out.println("Designation is " + doctor51.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor51.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor51.experience);
System.out.println("Fees for treatment is " + doctor51.fees);


Doctor doctor52 = new Doctor();
doctor52.doctorId = 52;
doctor52.doctorName = "Rama Joshi";
doctor52.designation = "Chairman - Gynae Oncology and Robotic Surgery | FMRI Gurgaon";
String doctor52Specializations[] = {
    "Oncology",
    "Gynaecologic Oncology",
    "Oncology"
};
doctor52.specializations = doctor52Specializations;
doctor52.experience = "30 Years";
doctor52.fees = 2000;

System.out.println("Doctor ID is " + doctor52.doctorId);
System.out.println("Doctor name is " + doctor52.doctorName);
System.out.println("Designation is " + doctor52.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor52.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor52.experience);
System.out.println("Fees for treatment is " + doctor52.fees);


Doctor doctor53 = new Doctor();
doctor53.doctorId = 53;
doctor53.doctorName = "Rana Patir";
doctor53.designation = "Chairman Neuro Surgery | FMRI Gurgaon";
String doctor53Specializations[] = {
    "Neurosurgery",
    "Neuro and Spine Surgery",
    "Neurosurgery"
};
doctor53.specializations = doctor53Specializations;
doctor53.experience = "32 Years";
doctor53.fees = 2000;

System.out.println("Doctor ID is " + doctor53.doctorId);
System.out.println("Doctor name is " + doctor53.doctorName);
System.out.println("Designation is " + doctor53.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor53.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor53.experience);
System.out.println("Fees for treatment is " + doctor53.fees);


Doctor doctor54 = new Doctor();
doctor54.doctorId = 54;
doctor54.doctorName = "SANDEEP VAISHYA";
doctor54.designation = "Executive Director & HOD Neuro Surgery | FMRI Gurgaon";
String doctor54Specializations[] = {
    "Neurosurgery",
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor54.specializations = doctor54Specializations;
doctor54.experience = "30 Years";
doctor54.fees = 2000;

System.out.println("Doctor ID is " + doctor54.doctorId);
System.out.println("Doctor name is " + doctor54.doctorName);
System.out.println("Designation is " + doctor54.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor54.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor54.experience);
System.out.println("Fees for treatment is " + doctor54.fees);


Doctor doctor55 = new Doctor();
doctor55.doctorId = 55;
doctor55.doctorName = "Salil Jain";
doctor55.designation = "Principal Director & HOD Nephrology | FMRI Gurgaon";
String doctor55Specializations[] = {
    "Organ Transplant",
    "Kidney Transplant",
    "Nephrology",
    "Nephrology"
};
doctor55.specializations = doctor55Specializations;
doctor55.experience = "25 Years";
doctor55.fees = 2200;

System.out.println("Doctor ID is " + doctor55.doctorId);
System.out.println("Doctor name is " + doctor55.doctorName);
System.out.println("Designation is " + doctor55.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized: doctor55.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor55.experience);
System.out.println("Fees for treatment is " + doctor55.fees);

Doctor doctor56 = new Doctor();
doctor56.doctorId = 56;
doctor56.doctorName = "Sanjeev Gulati";
doctor56.designation = "Chairman-Nephrology | Fortis Vasant Kunj";
String doctor56Specializations[] = {
    "Organ Transplant",
    "Kidney Transplant",
    "Nephrology",
    "Nephrology"
};
doctor56.specializations = doctor56Specializations;
doctor56.experience = "30 Years";
doctor56.fees = 2200;

System.out.println("Doctor ID is " + doctor56.doctorId);
System.out.println("Doctor name is " + doctor56.doctorName);
System.out.println("Designation is " + doctor56.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor56.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor56.experience);
System.out.println("Fees for treatment is " + doctor56.fees);


Doctor doctor57 = new Doctor();
doctor57.doctorId = 57;
doctor57.doctorName = "Sanjeev Gulati";
doctor57.designation = "Chairman-Nephrology | Fortis Okhla";
String doctor57Specializations[] = {
    "Organ Transplant",
    "Kidney Transplant",
    "Nephrology",
    "Nephrology"
};
doctor57.specializations = doctor57Specializations;
doctor57.experience = "31 Years";
doctor57.fees = 2000;

System.out.println("Doctor ID is " + doctor57.doctorId);
System.out.println("Doctor name is " + doctor57.doctorName);
System.out.println("Designation is " + doctor57.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor57.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor57.experience);
System.out.println("Fees for treatment is " + doctor57.fees);


Doctor doctor58 = new Doctor();
doctor58.doctorId = 58;
doctor58.doctorName = "Satish Koul";
doctor58.designation = "Principal Director & Unit Head – Internal Medicine | FMRI Gurgaon";
String doctor58Specializations[] = {
    "Internal Medicine",
    "Internal Medicine",
    "General Physician"
};
doctor58.specializations = doctor58Specializations;
doctor58.experience = "22 Years";
doctor58.fees = 1800;

System.out.println("Doctor ID is " + doctor58.doctorId);
System.out.println("Doctor name is " + doctor58.doctorName);
System.out.println("Designation is " + doctor58.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor58.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor58.experience);
System.out.println("Fees for treatment is " + doctor58.fees);


Doctor doctor59 = new Doctor();
doctor59.doctorId = 59;
doctor59.doctorName = "Shiv Kumar Choudhary";
doctor59.designation = "Executive Director Cardio Thoracic Vascular Surgery | Fortis Okhla";
String doctor59Specializations[] = {
    "Cardiac Sciences",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)"
};
doctor59.specializations = doctor59Specializations;
doctor59.experience = "33 Years";
doctor59.fees = 2000;

System.out.println("Doctor ID is " + doctor59.doctorId);
System.out.println("Doctor name is " + doctor59.doctorName);
System.out.println("Designation is " + doctor59.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor59.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor59.experience);
System.out.println("Fees for treatment is " + doctor59.fees);


Doctor doctor60 = new Doctor();
doctor60.doctorId = 60;
doctor60.doctorName = "Sonal Gupta";
doctor60.designation = "Principal Director & HOD Neuro and Spine Surgery | Fortis Shalimar Bagh";
String doctor60Specializations[] = {
    "Neurosurgery",
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor60.specializations = doctor60Specializations;
doctor60.experience = "28 Years";
doctor60.fees = 2000;

System.out.println("Doctor ID is " + doctor60.doctorId);
System.out.println("Doctor name is " + doctor60.doctorName);
System.out.println("Designation is " + doctor60.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor60.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor60.experience);
System.out.println("Fees for treatment is " + doctor60.fees);

Doctor doctor61 = new Doctor();
doctor61.doctorId = 61;
doctor61.doctorName = "Subhash Jangid";
doctor61.designation = "Principal Director & Unit Head Orthopaedics | FMRI Gurgaon";
String doctor61Specializations[] = {
    "Orthopaedics",
    "Sports Medicine",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer navigated Joint reconstruction",
    "Orthopaedic Oncology",
    "Orthopaedics"
};
doctor61.specializations = doctor61Specializations;
doctor61.experience = "27 Years";
doctor61.fees = 2500;

System.out.println("Doctor ID is " + doctor61.doctorId);
System.out.println("Doctor name is " + doctor61.doctorName);
System.out.println("Designation is " + doctor61.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor61.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor61.experience);
System.out.println("Fees for treatment is " + doctor61.fees);


Doctor doctor62 = new Doctor();
doctor62.doctorId = 62;
doctor62.doctorName = "Subrat Kumar Acharya";
doctor62.designation = "Executive Director Gastroenterology | Fortis Okhla";
String doctor62Specializations[] = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology and Hepatobiliary Sciences"
};
doctor62.specializations = doctor62Specializations;
doctor62.experience = "42 Years";
doctor62.fees = 2500;

System.out.println("Doctor ID is " + doctor62.doctorId);
System.out.println("Doctor name is " + doctor62.doctorName);
System.out.println("Designation is " + doctor62.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor62.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor62.experience);
System.out.println("Fees for treatment is " + doctor62.fees);


Doctor doctor63 = new Doctor();
doctor63.doctorId = 63;
doctor63.doctorName = "Tripat Choudhary";
doctor63.designation = "Principal Director Obstetrics & Gynaecology | Fortis LaFemme GK II";
String doctor63Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor63.specializations = doctor63Specializations;
doctor63.experience = "43 Years";
doctor63.fees = 3000;

System.out.println("Doctor ID is " + doctor63.doctorId);
System.out.println("Doctor name is " + doctor63.doctorName);
System.out.println("Designation is " + doctor63.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor63.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor63.experience);
System.out.println("Fees for treatment is " + doctor63.fees);


Doctor doctor64 = new Doctor();
doctor64.doctorId = 64;
doctor64.doctorName = "Udgeath Dhir";
doctor64.designation = "Principal Director Cardio Thoracic Vascular Surgery | FMRI Gurgaon";
String doctor64Specializations[] = {
    "Cardiac Sciences",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)",
    "Heart Transplant",
    "Organ Transplant",
    "Heart Transplant"
};
doctor64.specializations = doctor64Specializations;
doctor64.experience = "18 Years";
doctor64.fees = 2000;

System.out.println("Doctor ID is " + doctor64.doctorId);
System.out.println("Doctor name is " + doctor64.doctorName);
System.out.println("Designation is " + doctor64.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor64.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor64.experience);
System.out.println("Fees for treatment is " + doctor64.fees);


Doctor doctor65 = new Doctor();
doctor65.doctorId = 65;
doctor65.doctorName = "Vedant Kabra";
doctor65.designation = "Principal Director Surgical Oncology | FMRI Gurgaon";
String doctor65Specializations[] = {
    "Oncology",
    "Surgical Oncology",
    "Robotic Surgery",
    "Oncology",
    "Breast Oncology"
};
doctor65.specializations = doctor65Specializations;
doctor65.experience = "25 Years";
doctor65.fees = 2500;

System.out.println("Doctor ID is " + doctor65.doctorId);
System.out.println("Doctor name is " + doctor65.doctorName);
System.out.println("Designation is " + doctor65.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor65.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor65.experience);
System.out.println("Fees for treatment is " + doctor65.fees);

Doctor doctor66 = new Doctor();
doctor66.doctorId = 66;
doctor66.doctorName = "Vikas Dua";
doctor66.designation = "Principal Director & Head - Pediatric Hematology, Hemato Oncology & Bone Marrow Transplant | FMRI Gurgaon";
String doctor66Specializations[] = {
    "Organ Transplant",
    "Haematology and BMT",
    "Haematology",
    "Paediatric Haematology and BMT",
    "Oncology",
    "Hemato-Oncology",
    "Paediatrics",
    "Paediatric Oncology"
};
doctor66.specializations = doctor66Specializations;
doctor66.experience = "15 Years";
doctor66.fees = 1200;

System.out.println("Doctor ID is " + doctor66.doctorId);
System.out.println("Doctor name is " + doctor66.doctorName);
System.out.println("Designation is " + doctor66.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor66.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor66.experience);
System.out.println("Fees for treatment is " + doctor66.fees);


Doctor doctor67 = new Doctor();
doctor67.doctorId = 67;
doctor67.doctorName = "Vinod Raina";
doctor67.designation = "Chairman Oncosciences | FMRI Gurgaon";
String doctor67Specializations[] = {
    "Oncology",
    "Medical Oncology"
};
doctor67.specializations = doctor67Specializations;
doctor67.experience = "40 Years";
doctor67.fees = 3000;

System.out.println("Doctor ID is " + doctor67.doctorId);
System.out.println("Doctor name is " + doctor67.doctorName);
System.out.println("Designation is " + doctor67.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor67.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor67.experience);
System.out.println("Fees for treatment is " + doctor67.fees);


Doctor doctor68 = new Doctor();
doctor68.doctorId = 68;
doctor68.doctorName = "Vivek Vij";
doctor68.designation = "Chairman – Liver Transplant & Hepato - Biliary Science | Fortis Noida";
String doctor68Specializations[] = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Robotic Surgery",
    "Liver Transplant and Hepatobiliary Sciences",
    "Liver Transplant and Hepatobiliary Sciences",
    "Organ Transplant",
    "Liver Transplant"
};
doctor68.specializations = doctor68Specializations;
doctor68.experience = "25 Years";
doctor68.fees = 2500;

System.out.println("Doctor ID is " + doctor68.doctorId);
System.out.println("Doctor name is " + doctor68.doctorName);
System.out.println("Designation is " + doctor68.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor68.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor68.experience);
System.out.println("Fees for treatment is " + doctor68.fees);


Doctor doctor69 = new Doctor();
doctor69.doctorId = 69;
doctor69.doctorName = "Z S Meharwal";
doctor69.designation = "Chairman & Head- Adult Cardiac Surgery | Fortis Okhla";
String doctor69Specializations[] = {
    "Cardiac Sciences",
    "Heart Transplant",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)"
};
doctor69.specializations = doctor69Specializations;
doctor69.experience = "38 Years";
doctor69.fees = 2000;

System.out.println("Doctor ID is " + doctor69.doctorId);
System.out.println("Doctor name is " + doctor69.doctorName);
System.out.println("Designation is " + doctor69.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor69.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor69.experience);
System.out.println("Fees for treatment is " + doctor69.fees);


Doctor doctor70 = new Doctor();
doctor70.doctorId = 70;
doctor70.doctorName = "Amitabh Parti";
doctor70.designation = "Senior Director & Unit Head - Internal Medicine | FMRI Gurgaon";
String doctor70Specializations[] = {
    "Internal Medicine",
    "General Physician",
    "Internal Medicine"
};
doctor70.specializations = doctor70Specializations;
doctor70.experience = "32 Years";
doctor70.fees = 2000;

System.out.println("Doctor ID is " + doctor70.doctorId);
System.out.println("Doctor name is " + doctor70.doctorName);
System.out.println("Designation is " + doctor70.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor70.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor70.experience);
System.out.println("Fees for treatment is " + doctor70.fees);
Doctor doctor71 = new Doctor();
doctor71.doctorId = 71;
doctor71.doctorName = "Anoop Jhurani";
doctor71.designation = "Senior Director & HOD Orthopaedics | Fortis Jaipur";
String doctor71Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer navigated Joint reconstruction"
};
doctor71.specializations = doctor71Specializations;
doctor71.experience = "26 Years";
doctor71.fees = 1500;

System.out.println("Doctor ID is " + doctor71.doctorId);
System.out.println("Doctor name is " + doctor71.doctorName);
System.out.println("Designation is " + doctor71.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor71.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor71.experience);
System.out.println("Fees for treatment is " + doctor71.fees);


Doctor doctor72 = new Doctor();
doctor72.doctorId = 72;
doctor72.doctorName = "Anuj Chawla";
doctor72.designation = "Senior Director Orthopaedics | Fortis Okhla";
String doctor72Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Orthopaedics and Spine Surgery",
    "Sports Medicine"
};
doctor72.specializations = doctor72Specializations;
doctor72.experience = "21 Years";
doctor72.fees = 1500;

System.out.println("Doctor ID is " + doctor72.doctorId);
System.out.println("Doctor name is " + doctor72.doctorName);
System.out.println("Designation is " + doctor72.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor72.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor72.experience);
System.out.println("Fees for treatment is " + doctor72.fees);
Doctor doctor73 = new Doctor();
doctor73.doctorId = 73;
doctor73.doctorName = "Arun Agarwal";
doctor73.designation = "Senior Director & HOD Internal Medicine | Fortis Jaipur";
String doctor73Specializations[] = {
    "Internal Medicine",
    "Internal Medicine"
};
doctor73.specializations = doctor73Specializations;
doctor73.experience = "36 Years";
doctor73.fees = 0;

System.out.println("Doctor ID is " + doctor73.doctorId);
System.out.println("Doctor name is " + doctor73.doctorName);
System.out.println("Designation is " + doctor73.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor73.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor73.experience);
System.out.println("Fees for treatment is " + doctor73.fees);


Doctor doctor74 = new Doctor();
doctor74.doctorId = 74;
doctor74.doctorName = "Brahm Datt Pathak";
doctor74.designation = "Senior Director - GI, Minimal Access & Bariatric Surgery | Fortis Faridabad";
String doctor74Specializations[] = {
    "General Surgery",
    "General Surgery"
};
doctor74.specializations = doctor74Specializations;
doctor74.experience = "34 Years";
doctor74.fees = 700;

System.out.println("Doctor ID is " + doctor74.doctorId);
System.out.println("Doctor name is " + doctor74.doctorName);
System.out.println("Designation is " + doctor74.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor74.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor74.experience);
System.out.println("Fees for treatment is " + doctor74.fees);


Doctor doctor75 = new Doctor();
doctor75.doctorId = 75;
doctor75.doctorName = "Debashish Chanda";
doctor75.designation = "Senior Director & Unit Head Orthopaedics | FMRI Gurgaon";
String doctor75Specializations[] = {
    "Orthopaedics",
    "Orthopaedics",
    "Robotic and Computer navigated Joint reconstruction",
    "Orthopaedics and Joint Replacement",
    "Orthopaedic Oncology"
};
doctor75.specializations = doctor75Specializations;
doctor75.experience = "22 Years";
doctor75.fees = 2000;

System.out.println("Doctor ID is " + doctor75.doctorId);
System.out.println("Doctor name is " + doctor75.doctorName);
System.out.println("Designation is " + doctor75.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor75.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor75.experience);
System.out.println("Fees for treatment is " + doctor75.fees);


Doctor doctor76 = new Doctor();
doctor76.doctorId = 76;
doctor76.doctorName = "Deepak Kalra";
doctor76.designation = "Senior Director & HOD Nephrology | Fortis Shalimar Bagh";
String doctor76Specializations[] = {
    "Nephrology",
    "Nephrology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor76.specializations = doctor76Specializations;
doctor76.experience = "18 Years";
doctor76.fees = 1500;

System.out.println("Doctor ID is " + doctor76.doctorId);
System.out.println("Doctor name is " + doctor76.doctorName);
System.out.println("Designation is " + doctor76.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor76.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor76.experience);
System.out.println("Fees for treatment is " + doctor76.fees);


Doctor doctor77 = new Doctor();
doctor77.doctorId = 77;
doctor77.doctorName = "Dhananjay Gupta";
doctor77.designation = "Senior Director Orthopaedics | Fortis Vasant Kunj";
String doctor77Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Orthopaedics"
};
doctor77.specializations = doctor77Specializations;
doctor77.experience = "28 Years";
doctor77.fees = 1800;

System.out.println("Doctor ID is " + doctor77.doctorId);
System.out.println("Doctor name is " + doctor77.doctorName);
System.out.println("Designation is " + doctor77.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor77.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor77.experience);
System.out.println("Fees for treatment is " + doctor77.fees);

Doctor doctor78 = new Doctor();
doctor78.doctorId = 78;
doctor78.doctorName = "Dinesh Gupta";
doctor78.designation = "Senior Director Internal Medicine | Fortis Ludhiana";
String doctor78Specializations[] = {
    "Internal Medicine",
    "Internal Medicine",
    "General Physician"
};
doctor78.specializations = doctor78Specializations;
doctor78.experience = "31 Years";
doctor78.fees = 1000;

System.out.println("Doctor ID is " + doctor78.doctorId);
System.out.println("Doctor name is " + doctor78.doctorName);
System.out.println("Designation is " + doctor78.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor78.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor78.experience);
System.out.println("Fees for treatment is " + doctor78.fees);


Doctor doctor79 = new Doctor();
doctor79.doctorId = 79;
doctor79.doctorName = "Dinesh Kumar Mittal";
doctor79.designation = "Senior Director & HOD Cardiothoracic and Vascular Surgery | Fortis Shalimar Bagh";
String doctor79Specializations[] = {
    "Cardiac Sciences",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)"
};
doctor79.specializations = doctor79Specializations;
doctor79.experience = "20 Years";
doctor79.fees = 1500;

System.out.println("Doctor ID is " + doctor79.doctorId);
System.out.println("Doctor name is " + doctor79.doctorName);
System.out.println("Designation is " + doctor79.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor79.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor79.experience);
System.out.println("Fees for treatment is " + doctor79.fees);


Doctor doctor80 = new Doctor();
doctor80.doctorId = 80;
doctor80.doctorName = "Harjit Singh Mahay";
doctor80.designation = "Senior Director Critical Care | Fortis Shalimar Bagh";
String doctor80Specializations[] = {
    "Critical Care",
    "Critical Care",
    "Intensive Care and Critical Care"
};
doctor80.specializations = doctor80Specializations;
doctor80.experience = "27 Years";
doctor80.fees = 0;

System.out.println("Doctor ID is " + doctor80.doctorId);
System.out.println("Doctor name is " + doctor80.doctorName);
System.out.println("Designation is " + doctor80.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor80.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor80.experience);
System.out.println("Fees for treatment is " + doctor80.fees);


Doctor doctor81 = new Doctor();
doctor81.doctorId = 81;
doctor81.doctorName = "Harminder Singh Pannu";
doctor81.designation = "Senior Director Internal Medicine | Fortis Mall Road";
String doctor81Specializations[] = {
    "General Physician",
    "Internal Medicine",
    "Internal Medicine"
};
doctor81.specializations = doctor81Specializations;
doctor81.experience = "31 Years";
doctor81.fees = 1000;

System.out.println("Doctor ID is " + doctor81.doctorId);
System.out.println("Doctor name is " + doctor81.doctorName);
System.out.println("Designation is " + doctor81.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor81.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor81.experience);
System.out.println("Fees for treatment is " + doctor81.fees);


Doctor doctor82 = new Doctor();
doctor82.doctorId = 82;
doctor82.doctorName = "Hemant Bhartiya";
doctor82.designation = "Senior Director & HOD Neuro and Spine Surgery | Fortis Jaipur";
String doctor82Specializations[] = {
    "Neurosurgery",
    "Neurosurgery"
};
doctor82.specializations = doctor82Specializations;
doctor82.experience = "31 Years";
doctor82.fees = 1500;

System.out.println("Doctor ID is " + doctor82.doctorId);
System.out.println("Doctor name is " + doctor82.doctorName);
System.out.println("Designation is " + doctor82.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor82.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor82.experience);
System.out.println("Fees for treatment is " + doctor82.fees);

Doctor doctor83 = new Doctor();
doctor83.doctorId = 83;
doctor83.doctorName = "J. M. S. Kalra";
doctor83.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String doctor83Specializations[] = {
    "Internal Medicine",
    "Geriatric Medicine",
    "General Physician",
    "Internal Medicine"
};
doctor83.specializations = doctor83Specializations;
doctor83.experience = "46 Years";
doctor83.fees = 1500;

System.out.println("Doctor ID is " + doctor83.doctorId);
System.out.println("Doctor name is " + doctor83.doctorName);
System.out.println("Designation is " + doctor83.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor83.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor83.experience);
System.out.println("Fees for treatment is " + doctor83.fees);


Doctor doctor84 = new Doctor();
doctor84.doctorId = 84;
doctor84.doctorName = "Murali R Chakravarthy";
doctor84.designation = "Senior Director Anaesthesia | Fortis BG Road";
String doctor84Specializations[] = {
    "Anaesthesia"
};
doctor84.specializations = doctor84Specializations;
doctor84.experience = "34 Years";
doctor84.fees = 900;

System.out.println("Doctor ID is " + doctor84.doctorId);
System.out.println("Doctor name is " + doctor84.doctorName);
System.out.println("Designation is " + doctor84.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor84.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor84.experience);
System.out.println("Fees for treatment is " + doctor84.fees);


Doctor doctor85 = new Doctor();
doctor85.doctorId = 85;
doctor85.doctorName = "N.C. Krishnamani";
doctor85.designation = "Senior Director Cardiology | Fortis Shalimar Bagh";
String doctor85Specializations[] = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor85.specializations = doctor85Specializations;
doctor85.experience = "28 Years";
doctor85.fees = 2000;

System.out.println("Doctor ID is " + doctor85.doctorId);
System.out.println("Doctor name is " + doctor85.doctorName);
System.out.println("Designation is " + doctor85.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor85.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor85.experience);
System.out.println("Fees for treatment is " + doctor85.fees);


Doctor doctor86 = new Doctor();
doctor86.doctorId = 86;
doctor86.doctorName = "Neeraj Chaudhary";
doctor86.designation = "Senior Director & HOD – GI, GI Oncology, Minimal Access & Bariatric Surgery | Fortis Vasant Kunj";
String doctor86Specializations[] = {
    "General and Minimal Access Surgery",
    "General and Laparoscopic Surgery",
    "General Surgery"
};
doctor86.specializations = doctor86Specializations;
doctor86.experience = "20 Years";
doctor86.fees = 1500;

System.out.println("Doctor ID is " + doctor86.doctorId);
System.out.println("Doctor name is " + doctor86.doctorName);
System.out.println("Designation is " + doctor86.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor86.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor86.experience);
System.out.println("Fees for treatment is " + doctor86.fees);


Doctor doctor87 = new Doctor();
doctor87.doctorId = 87;
doctor87.doctorName = "Nikhil Kumar";
doctor87.designation = "Senior Director Cardiology | FMRI Gurgaon";
String doctor87Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor87.specializations = doctor87Specializations;
doctor87.experience = "39 Years";
doctor87.fees = 2000;

System.out.println("Doctor ID is " + doctor87.doctorId);
System.out.println("Doctor name is " + doctor87.doctorName);
System.out.println("Designation is " + doctor87.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor87.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor87.experience);
System.out.println("Fees for treatment is " + doctor87.fees);

Doctor doctor88 = new Doctor();
doctor88.doctorId = 88;
doctor88.doctorName = "Nitika Sobti";
doctor88.designation = "Senior Director Obstetrics & Gynaecology | FMRI Gurgaon";
String doctor88Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor88.specializations = doctor88Specializations;
doctor88.experience = "28 Years";
doctor88.fees = 1800;

System.out.println("Doctor ID is " + doctor88.doctorId);
System.out.println("Doctor name is " + doctor88.doctorName);
System.out.println("Designation is " + doctor88.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor88.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor88.experience);
System.out.println("Fees for treatment is " + doctor88.fees);


Doctor doctor89 = new Doctor();
doctor89.doctorId = 89;
doctor89.doctorName = "Pankaj Kumar";
doctor89.designation = "Senior Director Critical Care | Fortis Shalimar Bagh";
String doctor89Specializations[] = {
    "Critical Care",
    "Critical Care",
    "Intensive Care and Critical Care"
};
doctor89.specializations = doctor89Specializations;
doctor89.experience = "27 Years";
doctor89.fees = 0;

System.out.println("Doctor ID is " + doctor89.doctorId);
System.out.println("Doctor name is " + doctor89.doctorName);
System.out.println("Designation is " + doctor89.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor89.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor89.experience);
System.out.println("Fees for treatment is " + doctor89.fees);


Doctor doctor90 = new Doctor();
doctor90.doctorId = 90;
doctor90.doctorName = "Pawan Kumar Goyal";
doctor90.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String doctor90Specializations[] = {
    "Internal Medicine",
    "General Physician",
    "Internal Medicine",
    "Geriatric Medicine"
};
doctor90.specializations = doctor90Specializations;
doctor90.experience = "32 Years";
doctor90.fees = 1500;

System.out.println("Doctor ID is " + doctor90.doctorId);
System.out.println("Doctor name is " + doctor90.doctorName);
System.out.println("Designation is " + doctor90.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor90.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor90.experience);
System.out.println("Fees for treatment is " + doctor90.fees);


Doctor doctor91 = new Doctor();
doctor91.doctorId = 91;
doctor91.doctorName = "R. Tongia";
doctor91.designation = "Senior Director & HOD Cardiology | Fortis Jaipur";
String doctor91Specializations[] = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor91.specializations = doctor91Specializations;
doctor91.experience = "53 Years";
doctor91.fees = 700;

System.out.println("Doctor ID is " + doctor91.doctorId);
System.out.println("Doctor name is " + doctor91.doctorName);
System.out.println("Designation is " + doctor91.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor91.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor91.experience);
System.out.println("Fees for treatment is " + doctor91.fees);


Doctor doctor92 = new Doctor();
doctor92.doctorId = 92;
doctor92.doctorName = "Rahul Gupta -Neurosurgery";
doctor92.designation = "Senior Director & HOD Neuro and Spine Surgery | Fortis Noida";
String doctor92Specializations[] = {
    "Neurosurgery",
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor92.specializations = doctor92Specializations;
doctor92.experience = "20 Years";
doctor92.fees = 1200;

System.out.println("Doctor ID is " + doctor92.doctorId);
System.out.println("Doctor name is " + doctor92.doctorName);
System.out.println("Designation is " + doctor92.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor92.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor92.experience);
System.out.println("Fees for treatment is " + doctor92.fees);

Doctor doctor93 = new Doctor();
doctor93.doctorId = 93;
doctor93.doctorName = "Rajesh Kumar Budhiraja";
doctor93.designation = "Senior Director Internal Medicine | Fortis Faridabad";
String doctor93Specializations[] = {
    "Internal Medicine",
    "General Physician",
    "Internal Medicine"
};
doctor93.specializations = doctor93Specializations;
doctor93.experience = "20 Years";
doctor93.fees = 800;

System.out.println("Doctor ID is " + doctor93.doctorId);
System.out.println("Doctor name is " + doctor93.doctorName);
System.out.println("Designation is " + doctor93.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor93.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor93.experience);
System.out.println("Fees for treatment is " + doctor93.fees);


Doctor doctor94 = new Doctor();
doctor94.doctorId = 94;
doctor94.doctorName = "Rajoo Singh Chhina";
doctor94.designation = "Senior Director & HOD Gastroenterology | Fortis Ludhiana";
String doctor94Specializations[] = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology",
    "Gastroenterology and Hepatobiliary Sciences"
};
doctor94.specializations = doctor94Specializations;
doctor94.experience = "44 Years";
doctor94.fees = 1000;

System.out.println("Doctor ID is " + doctor94.doctorId);
System.out.println("Doctor name is " + doctor94.doctorName);
System.out.println("Designation is " + doctor94.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor94.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor94.experience);
System.out.println("Fees for treatment is " + doctor94.fees);


Doctor doctor95 = new Doctor();
doctor95.doctorId = 95;
doctor95.doctorName = "Rakesh Sood";
doctor95.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String doctor95Specializations[] = {
    "Internal Medicine",
    "Internal Medicine"
};
doctor95.specializations = doctor95Specializations;
doctor95.experience = "37 Years";
doctor95.fees = 1500;

System.out.println("Doctor ID is " + doctor95.doctorId);
System.out.println("Doctor name is " + doctor95.doctorName);
System.out.println("Designation is " + doctor95.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor95.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor95.experience);
System.out.println("Fees for treatment is " + doctor95.fees);


Doctor doctor96 = new Doctor();
doctor96.doctorId = 96;
doctor96.doctorName = "Ramesh Garg";
doctor96.designation = "Senior Director & HOD Gastroenterology | Fortis Shalimar Bagh";
String doctor96Specializations[] = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology",
    "Gastroenterology and Hepatobiliary Sciences"
};
doctor96.specializations = doctor96Specializations;
doctor96.experience = "25 Years";
doctor96.fees = 1500;

System.out.println("Doctor ID is " + doctor96.doctorId);
System.out.println("Doctor name is " + doctor96.doctorName);
System.out.println("Designation is " + doctor96.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor96.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor96.experience);
System.out.println("Fees for treatment is " + doctor96.fees);


Doctor doctor97 = new Doctor();
doctor97.doctorId = 97;
doctor97.doctorName = "Richie Gupta";
doctor97.designation = "Senior Director & HOD Plastic Surgery | Fortis Shalimar Bagh";
String doctor97Specializations[] = {
    "Plastic and Reconstructive Surgery",
    "Plastic and Reconstructive Surgery"
};
doctor97.specializations = doctor97Specializations;
doctor97.experience = "30 Years";
doctor97.fees = 2000;

System.out.println("Doctor ID is " + doctor97.doctorId);
System.out.println("Doctor name is " + doctor97.doctorName);
System.out.println("Designation is " + doctor97.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor97.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor97.experience);
System.out.println("Fees for treatment is " + doctor97.fees);

Doctor doctor98 = new Doctor();
doctor98.doctorId = 98;
doctor98.doctorName = "Sandeep Dewan";
doctor98.designation = "Senior Director & HOD - Critical Care | FMRI Gurgaon";
String doctor98Specializations[] = {
    "Critical Care",
    "Critical Care"
};
doctor98.specializations = doctor98Specializations;
doctor98.experience = "24 Years";
doctor98.fees = 2000;

System.out.println("Doctor ID is " + doctor98.doctorId);
System.out.println("Doctor name is " + doctor98.doctorName);
System.out.println("Designation is " + doctor98.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor98.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor98.experience);
System.out.println("Fees for treatment is " + doctor98.fees);


Doctor doctor99 = new Doctor();
doctor99.doctorId = 99;
doctor99.doctorName = "Sanjay Kumar";
doctor99.designation = "Senior Director Cardiology | Fortis Faridabad";
String doctor99Specializations[] = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor99.specializations = doctor99Specializations;
doctor99.experience = "26 Years";
doctor99.fees = 1000;

System.out.println("Doctor ID is " + doctor99.doctorId);
System.out.println("Doctor name is " + doctor99.doctorName);
System.out.println("Designation is " + doctor99.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor99.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor99.experience);
System.out.println("Fees for treatment is " + doctor99.fees);


Doctor doctor100 = new Doctor();
doctor100.doctorId = 100;
doctor100.doctorName = "Sanjay Kumar Gogia";
doctor100.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String doctor100Specializations[] = {
    "Internal Medicine",
    "General Physician",
    "Internal Medicine",
    "Geriatric Medicine"
};
doctor100.specializations = doctor100Specializations;
doctor100.experience = "30 Years";
doctor100.fees = 1400;

System.out.println("Doctor ID is " + doctor100.doctorId);
System.out.println("Doctor name is " + doctor100.doctorName);
System.out.println("Designation is " + doctor100.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor100.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor100.experience);
System.out.println("Fees for treatment is " + doctor100.fees);


Doctor doctor101 = new Doctor();
doctor101.doctorId = 101;
doctor101.doctorName = "Sanjeev Gera";
doctor101.designation = "Senior Director & HOD Cardiology | Fortis Noida";
String doctor101Specializations[] = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor101.specializations = doctor101Specializations;
doctor101.experience = "22 Years";
doctor101.fees = 1200;

System.out.println("Doctor ID is " + doctor101.doctorId);
System.out.println("Doctor name is " + doctor101.doctorName);
System.out.println("Designation is " + doctor101.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor101.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor101.experience);
System.out.println("Fees for treatment is " + doctor101.fees);


Doctor doctor102 = new Doctor();
doctor102.doctorId = 102;
doctor102.doctorName = "Sanjeev Mahajan";
doctor102.designation = "Senior Director Orthopaedics | Fortis Ludhiana";
String doctor102Specializations[] = {
    "Orthopaedics",
    "Paediatric Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer navigated Joint reconstruction",
    "Sports Medicine",
    "Orthopaedics"
};
doctor102.specializations = doctor102Specializations;
doctor102.experience = "30 Years";
doctor102.fees = 1000;

System.out.println("Doctor ID is " + doctor102.doctorId);
System.out.println("Doctor name is " + doctor102.doctorName);
System.out.println("Designation is " + doctor102.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor102.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor102.experience);
System.out.println("Fees for treatment is " + doctor102.fees);

Doctor doctor103 = new Doctor();
doctor103.doctorId = 103;
doctor103.doctorName = "Sanjeevani Khanna";
doctor103.designation = "Senior Director - Emeritus Obstetrics & Gynaecology | Fortis Shalimar Bagh";
String doctor103Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor103.specializations = doctor103Specializations;
doctor103.experience = "37 Years";
doctor103.fees = 2000;

System.out.println("Doctor ID is " + doctor103.doctorId);
System.out.println("Doctor name is " + doctor103.doctorName);
System.out.println("Designation is " + doctor103.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor103.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor103.experience);
System.out.println("Fees for treatment is " + doctor103.fees);


Doctor doctor104 = new Doctor();
doctor104.doctorId = 104;
doctor104.doctorName = "Shubham Jain";
doctor104.designation = "Senior Director Surgical Oncology | FCI Defence Colony";
String doctor104Specializations[] = {
    "Oncology",
    "Oncology",
    "Surgical Oncology",
    "Head and Neck Oncosurgery",
    "Gynaecologic Oncology",
    "Robotic Surgery",
    "Thoracic Oncology",
    "Paediatric Oncology"
};
doctor104.specializations = doctor104Specializations;
doctor104.experience = "11 Years";
doctor104.fees = 2000;

System.out.println("Doctor ID is " + doctor104.doctorId);
System.out.println("Doctor name is " + doctor104.doctorName);
System.out.println("Designation is " + doctor104.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor104.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor104.experience);
System.out.println("Fees for treatment is " + doctor104.fees);


Doctor doctor105 = new Doctor();
doctor105.doctorId = 105;
doctor105.doctorName = "Shyam Sunder Sharma";
doctor105.designation = "Senior Director & HOD Gastroenterology | Fortis Jaipur";
String doctor105Specializations[] = {
    "Gastroenterology and Hepatobiliary Sciences",
    "GI Oncology",
    "Gastroenterology"
};
doctor105.specializations = doctor105Specializations;
doctor105.experience = "35 Years";
doctor105.fees = 1500;

System.out.println("Doctor ID is " + doctor105.doctorId);
System.out.println("Doctor name is " + doctor105.doctorName);
System.out.println("Designation is " + doctor105.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor105.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor105.experience);
System.out.println("Fees for treatment is " + doctor105.fees);


Doctor doctor106 = new Doctor();
doctor106.doctorId = 106;
doctor106.doctorName = "Suneeta Mittal";
doctor106.designation = "Senior Director & HOD Obstetrics & Gynaecology | FMRI Gurgaon";
String doctor106Specializations[] = {
    "Obstetrics and Gynaecology",
    "Robotic Surgery",
    "Obstetrics and Gynaecology"
};
doctor106.specializations = doctor106Specializations;
doctor106.experience = "57 Years";
doctor106.fees = 2500;

System.out.println("Doctor ID is " + doctor106.doctorId);
System.out.println("Doctor name is " + doctor106.doctorName);
System.out.println("Designation is " + doctor106.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor106.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor106.experience);
System.out.println("Fees for treatment is " + doctor106.fees);


Doctor doctor107 = new Doctor();
doctor107.doctorId = 107;
doctor107.doctorName = "Sunita Varma";
doctor107.designation = "Senior Director & HOD Obstetrics & Gynaecology | Fortis Shalimar Bagh";
String doctor107Specializations[] = {
    "Obstetrics and Gynaecology",
    "Robotic Surgery",
    "Obstetrics and Gynaecology"
};
doctor107.specializations = doctor107Specializations;
doctor107.experience = "30 Years";
doctor107.fees = 2000;

System.out.println("Doctor ID is " + doctor107.doctorId);
System.out.println("Doctor name is " + doctor107.doctorName);
System.out.println("Designation is " + doctor107.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor107.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor107.experience);
System.out.println("Fees for treatment is " + doctor107.fees);

Doctor doctor108 = new Doctor();
doctor108.doctorId = 108;
doctor108.doctorName = "Tapan Ghose";
doctor108.designation = "Senior Director & HOD Cardiology | Fortis Vasant Kunj";
String doctor108Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology",
    "Non-Invasive Cardiology"
};
doctor108.specializations = doctor108Specializations;
doctor108.experience = "30 Years";
doctor108.fees = 1350;

System.out.println("Doctor ID is " + doctor108.doctorId);
System.out.println("Doctor name is " + doctor108.doctorName);
System.out.println("Designation is " + doctor108.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor108.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor108.experience);
System.out.println("Fees for treatment is " + doctor108.fees);


Doctor doctor109 = new Doctor();
doctor109.doctorId = 109;
doctor109.doctorName = "Umesh Deshmukh";
doctor109.designation = "Senior Director & HOD Anaesthesiology | Fortis Shalimar Bagh";
String doctor109Specializations[] = {
    "Anaesthesia"
};
doctor109.specializations = doctor109Specializations;
doctor109.experience = "20 Years";
doctor109.fees = 1200;

System.out.println("Doctor ID is " + doctor109.doctorId);
System.out.println("Doctor name is " + doctor109.doctorName);
System.out.println("Designation is " + doctor109.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor109.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor109.experience);
System.out.println("Fees for treatment is " + doctor109.fees);


Doctor doctor110 = new Doctor();
doctor110.doctorId = 110;
doctor110.doctorName = "Vikas Maurya";
doctor110.designation = "Senior Director & HOD - Respiratory Medicine & Respiratory Critical Care | Fortis Shalimar Bagh";
String doctor110Specializations[] = {
    "Sleep Medicine",
    "Pulmonology and Critical care",
    "Pulmonology",
    "Interventional Pulmonology"
};
doctor110.specializations = doctor110Specializations;
doctor110.experience = "25 Years";
doctor110.fees = 1500;

System.out.println("Doctor ID is " + doctor110.doctorId);
System.out.println("Doctor name is " + doctor110.doctorName);
System.out.println("Designation is " + doctor110.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor110.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor110.experience);
System.out.println("Fees for treatment is " + doctor110.fees);


Doctor doctor111 = new Doctor();
doctor111.doctorId = 111;
doctor111.doctorName = "Vikram Sharma";
doctor111.designation = "Senior Director Urology | FMRI Gurgaon";
String doctor111Specializations[] = {
    "Uro-Oncology",
    "Urology"
};
doctor111.specializations = doctor111Specializations;
doctor111.experience = "39 Years";
doctor111.fees = 3000;

System.out.println("Doctor ID is " + doctor111.doctorId);
System.out.println("Doctor name is " + doctor111.doctorName);
System.out.println("Designation is " + doctor111.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor111.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor111.experience);
System.out.println("Fees for treatment is " + doctor111.fees);


Doctor doctor112 = new Doctor();
doctor112.doctorId = 112;
doctor112.doctorName = "Vimal Grover";
doctor112.designation = "Senior Director Obstetrics & Gynaecology | Fortis LaFemme GK II";
String doctor112Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor112.specializations = doctor112Specializations;
doctor112.experience = "45 Years";
doctor112.fees = 2000;

System.out.println("Doctor ID is " + doctor112.doctorId);
System.out.println("Doctor name is " + doctor112.doctorName);
System.out.println("Designation is " + doctor112.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor112.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor112.experience);
System.out.println("Fees for treatment is " + doctor112.fees);

Doctor doctor113 = new Doctor();
doctor113.doctorId = 113;
doctor113.doctorName = "Vinay Samuel Gaikwad";
doctor113.designation = "Senior Director Surgical Oncology | Fortis Manesar";
String doctor113Specializations[] = {
    "Oncology",
    "Oncology",
    "Surgical Oncology",
    "GI Oncology",
    "Robotic Surgery"
};
doctor113.specializations = doctor113Specializations;
doctor113.experience = "24 Years";
doctor113.fees = 1500;

System.out.println("Doctor ID is " + doctor113.doctorId);
System.out.println("Doctor name is " + doctor113.doctorName);
System.out.println("Designation is " + doctor113.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor113.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor113.experience);
System.out.println("Fees for treatment is " + doctor113.fees);


Doctor doctor114 = new Doctor();
doctor114.doctorId = 114;
doctor114.doctorName = "Vinayak Agrawal";
doctor114.designation = "Senior Director & Head of Non-Invasive Cardiology | FMRI Gurgaon";
String doctor114Specializations[] = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor114.specializations = doctor114Specializations;
doctor114.experience = "24 Years";
doctor114.fees = 1800;

System.out.println("Doctor ID is " + doctor114.doctorId);
System.out.println("Doctor name is " + doctor114.doctorName);
System.out.println("Designation is " + doctor114.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor114.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor114.experience);
System.out.println("Fees for treatment is " + doctor114.fees);


Doctor doctor115 = new Doctor();
doctor115.doctorId = 115;
doctor115.doctorName = "Vineeta Goel";
doctor115.designation = "Senior Director & HOD Radiation Oncology | Fortis Shalimar Bagh";
String doctor115Specializations[] = {
    "Oncology",
    "Radiation Oncology",
    "Oncology"
};
doctor115.specializations = doctor115Specializations;
doctor115.experience = "20 Years";
doctor115.fees = 1200;

System.out.println("Doctor ID is " + doctor115.doctorId);
System.out.println("Doctor name is " + doctor115.doctorName);
System.out.println("Designation is " + doctor115.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor115.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor115.experience);
System.out.println("Fees for treatment is " + doctor115.fees);


Doctor doctor116 = new Doctor();
doctor116.doctorId = 116;
doctor116.doctorName = "Vineeta Taneja";
doctor116.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String doctor116Specializations[] = {
    "Internal Medicine",
    "Geriatric Medicine",
    "General Physician",
    "Internal Medicine"
};
doctor116.specializations = doctor116Specializations;
doctor116.experience = "25 Years";
doctor116.fees = 1400;

System.out.println("Doctor ID is " + doctor116.doctorId);
System.out.println("Doctor name is " + doctor116.doctorName);
System.out.println("Designation is " + doctor116.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor116.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor116.experience);
System.out.println("Fees for treatment is " + doctor116.fees);


Doctor doctor117 = new Doctor();
doctor117.doctorId = 117;
doctor117.doctorName = "Vivek Jain";
doctor117.designation = "Senior Director & Unit Head Paediatrics | Fortis Shalimar Bagh";
String doctor117Specializations[] = {
    "Paediatrics",
    "Paediatrics"
};
doctor117.specializations = doctor117Specializations;
doctor117.experience = "18 Years";
doctor117.fees = 1500;

System.out.println("Doctor ID is " + doctor117.doctorId);
System.out.println("Doctor name is " + doctor117.doctorName);
System.out.println("Designation is " + doctor117.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor117.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor117.experience);
System.out.println("Fees for treatment is " + doctor117.fees);

Doctor doctor118 = new Doctor();
doctor118.doctorId = 118;
doctor118.doctorName = "Viney Jetley";
doctor118.designation = "Director Cardiology | Fortis Okhla";
String doctor118Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor118.specializations = doctor118Specializations;
doctor118.experience = "28 Years";
doctor118.fees = 2000;

System.out.println("Doctor ID is " + doctor118.doctorId);
System.out.println("Doctor name is " + doctor118.doctorName);
System.out.println("Designation is " + doctor118.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor118.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor118.experience);
System.out.println("Fees for treatment is " + doctor118.fees);


Doctor doctor119 = new Doctor();
doctor119.doctorId = 119;
doctor119.doctorName = "A.S. Bawa";
doctor119.designation = "Director Urology | Fortis Mohali";
String doctor119Specializations[] = {
    "Urology",
    "Uro-Oncology",
    "Paediatric Urology",
    "Urology"
};
doctor119.specializations = doctor119Specializations;
doctor119.experience = "32 Years";
doctor119.fees = 1400;

System.out.println("Doctor ID is " + doctor119.doctorId);
System.out.println("Doctor name is " + doctor119.doctorName);
System.out.println("Designation is " + doctor119.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor119.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor119.experience);
System.out.println("Fees for treatment is " + doctor119.fees);


Doctor doctor120 = new Doctor();
doctor120.doctorId = 120;
doctor120.doctorName = "Abhay Inderjit Ahluwalia";
doctor120.designation = "Director Endocrinology | FMRI Gurgaon";
String doctor120Specializations[] = {
    "Metabolic Surgery"
};
doctor120.specializations = doctor120Specializations;
doctor120.experience = "34 Years";
doctor120.fees = 2000;

System.out.println("Doctor ID is " + doctor120.doctorId);
System.out.println("Doctor name is " + doctor120.doctorName);
System.out.println("Designation is " + doctor120.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor120.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor120.experience);
System.out.println("Fees for treatment is " + doctor120.fees);


Doctor doctor121 = new Doctor();
doctor121.doctorId = 121;
doctor121.doctorName = "Ajay Marwaha";
doctor121.designation = "Director Nephrology | Fortis Jalandhar";
String doctor121Specializations[] = {
    "Nephrology",
    "Nephrology",
    "Kidney Transplant"
};
doctor121.specializations = doctor121Specializations;
doctor121.experience = "29 Years";
doctor121.fees = 700;

System.out.println("Doctor ID is " + doctor121.doctorId);
System.out.println("Doctor name is " + doctor121.doctorName);
System.out.println("Designation is " + doctor121.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor121.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor121.experience);
System.out.println("Fees for treatment is " + doctor121.fees);


Doctor doctor122 = new Doctor();
doctor122.doctorId = 122;
doctor122.doctorName = "Amal Roy Chaudhoory";
doctor122.designation = "Director Radiation Oncology | FMRI Gurgaon";
String doctor122Specializations[] = {
    "Oncology",
    "Radiation Oncology"
};
doctor122.specializations = doctor122Specializations;
doctor122.experience = "23 Years";
doctor122.fees = 1500;

System.out.println("Doctor ID is " + doctor122.doctorId);
System.out.println("Doctor name is " + doctor122.doctorName);
System.out.println("Designation is " + doctor122.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor122.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor122.experience);
System.out.println("Fees for treatment is " + doctor122.fees);

Doctor doctor123 = new Doctor();
doctor123.doctorId = 123;
doctor123.doctorName = "Aman Dua";
doctor123.designation = "Director Orthopaedics | Fortis Okhla";
String doctor123Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Orthopaedics and Spine Surgery",
    "Sports Medicine",
    "Orthopaedic Oncology",
    "Robotic and Computer navigated Joint reconstruction"
};
doctor123.specializations = doctor123Specializations;
doctor123.experience = "23 Years";
doctor123.fees = 1500;

System.out.println("Doctor ID is " + doctor123.doctorId);
System.out.println("Doctor name is " + doctor123.doctorName);
System.out.println("Designation is " + doctor123.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor123.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor123.experience);
System.out.println("Fees for treatment is " + doctor123.fees);


Doctor doctor124 = new Doctor();
doctor124.doctorId = 124;
doctor124.doctorName = "Amit Chaudhry";
doctor124.designation = "Director Orthopaedics | FMRI Gurgaon";
String doctor124Specializations[] = {
    "Robotic and Computer navigated Joint reconstruction",
    "Sports Medicine",
    "Orthopaedics",
    "Orthopaedic Oncology"
};
doctor124.specializations = doctor124Specializations;
doctor124.experience = "14 Years";
doctor124.fees = 1800;

System.out.println("Doctor ID is " + doctor124.doctorId);
System.out.println("Doctor name is " + doctor124.doctorName);
System.out.println("Designation is " + doctor124.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor124.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor124.experience);
System.out.println("Fees for treatment is " + doctor124.fees);


Doctor doctor125 = new Doctor();
doctor125.doctorId = 125;
doctor125.doctorName = "Amit Gupta";
doctor125.designation = "Director Paediatrics | Fortis Faridabad";
String doctor125Specializations[] = {
    "Neonatology",
    "Paediatrics"
};
doctor125.specializations = doctor125Specializations;
doctor125.experience = "28 Years";
doctor125.fees = 650;

System.out.println("Doctor ID is " + doctor125.doctorId);
System.out.println("Doctor name is " + doctor125.doctorName);
System.out.println("Designation is " + doctor125.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor125.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor125.experience);
System.out.println("Fees for treatment is " + doctor125.fees);


Doctor doctor126 = new Doctor();
doctor126.doctorId = 126;
doctor126.doctorName = "Amit Haldar";
doctor126.designation = "Director Neurology | Fortis Anandapur";
String doctor126Specializations[] = {
    "Neurology",
    "Neurology"
};
doctor126.specializations = doctor126Specializations;
doctor126.experience = "28 Years";
doctor126.fees = 1500;

System.out.println("Doctor ID is " + doctor126.doctorId);
System.out.println("Doctor name is " + doctor126.doctorName);
System.out.println("Designation is " + doctor126.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor126.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor126.experience);
System.out.println("Fees for treatment is " + doctor126.fees);


Doctor doctor127 = new Doctor();
doctor127.doctorId = 127;
doctor127.doctorName = "Amit Kulkarni";
doctor127.designation = "Director Neurology | Fortis BG Road";
String doctor127Specializations[] = {
    "Neurology",
    "Neurology"
};
doctor127.specializations = doctor127Specializations;
doctor127.experience = "20 Years";
doctor127.fees = 1200;

System.out.println("Doctor ID is " + doctor127.doctorId);
System.out.println("Doctor name is " + doctor127.doctorName);
System.out.println("Designation is " + doctor127.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor127.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor127.experience);
System.out.println("Fees for treatment is " + doctor127.fees);

Doctor doctor128 = new Doctor();
doctor128.doctorId = 128;
doctor128.doctorName = "Amit Prakash";
doctor128.designation = "Director & HOD Cardiac Anaesthesia | Fortis Shalimar Bagh";
String doctor128Specializations[] = {
    "Anaesthesia"
};
doctor128.specializations = doctor128Specializations;
doctor128.experience = "21 Years";
doctor128.fees = 0;

System.out.println("Doctor ID is " + doctor128.doctorId);
System.out.println("Doctor name is " + doctor128.doctorName);
System.out.println("Designation is " + doctor128.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor128.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor128.experience);
System.out.println("Fees for treatment is " + doctor128.fees);


Doctor doctor129 = new Doctor();
doctor129.doctorId = 129;
doctor129.doctorName = "Amit Kumar Singhal";
doctor129.designation = "Director Cardiology | Fortis Jaipur";
String doctor129Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor129.specializations = doctor129Specializations;
doctor129.experience = "13 Years";
doctor129.fees = 900;

System.out.println("Doctor ID is " + doctor129.doctorId);
System.out.println("Doctor name is " + doctor129.doctorName);
System.out.println("Designation is " + doctor129.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor129.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor129.experience);
System.out.println("Fees for treatment is " + doctor129.fees);


Doctor doctor130 = new Doctor();
doctor130.doctorId = 130;
doctor130.doctorName = "Anand Sinha";
doctor130.designation = "Director Paediatrics | FMRI Gurgaon";
String doctor130Specializations[] = {
    "Paediatrics",
    "Paediatric Surgery",
    "Paediatrics"
};
doctor130.specializations = doctor130Specializations;
doctor130.experience = "17 Years";
doctor130.fees = 1200;

System.out.println("Doctor ID is " + doctor130.doctorId);
System.out.println("Doctor name is " + doctor130.doctorName);
System.out.println("Designation is " + doctor130.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor130.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor130.experience);
System.out.println("Fees for treatment is " + doctor130.fees);


Doctor doctor131 = new Doctor();
doctor131.doctorId = 131;
doctor131.doctorName = "Anil Kumar Anand";
doctor131.designation = "Director & HOD Radiation Oncology | FCI Defence Colony";
String doctor131Specializations[] = {
    "Oncology",
    "Radiation Oncology"
};
doctor131.specializations = doctor131Specializations;
doctor131.experience = "31 Years";
doctor131.fees = 2000;

System.out.println("Doctor ID is " + doctor131.doctorId);
System.out.println("Doctor name is " + doctor131.doctorName);
System.out.println("Designation is " + doctor131.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor131.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor131.experience);
System.out.println("Fees for treatment is " + doctor131.fees);


Doctor doctor132 = new Doctor();
doctor132.doctorId = 132;
doctor132.doctorName = "Anita Malik (Oncology)";
doctor132.designation = "Director Radiation Oncology | Fortis Noida";
String doctor132Specializations[] = {
    "Oncology",
    "Radiation Oncology"
};
doctor132.specializations = doctor132Specializations;
doctor132.experience = "15 Years";
doctor132.fees = 1000;

System.out.println("Doctor ID is " + doctor132.doctorId);
System.out.println("Doctor name is " + doctor132.doctorName);
System.out.println("Designation is " + doctor132.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor132.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor132.experience);
System.out.println("Fees for treatment is " + doctor132.fees);

Doctor doctor133 = new Doctor();
doctor133.doctorId = 133;
doctor133.doctorName = "Anita Mathew";
doctor133.designation = "Director Internal Medicine | Fortis Mulund";
String doctor133Specializations[] = {
    "Internal Medicine",
    "Internal Medicine",
    "General Physician"
};
doctor133.specializations = doctor133Specializations;
doctor133.experience = "17 Years";
doctor133.fees = 1500;

System.out.println("Doctor ID is " + doctor133.doctorId);
System.out.println("Doctor name is " + doctor133.doctorName);
System.out.println("Designation is " + doctor133.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor133.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor133.experience);
System.out.println("Fees for treatment is " + doctor133.fees);


Doctor doctor134 = new Doctor();
doctor134.doctorId = 134;
doctor134.doctorName = "Anjana Singh";
doctor134.designation = "Director Obstetrics & Gynaecology | Fortis Noida";
String doctor134Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor134.specializations = doctor134Specializations;
doctor134.experience = "23 Years";
doctor134.fees = 1200;

System.out.println("Doctor ID is " + doctor134.doctorId);
System.out.println("Doctor name is " + doctor134.doctorName);
System.out.println("Designation is " + doctor134.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor134.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor134.experience);
System.out.println("Fees for treatment is " + doctor134.fees);


Doctor doctor135 = new Doctor();
doctor135.doctorId = 135;
doctor135.doctorName = "Anuja Porwal";
doctor135.designation = "Director Nephrology | Fortis Noida";
String doctor135Specializations[] = {
    "Nephrology",
    "Nephrology"
};
doctor135.specializations = doctor135Specializations;
doctor135.experience = "15 Years";
doctor135.fees = 1400;

System.out.println("Doctor ID is " + doctor135.doctorId);
System.out.println("Doctor name is " + doctor135.doctorName);
System.out.println("Designation is " + doctor135.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor135.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor135.experience);
System.out.println("Fees for treatment is " + doctor135.fees);


Doctor doctor136 = new Doctor();
doctor136.doctorId = 136;
doctor136.doctorName = "Anup Gulati";
doctor136.designation = "Director Urology | Fortis Faridabad";
String doctor136Specializations[] = {
    "Urology",
    "Urology"
};
doctor136.specializations = doctor136Specializations;
doctor136.experience = "20 Years";
doctor136.fees = 900;

System.out.println("Doctor ID is " + doctor136.doctorId);
System.out.println("Doctor name is " + doctor136.doctorName);
System.out.println("Designation is " + doctor136.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor136.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor136.experience);
System.out.println("Fees for treatment is " + doctor136.fees);


Doctor doctor137 = new Doctor();
doctor137.doctorId = 137;
doctor137.doctorName = "Anupam Jindal";
doctor137.designation = "Director Neuro Surgery | Fortis Mohali";
String doctor137Specializations[] = {
    "Neurosurgery",
    "Neurosurgery"
};
doctor137.specializations = doctor137Specializations;
doctor137.experience = "25 Years";
doctor137.fees = 1050;

System.out.println("Doctor ID is " + doctor137.doctorId);
System.out.println("Doctor name is " + doctor137.doctorName);
System.out.println("Designation is " + doctor137.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor137.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor137.experience);
System.out.println("Fees for treatment is " + doctor137.fees);

Doctor doctor138 = new Doctor();
doctor138.doctorId = 138;
doctor138.doctorName = "Aparna Jaswal";
doctor138.designation = "Director Cardiology | Fortis Okhla";
String doctor138Specializations[] = {
    "Cardiac Sciences",
    "Electrophysiology"
};
doctor138.specializations = doctor138Specializations;
doctor138.experience = "19 Years";
doctor138.fees = 2000;

System.out.println("Doctor ID is " + doctor138.doctorId);
System.out.println("Doctor name is " + doctor138.doctorName);
System.out.println("Designation is " + doctor138.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor138.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor138.experience);
System.out.println("Fees for treatment is " + doctor138.fees);


Doctor doctor139 = new Doctor();
doctor139.doctorId = 139;
doctor139.doctorName = "Archit Pandit";
doctor139.designation = "Director Surgical Oncology | Fortis Okhla";
String doctor139Specializations[] = {
    "Head and Neck Oncosurgery",
    "Oncology",
    "Surgical Oncology",
    "Gynaecologic Oncology",
    "Robotic Surgery"
};
doctor139.specializations = doctor139Specializations;
doctor139.experience = "15 Years";
doctor139.fees = 1500;

System.out.println("Doctor ID is " + doctor139.doctorId);
System.out.println("Doctor name is " + doctor139.doctorName);
System.out.println("Designation is " + doctor139.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor139.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor139.experience);
System.out.println("Fees for treatment is " + doctor139.fees);


Doctor doctor140 = new Doctor();
doctor140.doctorId = 140;
doctor140.doctorName = "Arpana Jain";
doctor140.designation = "Director Obstetrics & Gynaecology | Fortis Shalimar Bagh";
String doctor140Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor140.specializations = doctor140Specializations;
doctor140.experience = "27 Years";
doctor140.fees = 1500;

System.out.println("Doctor ID is " + doctor140.doctorId);
System.out.println("Doctor name is " + doctor140.doctorName);
System.out.println("Designation is " + doctor140.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor140.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor140.experience);
System.out.println("Fees for treatment is " + doctor140.fees);


Doctor doctor141 = new Doctor();
doctor141.doctorId = 141;
doctor141.doctorName = "Arun Kumar";
doctor141.designation = "Director MICU | Fortis Mohali";
String doctor141Specializations[] = {
    "Intensive Care and Critical Care",
    "Interventional Cardiology"
};
doctor141.specializations = doctor141Specializations;
doctor141.experience = "20 Years";
doctor141.fees = 1050;

System.out.println("Doctor ID is " + doctor141.doctorId);
System.out.println("Doctor name is " + doctor141.doctorName);
System.out.println("Designation is " + doctor141.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor141.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor141.experience);
System.out.println("Fees for treatment is " + doctor141.fees);


Doctor doctor142 = new Doctor();
doctor142.doctorId = 142;
doctor142.doctorName = "Arun Kumar Chopra";
doctor142.designation = "Director Cardiology | Fortis Amritsar";
String doctor142Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor142.specializations = doctor142Specializations;
doctor142.experience = "22 Years";
doctor142.fees = 1000;

System.out.println("Doctor ID is " + doctor142.doctorId);
System.out.println("Doctor name is " + doctor142.doctorName);
System.out.println("Designation is " + doctor142.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor142.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor142.experience);
System.out.println("Fees for treatment is " + doctor142.fees);

Doctor doctor143 = new Doctor();
doctor143.doctorId = 143;
doctor143.doctorName = "Arupratan Dutta / Dr. Arindam Kargupta Team";
doctor143.designation = "Director Nephrology | FHKI Kolkata";
String doctor143Specializations[] = {
    "Nephrology",
    "Nephrology"
};
doctor143.specializations = doctor143Specializations;
doctor143.experience = "35 Years";
doctor143.fees = 2000;

System.out.println("Doctor ID is " + doctor143.doctorId);
System.out.println("Doctor name is " + doctor143.doctorName);
System.out.println("Designation is " + doctor143.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor143.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor143.experience);
System.out.println("Fees for treatment is " + doctor143.fees);


Doctor doctor144 = new Doctor();
doctor144.doctorId = 144;
doctor144.doctorName = "Arvind Goyal";
doctor144.designation = "Director Urology | Fortis Ludhiana";
String doctor144Specializations[] = {
    "Urology",
    "Urology",
    "Kidney Transplant"
};
doctor144.specializations = doctor144Specializations;
doctor144.experience = "33 Years";
doctor144.fees = 1000;

System.out.println("Doctor ID is " + doctor144.doctorId);
System.out.println("Doctor name is " + doctor144.doctorName);
System.out.println("Designation is " + doctor144.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor144.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor144.experience);
System.out.println("Fees for treatment is " + doctor144.fees);


Doctor doctor145 = new Doctor();
doctor145.doctorId = 145;
doctor145.doctorName = "Arvind Goyal";
doctor145.designation = "Director Urology | Fortis Mall Road";
String doctor145Specializations[] = {
    "Urology",
    "Urology",
    "Kidney Transplant"
};
doctor145.specializations = doctor145Specializations;
doctor145.experience = "33 Years";
doctor145.fees = 1000;

System.out.println("Doctor ID is " + doctor145.doctorId);
System.out.println("Doctor name is " + doctor145.doctorName);
System.out.println("Designation is " + doctor145.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor145.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor145.experience);
System.out.println("Fees for treatment is " + doctor145.fees);


Doctor doctor146 = new Doctor();
doctor146.doctorId = 146;
doctor146.doctorName = "Arvind Kumar";
doctor146.designation = "Director Ophthalmology | Fortis Faridabad";
String doctor146Specializations[] = {
    "Ophthalmology"
};
doctor146.specializations = doctor146Specializations;
doctor146.experience = "19 Years";
doctor146.fees = 700;

System.out.println("Doctor ID is " + doctor146.doctorId);
System.out.println("Doctor name is " + doctor146.doctorName);
System.out.println("Designation is " + doctor146.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor146.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor146.experience);
System.out.println("Fees for treatment is " + doctor146.fees);


Doctor doctor147 = new Doctor();
doctor147.doctorId = 147;
doctor147.doctorName = "Arvind Sahni";
doctor147.designation = "Director Gastroenterology | Fortis Mohali";
String doctor147Specializations[] = {
    "Gastroenterology",
    "Gastroenterology"
};
doctor147.specializations = doctor147Specializations;
doctor147.experience = "31 Years";
doctor147.fees = 1550;

System.out.println("Doctor ID is " + doctor147.doctorId);
System.out.println("Doctor name is " + doctor147.doctorName);
System.out.println("Designation is " + doctor147.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor147.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor147.experience);
System.out.println("Fees for treatment is " + doctor147.fees);

Doctor doctor148 = new Doctor();
doctor148.doctorId = 148;
doctor148.doctorName = "Arvind Sethi";
doctor148.designation = "Director Cardiology | Fortis Shalimar Bagh";
String doctor148Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor148.specializations = doctor148Specializations;
doctor148.experience = "20 Years";
doctor148.fees = 1800;

System.out.println("Doctor ID is " + doctor148.doctorId);
System.out.println("Doctor name is " + doctor148.doctorName);
System.out.println("Designation is " + doctor148.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor148.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor148.experience);
System.out.println("Fees for treatment is " + doctor148.fees);


Doctor doctor149 = new Doctor();
doctor149.doctorId = 149;
doctor149.doctorName = "Arvinder Singh Chilana";
doctor149.designation = "Director General Surgery | Fortis Shalimar Bagh";
String doctor149Specializations[] = {
    "General and Minimal Access Surgery",
    "General and Laparoscopic Surgery",
    "General Surgery"
};
doctor149.specializations = doctor149Specializations;
doctor149.experience = "35 Years";
doctor149.fees = 1200;

System.out.println("Doctor ID is " + doctor149.doctorId);
System.out.println("Doctor name is " + doctor149.doctorName);
System.out.println("Designation is " + doctor149.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor149.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor149.experience);
System.out.println("Fees for treatment is " + doctor149.fees);


Doctor doctor150 = new Doctor();
doctor150.doctorId = 150;
doctor150.doctorName = "Ashis Pathak";
doctor150.designation = "Director Neuro Surgery | Fortis Mohali";
String doctor150Specializations[] = {
    "Neurosurgery",
    "Neurosurgery"
};
doctor150.specializations = doctor150Specializations;
doctor150.experience = "41 Years";
doctor150.fees = 1550;

System.out.println("Doctor ID is " + doctor150.doctorId);
System.out.println("Doctor name is " + doctor150.doctorName);
System.out.println("Designation is " + doctor150.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor150.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor150.experience);
System.out.println("Fees for treatment is " + doctor150.fees);


Doctor doctor151 = new Doctor();
doctor151.doctorId = 151;
doctor151.doctorName = "Ashish Gupta";
doctor151.designation = "Director Neurosurgery | Fortis Mohali";
String doctor151Specializations[] = {
    "Neurosurgery",
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor151.specializations = doctor151Specializations;
doctor151.experience = "23 Years";
doctor151.fees = 1550;

System.out.println("Doctor ID is " + doctor151.doctorId);
System.out.println("Doctor name is " + doctor151.doctorName);
System.out.println("Designation is " + doctor151.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor151.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor151.experience);
System.out.println("Fees for treatment is " + doctor151.fees);


Doctor doctor152 = new Doctor();
doctor152.doctorId = 152;
doctor152.doctorName = "Ashok Omar";
doctor152.designation = "Director Non Invasive Cardiology | Fortis Okhla";
String doctor152Specializations[] = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor152.specializations = doctor152Specializations;
doctor152.experience = "33 Years";
doctor152.fees = 2000;

System.out.println("Doctor ID is " + doctor152.doctorId);
System.out.println("Doctor name is " + doctor152.doctorName);
System.out.println("Designation is " + doctor152.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor152.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor152.experience);
System.out.println("Fees for treatment is " + doctor152.fees);

Doctor doctor153 = new Doctor();
doctor153.doctorId = 153;
doctor153.doctorName = "Ashutosh Marwah";
doctor153.designation = "Director Paediatric Cardiology | Fortis Okhla";
String doctor153Specializations[] = {
    "Paediatric Cardiac Sciences"
};
doctor153.specializations = doctor153Specializations;
doctor153.experience = "28 Years";
doctor153.fees = 1500;

System.out.println("Doctor ID is " + doctor153.doctorId);
System.out.println("Doctor name is " + doctor153.doctorName);
System.out.println("Designation is " + doctor153.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor153.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor153.experience);
System.out.println("Fees for treatment is " + doctor153.fees);


Doctor doctor154 = new Doctor();
doctor154.doctorId = 154;
doctor154.doctorName = "Ashutosh Shrivastav";
doctor154.designation = "Director Orthopaedics | Fortis Faridabad";
String doctor154Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Sports Medicine"
};
doctor154.specializations = doctor154Specializations;
doctor154.experience = "23 Years";
doctor154.fees = 700;

System.out.println("Doctor ID is " + doctor154.doctorId);
System.out.println("Doctor name is " + doctor154.doctorName);
System.out.println("Designation is " + doctor154.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor154.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor154.experience);
System.out.println("Fees for treatment is " + doctor154.fees);


Doctor doctor155 = new Doctor();
doctor155.doctorId = 155;
doctor155.doctorName = "Atul Limaye";
doctor155.designation = "Director Cardiology & TAVI Services | Fortis Mulund";
String doctor155Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor155.specializations = doctor155Specializations;
doctor155.experience = "22 Years";
doctor155.fees = 2500;

System.out.println("Doctor ID is " + doctor155.doctorId);
System.out.println("Doctor name is " + doctor155.doctorName);
System.out.println("Designation is " + doctor155.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor155.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor155.experience);
System.out.println("Fees for treatment is " + doctor155.fees);


Doctor doctor156 = new Doctor();
doctor156.doctorId = 156;
doctor156.doctorName = "Atul Morarji Ganatra";
doctor156.designation = "Director Obstetrics & Gynaecology | Fortis Mulund";
String doctor156Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor156.specializations = doctor156Specializations;
doctor156.experience = "33 Years";
doctor156.fees = 2000;

System.out.println("Doctor ID is " + doctor156.doctorId);
System.out.println("Doctor name is " + doctor156.doctorName);
System.out.println("Designation is " + doctor156.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor156.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor156.experience);
System.out.println("Fees for treatment is " + doctor156.fees);


Doctor doctor157 = new Doctor();
doctor157.doctorId = 157;
doctor157.doctorName = "Avanish Saklani";
doctor157.designation = "Director Surgical Oncology | Fortis Mulund";
String doctor157Specializations[] = {
    "Surgical Oncology",
    "Robotic Surgery"
};
doctor157.specializations = doctor157Specializations;
doctor157.experience = "25 Years";
doctor157.fees = 2000;

System.out.println("Doctor ID is " + doctor157.doctorId);
System.out.println("Doctor name is " + doctor157.doctorName);
System.out.println("Designation is " + doctor157.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor157.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor157.experience);
System.out.println("Fees for treatment is " + doctor157.fees);

Doctor doctor158 = new Doctor();
doctor158.doctorId = 158;
doctor158.doctorName = "Ayesha Zafar Siddiqui";
doctor158.designation = "Director Radiology | Fortis Noida";
String doctor158Specializations[] = {
    "Radiology"
};
doctor158.specializations = doctor158Specializations;
doctor158.experience = "20 Years";
doctor158.fees = 1000;

System.out.println("Doctor ID is " + doctor158.doctorId);
System.out.println("Doctor name is " + doctor158.doctorName);
System.out.println("Designation is " + doctor158.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor158.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor158.experience);
System.out.println("Fees for treatment is " + doctor158.fees);


Doctor doctor159 = new Doctor();
doctor159.doctorId = 159;
doctor159.doctorName = "BN Singh";
doctor159.designation = "Director Internal Medicine | Fortis Faridabad";
String doctor159Specializations[] = {
    "General Physician"
};
doctor159.specializations = doctor159Specializations;
doctor159.experience = "35 Years";
doctor159.fees = 800;

System.out.println("Doctor ID is " + doctor159.doctorId);
System.out.println("Doctor name is " + doctor159.doctorName);
System.out.println("Designation is " + doctor159.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor159.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor159.experience);
System.out.println("Fees for treatment is " + doctor159.fees);


Doctor doctor160 = new Doctor();
doctor160.doctorId = 160;
doctor160.doctorName = "Bandana Sodhi";
doctor160.designation = "Director Obstetrics & Gynaecology | Fortis LaFemme GK II";
String doctor160Specializations[] = {
    "Obstetrics and Gynaecology",
    "Obstetrics and Gynaecology"
};
doctor160.specializations = doctor160Specializations;
doctor160.experience = "35 Years";
doctor160.fees = 1500;

System.out.println("Doctor ID is " + doctor160.doctorId);
System.out.println("Doctor name is " + doctor160.doctorName);
System.out.println("Designation is " + doctor160.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor160.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor160.experience);
System.out.println("Fees for treatment is " + doctor160.fees);


Doctor doctor161 = new Doctor();
doctor161.doctorId = 161;
doctor161.doctorName = "Basabbijay Sarkar";
doctor161.designation = "Director Internal Medicine | Fortis Anandapur";
String doctor161Specializations[] = {
    "Internal Medicine",
    "Internal Medicine"
};
doctor161.specializations = doctor161Specializations;
doctor161.experience = "23 Years";
doctor161.fees = 1600;

System.out.println("Doctor ID is " + doctor161.doctorId);
System.out.println("Doctor name is " + doctor161.doctorName);
System.out.println("Designation is " + doctor161.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor161.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor161.experience);
System.out.println("Fees for treatment is " + doctor161.fees);


Doctor doctor162 = new Doctor();
doctor162.doctorId = 162;
doctor162.doctorName = "Bimlesh Dhar Pandey";
doctor162.designation = "Director Rheumatology | Fortis Noida";
String doctor162Specializations[] = {
    "Rheumatology"
};
doctor162.specializations = doctor162Specializations;
doctor162.experience = "17 Years";
doctor162.fees = 1500;

System.out.println("Doctor ID is " + doctor162.doctorId);
System.out.println("Doctor name is " + doctor162.doctorName);
System.out.println("Designation is " + doctor162.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor162.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor162.experience);
System.out.println("Fees for treatment is " + doctor162.fees);

Doctor doctor163 = new Doctor();
doctor163.doctorId = 163;
doctor163.doctorName = "Boman Nariman Dhabhar";
doctor163.designation = "Director Oncology | Fortis Mulund";
String doctor163Specializations[] = {
    "Medical Oncology"
};
doctor163.specializations = doctor163Specializations;
doctor163.experience = "22 Years";
doctor163.fees = 2000;

System.out.println("Doctor ID is " + doctor163.doctorId);
System.out.println("Doctor name is " + doctor163.doctorName);
System.out.println("Designation is " + doctor163.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor163.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor163.experience);
System.out.println("Fees for treatment is " + doctor163.fees);


Doctor doctor164 = new Doctor();
doctor164.doctorId = 164;
doctor164.doctorName = "Charudatt Vaity";
doctor164.designation = "Director Critical Care | Fortis Mulund";
String doctor164Specializations[] = {
    "Critical Care"
};
doctor164.specializations = doctor164Specializations;
doctor164.experience = "20 Years";
doctor164.fees = 1500;

System.out.println("Doctor ID is " + doctor164.doctorId);
System.out.println("Doctor name is " + doctor164.doctorName);
System.out.println("Designation is " + doctor164.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor164.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor164.experience);
System.out.println("Fees for treatment is " + doctor164.fees);


Doctor doctor165 = new Doctor();
doctor165.doctorId = 165;
doctor165.doctorName = "Davinder Mohan";
doctor165.designation = "Director Cardio Thoracic Vascular Surgery | Fortis Amritsar";
String doctor165Specializations[] = {
    "Adult CTVS (Cardiothoracic and Vascular Surgery)"
};
doctor165.specializations = doctor165Specializations;
doctor165.experience = "24 Years";
doctor165.fees = 700;

System.out.println("Doctor ID is " + doctor165.doctorId);
System.out.println("Doctor name is " + doctor165.doctorName);
System.out.println("Designation is " + doctor165.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor165.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor165.experience);
System.out.println("Fees for treatment is " + doctor165.fees);


Doctor doctor166 = new Doctor();
doctor166.doctorId = 166;
doctor166.doctorName = "Deepak Joshi";
doctor166.designation = "Director Orthopaedics | Fortis Mohali";
String doctor166Specializations[] = {
    "Orthopaedics",
    "Orthopaedics and Spine Surgery"
};
doctor166.specializations = doctor166Specializations;
doctor166.experience = "20 Years";
doctor166.fees = 1050;

System.out.println("Doctor ID is " + doctor166.doctorId);
System.out.println("Doctor name is " + doctor166.doctorName);
System.out.println("Designation is " + doctor166.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor166.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor166.experience);
System.out.println("Fees for treatment is " + doctor166.fees);


Doctor doctor167 = new Doctor();
doctor167.doctorId = 167;
doctor167.doctorName = "Deepak Kapila";
doctor167.designation = "Director Cardiology | Fortis Amritsar";
String doctor167Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor167.specializations = doctor167Specializations;
doctor167.experience = "22 Years";
doctor167.fees = 800;

System.out.println("Doctor ID is " + doctor167.doctorId);
System.out.println("Doctor name is " + doctor167.doctorName);
System.out.println("Designation is " + doctor167.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor167.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor167.experience);
System.out.println("Fees for treatment is " + doctor167.fees);

Doctor doctor168 = new Doctor();
doctor168.doctorId = 168;
doctor168.doctorName = "Deepak Kumar Jain(IOSPL)";
doctor168.designation = "Director Surgical Oncology | Fortis Noida";
String doctor168Specializations[] = {
    "Surgical Oncology"
};
doctor168.specializations = doctor168Specializations;
doctor168.experience = "15 Years";
doctor168.fees = 1000;

System.out.println("Doctor ID is " + doctor168.doctorId);
System.out.println("Doctor name is " + doctor168.doctorName);
System.out.println("Designation is " + doctor168.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor168.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor168.experience);
System.out.println("Fees for treatment is " + doctor168.fees);


Doctor doctor169 = new Doctor();
doctor169.doctorId = 169;
doctor169.doctorName = "Deepak Kumar Bhasin";
doctor169.designation = "Director Gastroenterology | Fortis Mohali";
String doctor169Specializations[] = {
    "Gastroenterology",
    "Gastroenterology and Hepatobiliary Sciences"
};
doctor169.specializations = doctor169Specializations;
doctor169.experience = "47 Years";
doctor169.fees = 1550;

System.out.println("Doctor ID is " + doctor169.doctorId);
System.out.println("Doctor name is " + doctor169.doctorName);
System.out.println("Designation is " + doctor169.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor169.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor169.experience);
System.out.println("Fees for treatment is " + doctor169.fees);


Doctor doctor170 = new Doctor();
doctor170.doctorId = 170;
doctor170.doctorName = "Deepali Marwaha";
doctor170.designation = "Director Radiology | Fortis Jalandhar";
String doctor170Specializations[] = {
    "Radiology"
};
doctor170.specializations = doctor170Specializations;
doctor170.experience = "26 Years";
doctor170.fees = 600;

System.out.println("Doctor ID is " + doctor170.doctorId);
System.out.println("Doctor name is " + doctor170.doctorName);
System.out.println("Designation is " + doctor170.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor170.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor170.experience);
System.out.println("Fees for treatment is " + doctor170.fees);


Doctor doctor171 = new Doctor();
doctor171.doctorId = 171;
doctor171.doctorName = "Deshpande Vasudevarao Rajakumar";
doctor171.designation = "Director Neuro Surgery | Fortis BG Road";
String doctor171Specializations[] = {
    "Neurosurgery",
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor171.specializations = doctor171Specializations;
doctor171.experience = "31 Years";
doctor171.fees = 1200;

System.out.println("Doctor ID is " + doctor171.doctorId);
System.out.println("Doctor name is " + doctor171.doctorName);
System.out.println("Designation is " + doctor171.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor171.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor171.experience);
System.out.println("Fees for treatment is " + doctor171.fees);


Doctor doctor172 = new Doctor();
doctor172.doctorId = 172;
doctor172.doctorName = "Dibyendu Mukherjee";
doctor172.designation = "Director Internal Medicine | Fortis Anandapur";
String doctor172Specializations[] = {
    "Internal Medicine",
    "Internal Medicine"
};
doctor172.specializations = doctor172Specializations;
doctor172.experience = "25 Years";
doctor172.fees = 1500;


System.out.println("Doctor ID is " + doctor172.doctorId);
System.out.println("Doctor name is " + doctor172.doctorName);
System.out.println("Designation is " + doctor172.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor172.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor172.experience);
System.out.println("Fees for treatment is " + doctor172.fees);


Doctor doctor173 = new Doctor();
doctor173.doctorId = 173;
doctor173.doctorName = "Digambar Behera";
doctor173.designation = "Director Pulmonology | Fortis Mohali";
String doctor173Specializations[] = {
    "Pulmonology",
    "Pulmonology"
};
doctor173.specializations = doctor173Specializations;
doctor173.experience = "41 Years";
doctor173.fees = 1500;

System.out.println("Doctor ID is " + doctor173.doctorId);
System.out.println("Doctor name is " + doctor173.doctorName);
System.out.println("Designation is " + doctor173.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor173.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor173.experience);
System.out.println("Fees for treatment is " + doctor173.fees);


Doctor doctor174 = new Doctor();
doctor174.doctorId = 174;
doctor174.doctorName = "Dinesh Kapoor";
doctor174.designation = "Director Radiology | Fortis Noida";
String doctor174Specializations[] = {
    "Radiology",
    "Radiology"
};
doctor174.specializations = doctor174Specializations;
doctor174.experience = "30 Years";
doctor174.fees = 1000;

System.out.println("Doctor ID is " + doctor174.doctorId);
System.out.println("Doctor name is " + doctor174.doctorName);
System.out.println("Designation is " + doctor174.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor174.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor174.experience);
System.out.println("Fees for treatment is " + doctor174.fees);


Doctor doctor175 = new Doctor();
doctor175.doctorId = 175;
doctor175.doctorName = "Dinesh Kumar";
doctor175.designation = "Director Internal Medicine | Fortis Greater Noida";
String doctor175Specializations[] = {
    "Internal Medicine",
    "General Physician",
    "Internal Medicine"
};
doctor175.specializations = doctor175Specializations;
doctor175.experience = "31 Years";
doctor175.fees = 900;

System.out.println("Doctor ID is " + doctor175.doctorId);
System.out.println("Doctor name is " + doctor175.doctorName);
System.out.println("Designation is " + doctor175.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor175.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor175.experience);
System.out.println("Fees for treatment is " + doctor175.fees);


Doctor doctor176 = new Doctor();
doctor176.doctorId = 176;
doctor176.doctorName = "Farah Atul Ingale";
doctor176.designation = "Director Internal Medicine | Fortis Vashi";
String doctor176Specializations[] = {
    "Internal Medicine",
    "Internal Medicine"
};
doctor176.specializations = doctor176Specializations;
doctor176.experience = "36 Years";
doctor176.fees = 1800;

System.out.println("Doctor ID is " + doctor176.doctorId);
System.out.println("Doctor name is " + doctor176.doctorName);
System.out.println("Designation is " + doctor176.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor176.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor176.experience);
System.out.println("Fees for treatment is " + doctor176.fees);


Doctor doctor177 = new Doctor();
doctor177.doctorId = 177;
doctor177.doctorName = "G.R. Vijay Kumar";
doctor177.designation = "Director Neuro Surgery | Fortis Anandapur";
String doctor177Specializations[] = {
    "Neurosurgery",
    "Neurosurgery"
};
doctor177.specializations = doctor177Specializations;
doctor177.experience = "36 Years";
doctor177.fees = 1500;

System.out.println("Doctor ID is " + doctor177.doctorId);
System.out.println("Doctor name is " + doctor177.doctorName);
System.out.println("Designation is " + doctor177.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor177.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor177.experience);
System.out.println("Fees for treatment is " + doctor177.fees);


Doctor doctor178 = new Doctor();
doctor178.doctorId = 178;
doctor178.doctorName = "G.S Kalra";
doctor178.designation = "Director Cardiology | Fortis Mohali";
String doctor178Specializations[] = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor178.specializations = doctor178Specializations;
doctor178.experience = "40 Years";
doctor178.fees = 1550;



System.out.println("Doctor ID is " + doctor178.doctorId);
System.out.println("Doctor name is " + doctor178.doctorName);
System.out.println("Designation is " + doctor178.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor178.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor178.experience);
System.out.println("Fees for treatment is " + doctor178.fees);


Doctor doctor179 = new Doctor();
doctor179.doctorId = 179;
doctor179.doctorName = "Gagan Deep Chhabra";
doctor179.designation = "Director Nephrology | Fortis Vasant Kunj";
String doctor179Specializations[] = {
    "Nephrology",
    "Nephrology",
    "Kidney Transplant"
};
doctor179.specializations = doctor179Specializations;
doctor179.experience = "15 Years";
doctor179.fees = 1500;

System.out.println("Doctor ID is " + doctor179.doctorId);
System.out.println("Doctor name is " + doctor179.doctorName);
System.out.println("Designation is " + doctor179.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor179.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor179.experience);
System.out.println("Fees for treatment is " + doctor179.fees);


Doctor doctor180 = new Doctor();
doctor180.doctorId = 180;
doctor180.doctorName = "Garud Suresh Chandan";
doctor180.designation = "Director Critical Care | Fortis BG Road";
String doctor180Specializations[] = {
    "Intensive Care and Critical Care"
};
doctor180.specializations = doctor180Specializations;
doctor180.experience = "22 Years";
doctor180.fees = 1150;

System.out.println("Doctor ID is " + doctor180.doctorId);
System.out.println("Doctor name is " + doctor180.doctorName);
System.out.println("Designation is " + doctor180.designation);
System.out.println("The doctor is Specialized in: ");
for(String specialized : doctor180.specializations){
    System.out.println(specialized);
}
System.out.println("Years of experience is " + doctor180.experience);
System.out.println("Fees for treatment is " + doctor180.fees);



	}
}