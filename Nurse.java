class Nurse{
	public static void basicCheck(String patientName,String symptom,boolean isBP, boolean isSugar){
		System.out.println("the basic check started");
	Doctor.treat(patientName,symptom);
	System.out.println("the basic check ended");
}
}