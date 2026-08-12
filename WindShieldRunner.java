class WindShieldRunner {
    public static void main(String[] wind) {
        WindShield w1 = new WindShield(1, "AIS", "Car", "Glass", "Clear", 8000, 70, 140, 5, true);
        w1.printDetails();

        WindShield w2 = new WindShield(2, "SaintGobain", "SUV", "Glass", "Clear", 10000, 80, 150, 6, true);
        w2.printDetails();

        WindShield w3 = new WindShield(3, "AutoGlass", "Truck", "Glass", "Green", 12000, 100, 180, 7, false);
        w3.printDetails();
    }
}