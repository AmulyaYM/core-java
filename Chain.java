class Chain {

    int id;
    String brand;
    String material;
    String color;
    double price;
    double length;
    double weight;
    String design;
    String type;
    boolean available;
    String purity;
    String gender;

    Chain(int id) {
        this.id = id;
    }

    Chain(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    Chain(int id, String brand, String material) {
        this.id = id;
        this.brand = brand;
        this.material = material;
    }
    Chain(int id, String brand, String material, String color) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
    }

    Chain(int id, String brand, String material, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
    }
    Chain(int id, String brand, String material, String color, double price, double length) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
    }

    Chain(int id, String brand, String material, String color, double price, double length, double weight) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.weight = weight;
    }

    Chain(int id, String brand, String material, String color, double price, double length, double weight, String design) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.weight = weight;
        this.design = design;
    }

    Chain(int id, String brand, String material, String color, double price, double length, double weight, String design, String type) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.weight = weight;
        this.design = design;
        this.type = type;
    }

    Chain(int id, String brand, String material, String color, double price, double length, double weight, String design, String type, boolean available) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.weight = weight;
        this.design = design;
        this.type = type;
        this.available = available;
    }

    Chain(int id, String brand, String material, String color, double price, double length, double weight, String design, String type, boolean available, String purity) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.weight = weight;
        this.design = design;
        this.type = type;
        this.available = available;
        this.purity = purity;
    }

    Chain(int id, String brand, String material, String color, double price, double length, double weight, String design, String type, boolean available, String purity, String gender) {
        this.id = id;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.length = length;
        this.weight = weight;
        this.design = design;
        this.type = type;
        this.available = available;
        this.purity = purity;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Weight: " + weight);
        System.out.println("Design: " + design);
        System.out.println("Type: " + type);
        System.out.println("Available: " + available);
        System.out.println("Purity: " + purity);
        System.out.println("Gender: " + gender);
    }
}
