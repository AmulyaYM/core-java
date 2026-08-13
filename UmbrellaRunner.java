class UmbrellaRunner {

    public static void main(String[] amulya) {

        Umbrella u1 = new Umbrella(1);
        u1.printDetails();

        Umbrella u2 = new Umbrella(2, "Popy");
        u2.printDetails();

        Umbrella u3 = new Umbrella(3, "Sun", "Blue");
        u3.printDetails();

        Umbrella u4 = new Umbrella(4, "RainPro", "Red", 500);
        u4.printDetails();

        Umbrella u5 = new Umbrella(5, "Popy", "Black", 600, "Polyester");
        u5.printDetails();

        Umbrella u6 = new Umbrella(6, "Sun", "Blue", 450, "Nylon", "Medium");
        u6.printDetails();

        Umbrella u7 = new Umbrella(7, "RainPro", "Red", 650, "Polyester", "Large", 450);
        u7.printDetails();

        Umbrella u8 = new Umbrella(8, "Popy", "Black", 700, "Polyester", "Large", 400, "Plastic");
        u8.printDetails();

        Umbrella u9 = new Umbrella(9, "Sun", "Blue", 500, "Nylon", "Medium", 350, "Wood", true);
        u9.printDetails();

        Umbrella u10 = new Umbrella(10, "RainPro", "Red", 750, "Polyester", "Large", 450, "Rubber", true, true);
        u10.printDetails();

        Umbrella u11 = new Umbrella(11, "Popy", "Black", 800, "Polyester", "Large", 420, "Plastic", true, true, "Plain");
        u11.printDetails();

        Umbrella u12 = new Umbrella(12, "Sun", "Blue", 850, "Nylon", "Large", 430, "Wood", true, true, "Printed", "India");
        u12.printDetails();
    }
}