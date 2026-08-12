class Stamp {
    int id;
    String type;
    String color;
    String shape;
    double price;
    String material;
    String text;
    double height;
    double width;
    boolean reusable;

    Stamp(int id, String type, String color, String shape, double price,
          String material, String text, double height, double width, boolean reusable) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.shape = shape;
        this.price = price;
        this.material = material;
        this.text = text;
        this.height = height;
        this.width = width;
        this.reusable = reusable;
    }

    public void printDetails() {
        System.out.println("Id: " + id);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Text: " + text);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Reusable: " + reusable);
    }
}
