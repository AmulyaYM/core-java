class InkPad {

    int id;
    String brand;
    String color;
    String size;
    double price;
    String shape;
    String inkType;
    double weight;
    String material;
    boolean refillable;
    String country;
    int quantity;

    // Constructor 1
    InkPad(int id) {
        this.id = id;
    }

    // Constructor 2
    InkPad(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Constructor 3
    InkPad(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    // Constructor 4
    InkPad(int id, String brand, String color, String size) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    // Constructor 5
    InkPad(int id, String brand, String color, String size, double price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    // Constructor 6
    InkPad(int id, String brand, String color, String size, double price, String shape) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shape = shape;
    }

    // Constructor 7
    InkPad(int id, String brand, String color, String size, double price, String shape, String inkType) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shape = shape;
        this.inkType = inkType;
    }

    // Constructor 8
    InkPad(int id, String brand, String color, String size, double price, String shape, String inkType, double weight) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shape = shape;
        this.inkType = inkType;
        this.weight = weight;
    }

    // Constructor 9
    InkPad(int id, String brand, String color, String size, double price, String shape, String inkType, double weight, String material) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shape = shape;
        this.inkType = inkType;
        this.weight = weight;
        this.material = material;
    }

    // Constructor 10
    InkPad(int id, String brand, String color, String size, double price, String shape, String inkType, double weight, String material, boolean refillable) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shape = shape;
        this.inkType = inkType;
        this.weight = weight;
        this.material = material;
        this.refillable = refillable;
    }

    // Constructor 11
    InkPad(int id, String brand, String color, String size, double price, String shape, String inkType, double weight, String material, boolean refillable, String country) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shape = shape;
        this.inkType = inkType;
        this.weight = weight;
        this.material = material;
        this.refillable = refillable;
        this.country = country;
    }

    // Constructor 12
    InkPad(int id, String brand, String color, String size, double price, String shape, String inkType, double weight, String material, boolean refillable, String country, int quantity) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shape = shape;
        this.inkType = inkType;
        this.weight = weight;
        this.material = material;
        this.refillable = refillable;
        this.country = country;
        this.quantity = quantity;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Shape: " + shape);
        System.out.println("Ink Type: " + inkType);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Refillable: " + refillable);
        System.out.println("Country: " + country);
        System.out.println("Quantity: " + quantity);
    }
}
