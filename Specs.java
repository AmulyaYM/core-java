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

    Specs(int id, String brand, String color, String frameType, String lensType,
          double price, String size, String shape, double power, boolean antiGlare) {
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
    }
}