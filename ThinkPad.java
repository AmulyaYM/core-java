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
    String graphics;
    String warranty;

    // Constructor 1
    ThinkPad(int id) {
        this.id = id;
    }

    // Constructor 2
    ThinkPad(int id, String model) {
        this.id = id;
        this.model = model;
    }

    // Constructor 3
    ThinkPad(int id, String model, String processor) {
        this.id = id;
        this.model = model;
        this.processor = processor;
    }

    // Constructor 4
    ThinkPad(int id, String model, String processor, int ram) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
    }

    // Constructor 5
    ThinkPad(int id, String model, String processor, int ram, int storage) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    // Constructor 6
    ThinkPad(int id, String model, String processor, int ram, int storage, double price) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    // Constructor 7
    ThinkPad(int id, String model, String processor, int ram, int storage, double price, double screenSize) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.screenSize = screenSize;
    }

    // Constructor 8
    ThinkPad(int id, String model, String processor, int ram, int storage, double price, double screenSize, String color) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.screenSize = screenSize;
        this.color = color;
    }

    // Constructor 9
    ThinkPad(int id, String model, String processor, int ram, int storage, double price, double screenSize, String color, String operatingSystem) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.screenSize = screenSize;
        this.color = color;
        this.operatingSystem = operatingSystem;
    }

    // Constructor 10
    ThinkPad(int id, String model, String processor, int ram, int storage, double price, double screenSize, String color, String operatingSystem, boolean touchScreen) {
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

    // Constructor 11
    ThinkPad(int id, String model, String processor, int ram, int storage, double price, double screenSize, String color, String operatingSystem, boolean touchScreen, String graphics) {
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
        this.graphics = graphics;
    }

    // Constructor 12
    ThinkPad(int id, String model, String processor, int ram, int storage, double price, double screenSize, String color, String operatingSystem, boolean touchScreen, String graphics, String warranty) {
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
        this.graphics = graphics;
        this.warranty = warranty;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("Ram: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Price: " + price);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Color: " + color);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Touch Screen: " + touchScreen);
        System.out.println("Graphics: " + graphics);
        System.out.println("Warranty: " + warranty);
    }
}
