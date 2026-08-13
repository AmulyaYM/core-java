class SoftDrink {

    int id;
    String brand;
    String flavor;
    double price;
    double quantity;
    String color;
    String bottleType;
    double sugar;
    boolean chilled;
    boolean carbonated;
    String manufactureDate;
    String expiryDate;

    // Constructor 1
    SoftDrink(int id) {
        this.id = id;
    }

    // Constructor 2
    SoftDrink(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Constructor 3
    SoftDrink(int id, String brand, String flavor) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
    }

    // Constructor 4
    SoftDrink(int id, String brand, String flavor, double price) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    // Constructor 5
    SoftDrink(int id, String brand, String flavor, double price, double quantity) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    // Constructor 6
    SoftDrink(int id, String brand, String flavor, double price, double quantity, String color) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
    }

    // Constructor 7
    SoftDrink(int id, String brand, String flavor, double price, double quantity, String color, String bottleType) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.bottleType = bottleType;
    }

    // Constructor 8
    SoftDrink(int id, String brand, String flavor, double price, double quantity, String color, String bottleType, double sugar) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.bottleType = bottleType;
        this.sugar = sugar;
    }

    // Constructor 9
    SoftDrink(int id, String brand, String flavor, double price, double quantity, String color, String bottleType, double sugar, boolean chilled) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.bottleType = bottleType;
        this.sugar = sugar;
        this.chilled = chilled;
    }

    // Constructor 10
    SoftDrink(int id, String brand, String flavor, double price, double quantity, String color, String bottleType, double sugar, boolean chilled, boolean carbonated) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.bottleType = bottleType;
        this.sugar = sugar;
        this.chilled = chilled;
        this.carbonated = carbonated;
    }

    // Constructor 11
    SoftDrink(int id, String brand, String flavor, double price, double quantity, String color, String bottleType, double sugar, boolean chilled, boolean carbonated, String manufactureDate) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.bottleType = bottleType;
        this.sugar = sugar;
        this.chilled = chilled;
        this.carbonated = carbonated;
        this.manufactureDate = manufactureDate;
    }

    // Constructor 12
    SoftDrink(int id, String brand, String flavor, double price, double quantity, String color, String bottleType, double sugar, boolean chilled, boolean carbonated, String manufactureDate, String expiryDate) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.bottleType = bottleType;
        this.sugar = sugar;
        this.chilled = chilled;
        this.carbonated = carbonated;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
        System.out.println("Bottle Type: " + bottleType);
        System.out.println("Sugar: " + sugar);
        System.out.println("Chilled: " + chilled);
        System.out.println("Carbonated: " + carbonated);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Expiry Date: " + expiryDate);
    }
}
