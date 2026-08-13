class Specs {

    int id;
    String brand;
    String color;
    String frameType;
    String lensType;
    double price;
    String size;
    String shape;
    double power;
    boolean antiGlare;
    String material;
    String gender;

    // Constructor 1
    Specs(int id) {
        this.id = id;
    }

    // Constructor 2
    Specs(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Constructor 3
    Specs(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    // Constructor 4
    Specs(int id, String brand, String color, String frameType) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
    }

    // Constructor 5
    Specs(int id, String brand, String color, String frameType, String lensType) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
    }

    // Constructor 6
    Specs(int id, String brand, String color, String frameType, String lensType, double price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
    }

    // Constructor 7
    Specs(int id, String brand, String color, String frameType, String lensType, double price, String size) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
        this.size = size;
    }

    // Constructor 8
    Specs(int id, String brand, String color, String frameType, String lensType, double price, String size, String shape) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
        this.size = size;
        this.shape = shape;
    }

    // Constructor 9
    Specs(int id, String brand, String color, String frameType, String lensType, double price, String size, String shape, double power) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.power = power;
    }

    // Constructor 10
    Specs(int id, String brand, String color, String frameType, String lensType, double price, String size, String shape, double power, boolean antiGlare) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.power = power;
        this.antiGlare = antiGlare;
    }

    // Constructor 11
    Specs(int id, String brand, String color, String frameType, String lensType, double price, String size, String shape, double power, boolean antiGlare, String material) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.power = power;
        this.antiGlare = antiGlare;
        this.material = material;
    }

    // Constructor 12
    Specs(int id, String brand, String color, String frameType, String lensType, double price, String size, String shape, double power, boolean antiGlare, String material, String gender) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.frameType = frameType;
        this.lensType = lensType;
        this.price = price;
        this.size = size;
        this.shape = shape;
        this.power = power;
        this.antiGlare = antiGlare;
        this.material = material;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Frame Type: " + frameType);
        System.out.println("Lens Type: " + lensType);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Shape: " + shape);
        System.out.println("Power: " + power);
        System.out.println("Anti Glare: " + antiGlare);
        System.out.println("Material: " + material);
        System.out.println("Gender: " + gender);
    }
}