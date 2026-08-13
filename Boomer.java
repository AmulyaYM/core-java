class Boomer {

    int id;
    String brand;
    String flavor;
    String color;
    double price;
    double weight;
    String shape;
    String packType;
    int quantity;
    boolean sugarFree;
    String manufactureDate;
    String expiryDate;

   
    Boomer(int id) {
        this.id = id;
    }

    
    Boomer(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    
    Boomer(int id, String brand, String flavor) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
    }

    
    Boomer(int id, String brand, String flavor, String color) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
    }

    
    Boomer(int id, String brand, String flavor, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
    }

    
    Boomer(int id, String brand, String flavor, String color, double price, double weight) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }
    Boomer(int id, String brand, String flavor, String color, double price, double weight, String shape) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
    }

    Boomer(int id, String brand, String flavor, String color, double price, double weight, String shape, String packType) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.packType = packType;
    }

    Boomer(int id, String brand, String flavor, String color, double price, double weight, String shape, String packType, int quantity) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
    }

    Boomer(int id, String brand, String flavor, String color, double price, double weight, String shape, String packType, int quantity, boolean sugarFree) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.sugarFree = sugarFree;
    }

    Boomer(int id, String brand, String flavor, String color, double price, double weight, String shape, String packType, int quantity, boolean sugarFree, String manufactureDate) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.sugarFree = sugarFree;
        this.manufactureDate = manufactureDate;
    }

    Boomer(int id, String brand, String flavor, String color, double price, double weight, String shape, String packType, int quantity, boolean sugarFree, String manufactureDate, String expiryDate) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.sugarFree = sugarFree;
        this.manufactureDate = manufactureDate;
        this.expiryDate = expiryDate;
    }
 public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Pack Type: " + packType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sugar Free: " + sugarFree);
        System.out.println("Manufacture Date: " + manufactureDate);
        System.out.println("Expiry Date: " + expiryDate);
    }
}