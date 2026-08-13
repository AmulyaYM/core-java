class WindShieldRunner {

    public static void main(String[] amulya) {

        WindShield w1 = new WindShield(1);
        w1.printDetails();

        WindShield w2 = new WindShield(2, "AIS");
        w2.printDetails();

        WindShield w3 = new WindShield(3, "SaintGobain", "Car");
        w3.printDetails();

        WindShield w4 = new WindShield(4, "AutoGlass", "SUV", "Glass");
        w4.printDetails();

        WindShield w5 = new WindShield(5, "AIS", "Car", "Glass", "Clear");
        w5.printDetails();

        WindShield w6 = new WindShield(6, "SaintGobain", "SUV", "Glass", "Clear", 10000);
        w6.printDetails();

        WindShield w7 = new WindShield(7, "AutoGlass", "Truck", "Glass", "Green", 12000, 100);
        w7.printDetails();

        WindShield w8 = new WindShield(8, "AIS", "Car", "Glass", "Clear", 8000, 70, 140);
        w8.printDetails();

        WindShield w9 = new WindShield(9, "SaintGobain", "SUV", "Glass", "Clear", 10000, 80, 150, 6);
        w9.printDetails();

        WindShield w10 = new WindShield(10, "AutoGlass", "Truck", "Glass", "Green", 12000, 100, 180, 7, true);
        w10.printDetails();

        WindShield w11 = new WindShield(11, "AIS", "Car", "Glass", "Clear", 9000, 75, 145, 5, true, true);
        w11.printDetails();

        WindShield w12 = new WindShield(12, "SaintGobain", "SUV", "Glass", "Clear", 11000, 85, 155, 6, true, true, "India");
        w12.printDetails();
    }
}