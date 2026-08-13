class Tyre {

    int id;
    String brand;
    String model;
    String type;
    double price;
    double diameter;
    double width;
    String material;
    int loadCapacity;
    boolean tubeless;
    String vehicle;
    String warranty;

    // Constructor 1
    Tyre(int id) {
        this.id = id;
    }

    // Constructor 2
    Tyre(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Constructor 3
    Tyre(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    // Constructor 4
    Tyre(int id, String brand, String model, String type) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    // Constructor 5
    Tyre(int id, String brand, String model, String type, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
    }

    // Constructor 6
    Tyre(int id, String brand, String model, String type, double price, double diameter) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.diameter = diameter;
    }

    // Constructor 7
    Tyre(int id, String brand, String model, String type, double price, double diameter, double width) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.diameter = diameter;
        this.width = width;
    }

    // Constructor 8
    Tyre(int id, String brand, String model, String type, double price, double diameter, double width, String material) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.diameter = diameter;
        this.width = width;
        this.material = material;
    }

    // Constructor 9
    Tyre(int id, String brand, String model, String type, double price, double diameter, double width, String material, int loadCapacity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.diameter = diameter;
        this.width = width;
        this.material = material;
        this.loadCapacity = loadCapacity;
    }

    // Constructor 10
    Tyre(int id, String brand, String model, String type, double price, double diameter, double width, String material, int loadCapacity, boolean tubeless) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.diameter = diameter;
        this.width = width;
        this.material = material;
        this.loadCapacity = loadCapacity;
        this.tubeless = tubeless;
    }

    // Constructor 11
    Tyre(int id, String brand, String model, String type, double price, double diameter, double width, String material, int loadCapacity, boolean tubeless, String vehicle) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.diameter = diameter;
        this.width = width;
        this.material = material;
        this.loadCapacity = loadCapacity;
        this.tubeless = tubeless;
        this.vehicle = vehicle;
    }

    // Constructor 12
    Tyre(int id, String brand, String model, String type, double price, double diameter, double width, String material, int loadCapacity, boolean tubeless, String vehicle, String warranty) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.diameter = diameter;
        this.width = width;
        this.material = material;
        this.loadCapacity = loadCapacity;
        this.tubeless = tubeless;
        this.vehicle = vehicle;
        this.warranty = warranty;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Diameter: " + diameter);
        System.out.println("Width: " + width);
        System.out.println("Material: " + material);
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Tubeless: " + tubeless);
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Warranty: " + warranty);
    }
}