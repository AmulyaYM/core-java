class RocketRunner {

    public static void main(String[] amulya) {

        Rocket r1 = new Rocket(1);
        r1.printDetails();
        System.out.println("-------------------------");

        Rocket r2 = new Rocket(2, "PSLV");
        r2.printDetails();
        System.out.println("-------------------------");

        Rocket r3 = new Rocket(3, "GSLV", "India");
        r3.printDetails();
        System.out.println("-------------------------");

        Rocket r4 = new Rocket(4, "Falcon 9", "USA", 70);
        r4.printDetails();
        System.out.println("-------------------------");

        Rocket r5 = new Rocket(5, "PSLV", "India", 44, 320000);
        r5.printDetails();
        System.out.println("-------------------------");

        Rocket r6 = new Rocket(6, "GSLV", "India", 49, 414000, 26000);
        r6.printDetails();
        System.out.println("-------------------------");

        Rocket r7 = new Rocket(7, "Falcon 9", "USA", 70, 549000, 28000, "Liquid");
        r7.printDetails();
        System.out.println("-------------------------");

        Rocket r8 = new Rocket(8, "PSLV", "India", 44, 320000, 27000, "Solid-Liquid", 4);
        r8.printDetails();
        System.out.println("-------------------------");

        Rocket r9 = new Rocket(9, "GSLV", "India", 49, 414000, 26000, "Cryogenic", 3, "Satellite");
        r9.printDetails();
        System.out.println("-------------------------");

        Rocket r10 = new Rocket(10, "Falcon 9", "USA", 70, 549000, 28000, "Liquid", 2, "Satellite", true);
        r10.printDetails();
        System.out.println("-------------------------");

        Rocket r11 = new Rocket(11, "PSLV", "India", 44, 320000, 27000, "Solid-Liquid", 4, "Satellite", false, "ISRO");
        r11.printDetails();
        System.out.println("-------------------------");

        Rocket r12 = new Rocket(12, "GSLV", "India", 49, 414000, 26000, "Cryogenic", 3, "Satellite", false, "ISRO", 5000);
        r12.printDetails();
        System.out.println("-------------------------");
    }
}