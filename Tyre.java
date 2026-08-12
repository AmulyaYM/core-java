class Tyre {
    int id;
    String brand;
    String model;
    String type;
    double price;
    double diameter;
    double width;
    String material;
    int loadCapacity;
    boolean tubeless;

    Tyre(int id, String brand, String model, String type, double price,
         double diameter, double width, String material, int loadCapacity, boolean tubeless) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.diameter = diameter;
        this.width = width;
        this.material = material;
        this.loadCapacity = loadCapacity;
        this.tubeless = tubeless;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Diameter: " + diameter);
        System.out.println("Width: " + width);
        System.out.println("Material: " + material);
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Tubeless: " + tubeless);
    }
}