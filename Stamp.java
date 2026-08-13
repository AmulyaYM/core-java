class Stamp {

    int id;
    String type;
    String color;
    String shape;
    double price;
    String material;
    String text;
    double height;
    double width;
    boolean reusable;
    String brand;
    double weight;

    // Constructor 1
    Stamp(int id) {
        this.id = id;
    }

    // Constructor 2
    Stamp(int id, String type) {
        this.id = id;
        this.type = type;
    }

    // Constructor 3
    Stamp(int id, String type, String color) {
        this.id = id;
        this.type = type;
        this.color = color;
    }

    // Constructor 4
    Stamp(int id, String type, String color, String shape) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
    }

    // Constructor 5
    Stamp(int id, String type, String color, String shape, double price) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
    }

    // Constructor 6
    Stamp(int id, String type, String color, String shape, double price, String material) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.material = material;
    }

    // Constructor 7
    Stamp(int id, String type, String color, String shape, double price, String material, String text) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.material = material;
        this.text = text;
    }

    // Constructor 8
    Stamp(int id, String type, String color, String shape, double price, String material, String text, double height) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.material = material;
        this.text = text;
        this.height = height;
    }

    // Constructor 9
    Stamp(int id, String type, String color, String shape, double price, String material, String text, double height, double width) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.material = material;
        this.text = text;
        this.height = height;
        this.width = width;
    }

    // Constructor 10
    Stamp(int id, String type, String color, String shape, double price, String material, String text, double height, double width, boolean reusable) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.material = material;
        this.text = text;
        this.height = height;
        this.width = width;
        this.reusable = reusable;
    }

    // Constructor 11
    Stamp(int id, String type, String color, String shape, double price, String material, String text, double height, double width, boolean reusable, String brand) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.material = material;
        this.text = text;
        this.height = height;
        this.width = width;
        this.reusable = reusable;
        this.brand = brand;
    }

    // Constructor 12
    Stamp(int id, String type, String color, String shape, double price, String material, String text, double height, double width, boolean reusable, String brand, double weight) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.material = material;
        this.text = text;
        this.height = height;
        this.width = width;
        this.reusable = reusable;
        this.brand = brand;
        this.weight = weight;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Text: " + text);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Reusable: " + reusable);
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
    }
}
