class SoftDrink {
    int id;
    String brand;
    String flavor;
    double price;
    double quantity;
    String color;
    String bottleType;
    double sugar;
    boolean chilled;
    boolean carbonated;

    SoftDrink(int id, String brand, String flavor, double price, double quantity,
              String color, String bottleType, double sugar, boolean chilled, boolean carbonated) {
        this.id = id;
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
        this.bottleType = bottleType;
        this.sugar = sugar;
        this.chilled = chilled;
        this.carbonated = carbonated;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
        System.out.println("Bottle Type: " + bottleType);
        System.out.println("Sugar: " + sugar);
        System.out.println("Chilled: " + chilled);
        System.out.println("Carbonated: " + carbonated);
    }
}
