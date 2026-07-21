class Reception{
	public static void book(String patientName,String symptom,String email,long phoneNumber){
		System.out.println("the booking process started");
	Hospital.bookAppointment(patientName,symptom);
	System.out.println("booking ended");
	System.out.println("the patient name is "+patientName);
	System.out.println("the patient symptom is"+symptom);
	System.out.println("the patient email is"+email);
	System.out.println("the patient phoneNumber is"+phoneNumber);
	}
	}