class Rocket {

    int id;
    String name;
    String country;
    double height;
    double weight;
    double speed;
    String fuelType;
    int stages;
    String purpose;
    boolean reusable;
    String agency;
    double payload;

    // Constructor 1
    Rocket(int id) {
        this.id = id;
    }

    // Constructor 2
    Rocket(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor 3
    Rocket(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    // Constructor 4
    Rocket(int id, String name, String country, double height) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
    }

    // Constructor 5
    Rocket(int id, String name, String country, double height, double weight) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
    }

    // Constructor 6
    Rocket(int id, String name, String country, double height, double weight, double speed) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    // Constructor 7
    Rocket(int id, String name, String country, double height, double weight, double speed, String fuelType) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Constructor 8
    Rocket(int id, String name, String country, double height, double weight, double speed, String fuelType, int stages) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.fuelType = fuelType;
        this.stages = stages;
    }

    // Constructor 9
    Rocket(int id, String name, String country, double height, double weight, double speed, String fuelType, int stages, String purpose) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.fuelType = fuelType;
        this.stages = stages;
        this.purpose = purpose;
    }

    // Constructor 10
    Rocket(int id, String name, String country, double height, double weight, double speed, String fuelType, int stages, String purpose, boolean reusable) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.fuelType = fuelType;
        this.stages = stages;
        this.purpose = purpose;
        this.reusable = reusable;
    }

    // Constructor 11
    Rocket(int id, String name, String country, double height, double weight, double speed, String fuelType, int stages, String purpose, boolean reusable, String agency) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.fuelType = fuelType;
        this.stages = stages;
        this.purpose = purpose;
        this.reusable = reusable;
        this.agency = agency;
    }

    // Constructor 12
    Rocket(int id, String name, String country, double height, double weight, double speed, String fuelType, int stages, String purpose, boolean reusable, String agency, double payload) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.fuelType = fuelType;
        this.stages = stages;
        this.purpose = purpose;
        this.reusable = reusable;
        this.agency = agency;
        this.payload = payload;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Stages: " + stages);
        System.out.println("Purpose: " + purpose);
        System.out.println("Reusable: " + reusable);
        System.out.println("Agency: " + agency);
        System.out.println("Payload: " + payload);
    }
}
