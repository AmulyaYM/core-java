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

    Rocket(int id, String name, String country, double height, double weight,
           double speed, String fuelType, int stages, String purpose, boolean reusable) {
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
    }
}