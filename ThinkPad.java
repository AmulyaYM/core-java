class ThinkPad {
    int id;
    String model;
    String processor;
    int ram;
    int storage;
    double price;
    double screenSize;
    String color;
    String operatingSystem;
    boolean touchScreen;

    ThinkPad(int id, String model, String processor, int ram, int storage,
             double price, double screenSize, String color, String operatingSystem, boolean touchScreen) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.screenSize = screenSize;
        this.color = color;
        this.operatingSystem = operatingSystem;
        this.touchScreen = touchScreen;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Color: " + color);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Touch Screen: " + touchScreen);
    }
}