class Xerox {

    int id;
    String brand;
    String model;
    String color;
    double price;
    int speed;
    String paperSize;
    int capacity;
    boolean scanner;
    boolean colorPrint;
    boolean wifi;
    String warranty;

    // Constructor 1
    Xerox(int id) {
        this.id = id;
    }

    // Constructor 2
    Xerox(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Constructor 3
    Xerox(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    // Constructor 4
    Xerox(int id, String brand, String model, String color) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    // Constructor 5
    Xerox(int id, String brand, String model, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Constructor 6
    Xerox(int id, String brand, String model, String color, double price, int speed) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
    }

    // Constructor 7
    Xerox(int id, String brand, String model, String color, double price, int speed, String paperSize) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
    }

    // Constructor 8
    Xerox(int id, String brand, String model, String color, double price, int speed, String paperSize, int capacity) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.capacity = capacity;
    }

    // Constructor 9
    Xerox(int id, String brand, String model, String color, double price, int speed, String paperSize, int capacity, boolean scanner) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.capacity = capacity;
        this.scanner = scanner;
    }

    // Constructor 10
    Xerox(int id, String brand, String model, String color, double price, int speed, String paperSize, int capacity, boolean scanner, boolean colorPrint) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.capacity = capacity;
        this.scanner = scanner;
        this.colorPrint = colorPrint;
    }

    // Constructor 11
    Xerox(int id, String brand, String model, String color, double price, int speed, String paperSize, int capacity, boolean scanner, boolean colorPrint, boolean wifi) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.capacity = capacity;
        this.scanner = scanner;
        this.colorPrint = colorPrint;
        this.wifi = wifi;
    }

    // Constructor 12
    Xerox(int id, String brand, String model, String color, double price, int speed, String paperSize, int capacity, boolean scanner, boolean colorPrint, boolean wifi, String warranty) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.speed = speed;
        this.paperSize = paperSize;
        this.capacity = capacity;
        this.scanner = scanner;
        this.colorPrint = colorPrint;
        this.wifi = wifi;
        this.warranty = warranty;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Speed: " + speed);
        System.out.println("Paper Size: " + paperSize);
        System.out.println("Capacity: " + capacity);
        System.out.println("Scanner: " + scanner);
        System.out.println("Color Print: " + colorPrint);
        System.out.println("Wifi: " + wifi);
        System.out.println("Warranty: " + warranty);
    }
}