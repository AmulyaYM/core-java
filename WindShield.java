class WindShield {
    int id;
    String brand;
    String vehicleType;
    String material;
    String color;
    double price;
    double height;
    double width;
    double thickness;
    boolean tinted;

    WindShield(int id, String brand, String vehicleType, String material, String color,
               double price, double height, double width, double thickness, boolean tinted) {
        this.id = id;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.material = material;
        this.color = color;
        this.price = price;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
        this.tinted = tinted;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Thickness: " + thickness);
        System.out.println("Tinted: " + tinted);
    }
}