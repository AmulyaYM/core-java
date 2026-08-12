class UmbrellaRunner {
    public static void main(String[] umbrella) {
        Umbrella u1 = new Umbrella(1, "Popy", "Black", 500, "Polyester", "Large", 400, "Plastic", true, true);
        u1.printDetails();

        Umbrella u2 = new Umbrella(2, "Sun", "Blue", 400, "Nylon", "Medium", 350, "Wood", false, true);
        u2.printDetails();

        Umbrella u3 = new Umbrella(3, "RainPro", "Red", 600, "Polyester", "Large", 450, "Rubber", true, true);
        u3.printDetails();
    }
}