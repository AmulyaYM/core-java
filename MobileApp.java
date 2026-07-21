class MobileApp{
	public static void register(String patientName,String symptom,String email,long phoneNumner){
		Reception.book(patientName,symptom,email,phoneNumner);
		System.out.println("patient details collected");
		}
		}