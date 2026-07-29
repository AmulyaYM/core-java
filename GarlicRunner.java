class GarlicRunner{
	public static void main(String food[]){
	
	Garlic gar = new Garlic();
	gar.id = 12456;
	gar.type = "Ooty Garlic";
	gar.price = 123.00k; 
	gar.color = "White";
	 
	int id =gar.id;
	String type = gar.type;
	double price =gar.price;
	String color = gar.color;
	
	System.out.println("Garlic id of the first copy is " + id);
	System.out.println("Garlic type of the first copy is "+ type);
	System.out.println("Price of the first copy is "+price);
	System.out.println("Color of the first copy is "+color);
	
	Garlic gar1 = new Garlic();
	gar1.id = 12457;
	gar1.type = "Kashmiri Garlic";
	gar1.price = 150.00;
	gar1.color = "Cream White";

	int id1 = gar1.id;
	String type1 = gar1.type;
	double price1 = gar1.price;
	String color1 = gar1.color;

	System.out.println("Garlic id of the second copy is " + id1);
	System.out.println("Garlic type of the second copy is " + type1);
	System.out.println("Price of the second copy is " + price1);
	System.out.println("Color of the second copy is " + color1);
			
	Garlic gar2 = new Garlic();
	gar2.id = 12458;
	gar2.type = "Organic Garlic";
	gar2.price = 180.00;
	gar2.color = "Pure White";

	int id2 = gar2.id;
	String type2 = gar2.type;
	double price2 = gar2.price;
	String color2 = gar2.color;

	System.out.println("Garlic id of the third copy is " + id2);
	System.out.println("Garlic type of the third copy is " + type2);
	System.out.println("Price of the third copy is " + price2);
	System.out.println("Color of the third copy is " + color2);
	}
	}
	