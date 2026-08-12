class RocketRunner {
    public static void main(String[] rocket) {
        Rocket r1 = new Rocket(1, "PSLV", "India", 44, 320000, 27000, "Solid-Liquid", 4, "Satellite", false);
        r1.printDetails();

        Rocket r2 = new Rocket(2, "Falcon 9", "USA", 70, 549000, 28000, "Liquid", 2, "Satellite", true);
        r2.printDetails();

        Rocket r3 = new Rocket(3, "GSLV", "India", 49, 414000, 26000, "Cryogenic", 3, "Satellite", false);
        r3.printDetails();
    }
}