class Umbrella {
    int id;
    String brand;
    String color;
    double price;
    String material;
    String size;
    double weight;
    String handleType;
    boolean automatic;
    boolean waterproof;

    Umbrella(int id, String brand, String color, double price, String material,
             String size, double weight, String handleType, boolean automatic, boolean waterproof) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.size = size;
        this.weight = weight;
        this.handleType = handleType;
        this.automatic = automatic;
        this.waterproof = waterproof;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Handle Type: " + handleType);
        System.out.println("Automatic: " + automatic);
        System.out.println("Waterproof: " + waterproof);
    }
}