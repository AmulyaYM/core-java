class Locket {

    int id;
    String brand;
    String material;
    String color;
    double price;
    double weight;
    String shape;
    String design;
    String size;
    boolean available;
    String gender;
    String country;

    // Constructor 1
    Locket(int id) {
        this.id = id;
    }

    // Constructor 2
    Locket(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Constructor 3
    Locket(int id, String brand, String material) {
        this.id = id;
        this.brand = brand;
        this.material = material;
    }

    // Constructor 4
    Locket(int id, String brand, String material, String color) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
    }

    // Constructor 5
    Locket(int id, String brand, String material, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    // Constructor 6
    Locket(int id, String brand, String material, String color, double price, double weight) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    // Constructor 7
    Locket(int id, String brand, String material, String color, double price, double weight, String shape) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
    }

    // Constructor 8
    Locket(int id, String brand, String material, String color, double price, double weight, String shape, String design) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.design = design;
    }

    // Constructor 9
    Locket(int id, String brand, String material, String color, double price, double weight, String shape, String design, String size) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.design = design;
        this.size = size;
    }

    // Constructor 10
    Locket(int id, String brand, String material, String color, double price, double weight, String shape, String design, String size, boolean available) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.design = design;
        this.size = size;
        this.available = available;
    }

    // Constructor 11
    Locket(int id, String brand, String material, String color, double price, double weight, String shape, String design, String size, boolean available, String gender) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.design = design;
        this.size = size;
        this.available = available;
        this.gender = gender;
    }

    // Constructor 12
    Locket(int id, String brand, String material, String color, double price, double weight, String shape, String design, String size, boolean available, String gender, String country) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.design = design;
        this.size = size;
        this.available = available;
        this.gender = gender;
        this.country = country;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Design: " + design);
        System.out.println("Size: " + size);
        System.out.println("Available: " + available);
        System.out.println("Gender: " + gender);
        System.out.println("Country: " + country);
    }
}
