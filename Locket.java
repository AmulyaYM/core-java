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

    Locket(int id, String brand, String material, String color,
           double price, double weight, String shape,
           String design, String size, boolean available) {

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
    public void printLocketDetails() {

        System.out.println("ID: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Design: " + design);
        System.out.println("Size: " + size);
        System.out.println("Available: " + available);
    }
}