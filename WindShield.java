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
    boolean laminated;
    String country;

    // Constructor 1
    WindShield(int id) {
        this.id = id;
    }

    // Constructor 2
    WindShield(int id, String brand) {
        this.id = id;
        this.brand = brand;
    }

    // Constructor 3
    WindShield(int id, String brand, String vehicleType) {
        this.id = id;
        this.brand = brand;
        this.vehicleType = vehicleType;
    }

    // Constructor 4
    WindShield(int id, String brand, String vehicleType, String material) {
        this.id = id;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.material = material;
    }

    // Constructor 5
    WindShield(int id, String brand, String vehicleType, String material, String color) {
        this.id = id;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.material = material;
        this.color = color;
    }

    // Constructor 6
    WindShield(int id, String brand, String vehicleType, String material, String color, double price) {
        this.id = id;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.material = material;
        this.color = color;
        this.price = price;
    }

    // Constructor 7
    WindShield(int id, String brand, String vehicleType, String material, String color, double price, double height) {
        this.id = id;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.material = material;
        this.color = color;
        this.price = price;
        this.height = height;
    }

    // Constructor 8
    WindShield(int id, String brand, String vehicleType, String material, String color, double price, double height, double width) {
        this.id = id;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.material = material;
        this.color = color;
        this.price = price;
        this.height = height;
        this.width = width;
    }

    // Constructor 9
    WindShield(int id, String brand, String vehicleType, String material, String color, double price, double height, double width, double thickness) {
        this.id = id;
        this.brand = brand;
        this.vehicleType = vehicleType;
        this.material = material;
        this.color = color;
        this.price = price;
        this.height = height;
        this.width = width;
        this.thickness = thickness;
    }

    // Constructor 10
    WindShield(int id, String brand, String vehicleType, String material, String color, double price, double height, double width, double thickness, boolean tinted) {
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

    // Constructor 11
    WindShield(int id, String brand, String vehicleType, String material, String color, double price, double height, double width, double thickness, boolean tinted, boolean laminated) {
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
        this.laminated = laminated;
    }

    // Constructor 12
    WindShield(int id, String brand, String vehicleType, String material, String color, double price, double height, double width, double thickness, boolean tinted, boolean laminated, String country) {
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
        this.laminated = laminated;
        this.country = country;
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
        System.out.println("Laminated: " + laminated);
        System.out.println("Country: " + country);
    }
}