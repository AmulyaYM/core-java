class Countryyy{
	public static String[] getStates(String country){
	 
	 if(country =="india"){
	String indiaStates[] = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana",
							"Himachal Pradesh","Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", 
							"Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha", "Punjab", "Rajasthan", "Sikkim", 
							"Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal"};
		return indiaStates;
	 }else if (country =="australia"){
		 String australiaStates[]={"New South Wales","Victoria","Queensland","Western Australia","South Australia","Tasmania"};
		 return australiaStates;
	 }else if (country =="austria"){
		 String austriaStates[]={"Burgenland","Carinthia","Styria","Vorarlberg","Tyrol","Upper Austria","Vienna","Salzburg","Lower Austria"};
		 return austriaStates;
	 }
	 return null;
	}
}