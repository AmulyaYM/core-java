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

    Xerox(int id, String brand, String model, String color, double price,
          int speed, String paperSize, int capacity, boolean scanner, boolean colorPrint) {
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
    }
}