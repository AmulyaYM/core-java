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

    Chain(int id, String brand, String material, String color, double price,
          double length, double weight, String design, String type, boolean available) {
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
    }
}