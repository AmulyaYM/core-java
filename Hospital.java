class Hospital{
	public static void bookAppointment(String patientName, String symptom){
		System.out.println("the appointment has been booked");
		Nurse.basicCheck(patientName,symptom,true,false);
		System.out.println("the appointment has ended");
}

}