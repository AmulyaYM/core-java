class Umbrella {

    int id;
    String brand;
    String color;
    double price;
    String material;
    String size;
    double weight;
    String handleType;
    boolean automatic;
    boolean waterproof;
    String pattern;
    String country;

    // Constructor 1
    Umbrella(int id) {
        this.id = id;
    }

    // Constructor 2
    Umbrella(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Constructor 3
    Umbrella(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    // Constructor 4
    Umbrella(int id, String brand, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // Constructor 5
    Umbrella(int id, String brand, String color, double price, String material) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
    }

    // Constructor 6
    Umbrella(int id, String brand, String color, double price, String material, String size) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.size = size;
    }

    // Constructor 7
    Umbrella(int id, String brand, String color, double price, String material, String size, double weight) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.size = size;
        this.weight = weight;
    }

    // Constructor 8
    Umbrella(int id, String brand, String color, double price, String material, String size, double weight, String handleType) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.size = size;
        this.weight = weight;
        this.handleType = handleType;
    }

    // Constructor 9
    Umbrella(int id, String brand, String color, double price, String material, String size, double weight, String handleType, boolean automatic) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.size = size;
        this.weight = weight;
        this.handleType = handleType;
        this.automatic = automatic;
    }

    // Constructor 10
    Umbrella(int id, String brand, String color, double price, String material, String size, double weight, String handleType, boolean automatic, boolean waterproof) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.size = size;
        this.weight = weight;
        this.handleType = handleType;
        this.automatic = automatic;
        this.waterproof = waterproof;
    }

    // Constructor 11
    Umbrella(int id, String brand, String color, double price, String material, String size, double weight, String handleType, boolean automatic, boolean waterproof, String pattern) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.size = size;
        this.weight = weight;
        this.handleType = handleType;
        this.automatic = automatic;
        this.waterproof = waterproof;
        this.pattern = pattern;
    }

    // Constructor 12
    Umbrella(int id, String brand, String color, double price, String material, String size, double weight, String handleType, boolean automatic, boolean waterproof, String pattern, String country) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.size = size;
        this.weight = weight;
        this.handleType = handleType;
        this.automatic = automatic;
        this.waterproof = waterproof;
        this.pattern = pattern;
        this.country = country;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Automatic: " + automatic);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Pattern: " + pattern);
        System.out.println("Country: " + country);
    }
}