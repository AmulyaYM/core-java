class InkPad {
    int id;
    String brand;
    String color;
    String size;
    double price;
    String shape;
    String inkType;
    double weight;
    String material;
    boolean refillable;

    InkPad(int id, String brand, String color, String size, double price,
           String shape, String inkType, double weight, String material, boolean refillable) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.shape = shape;
        this.inkType = inkType;
        this.weight = weight;
        this.material = material;
        this.refillable = refillable;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Shape: " + shape);
        System.out.println("Ink Type: " + inkType);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Refillable: " + refillable);
    }
}