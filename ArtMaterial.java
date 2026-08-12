class ArtMaterial {
    int id;
    String name;
    String brand;
    String type;
    String color;
    double price;
    int quantity;
    String material;
    String size;
    boolean washable;

    ArtMaterial(int id, String name, String brand, String type, String color,
                double price, int quantity, String material, String size, boolean washable) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.material = material;
        this.size = size;
        this.washable = washable;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Washable: " + washable);
    }
}