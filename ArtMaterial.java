class ArtMaterial {

    int id;
    String name;
    String brand;
    String type;
    String color;
    double price;
    int quantity;
    String material;
    String size;
    boolean washable;
    String purpose;
    String country;

    ArtMaterial(int id) {
        this.id = id;
    }

  
    ArtMaterial(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    ArtMaterial(int id, String name, String brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }

  
    ArtMaterial(int id, String name, String brand, String type) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
    }

   
    ArtMaterial(int id, String name, String brand, String type, String color) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
    }

   
    ArtMaterial(int id, String name, String brand, String type, String color, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
    }

  
    ArtMaterial(int id, String name, String brand, String type, String color, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

   
    ArtMaterial(int id, String name, String brand, String type, String color, double price, int quantity, String material) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
    }

   
    ArtMaterial(int id, String name, String brand, String type, String color, double price, int quantity, String material, String size) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.size = size;
    }

    ArtMaterial(int id, String name, String brand, String type, String color, double price, int quantity, String material, String size, boolean washable) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.size = size;
        this.washable = washable;
    }

    ArtMaterial(int id, String name, String brand, String type, String color, double price, int quantity, String material, String size, boolean washable, String purpose) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.size = size;
        this.washable = washable;
        this.purpose = purpose;
    }

    
    ArtMaterial(int id, String name, String brand, String type, String color, double price, int quantity, String material, String size, boolean washable, String purpose, String country) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.size = size;
        this.washable = washable;
        this.purpose = purpose;
        this.country = country;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Washable: " + washable);
        System.out.println("Purpose: " + purpose);
        System.out.println("Country: " + country);
    }
}
