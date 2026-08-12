class Sandwich{
	Sandwich(int id , String name){
	System.out.println("sandwich is invoked");
	this.id=id;
	this.name=name;
	}
	//instance variable
	int id;
	String name;
	
	public void printSandwichDetails(){
		System.out.println("printSandwichDetails started");
	System.out.println("id is "+ id);
	System.out.println("name is " + name);
	System.out.println("printSandwichDetails ended");
	System.out.println("++++++++++++++++++++++++++");
	}



}