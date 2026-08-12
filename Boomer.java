class Boomer {
    int id;
    String brand;
    String flavor;
    String color;
    double price;
    double weight;
    String shape;
    String packType;
    int quantity;
    boolean sugarFree;

    Boomer(int id, String brand, String flavor, String color, double price,
           double weight, String shape, String packType, int quantity, boolean sugarFree) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.packType = packType;
        this.quantity = quantity;
        this.sugarFree = sugarFree;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Pack Type: " + packType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Sugar Free: " + sugarFree);
    }
}
