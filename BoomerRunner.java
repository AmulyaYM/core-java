class BoomerRunner {

    public static void main(String[] amulya) {

        Boomer b1 = new Boomer(1);
        b1.printDetails();
        System.out.println("-------------------------");

        Boomer b2 = new Boomer(2, "Boomer");
        b2.printDetails();
        System.out.println("-------------------------");

        Boomer b3 = new Boomer(3, "Boomer", "Strawberry");
        b3.printDetails();
        System.out.println("-------------------------");

        Boomer b4 = new Boomer(4, "Boomer", "Mint", "White");
        b4.printDetails();
        System.out.println("-------------------------");

        Boomer b5 = new Boomer(5, "Boomer", "Orange", "Orange", 5);
        b5.printDetails();
        System.out.println("-------------------------");

        Boomer b6 = new Boomer(6, "Boomer", "Mango", "Yellow", 10, 20);
        b6.printDetails();
        System.out.println("-------------------------");

        Boomer b7 = new Boomer(7, "Boomer", "Berry", "Purple", 10, 25, "Rectangle");
        b7.printDetails();
        System.out.println("-------------------------");

        Boomer b8 = new Boomer(8, "Boomer", "Mint", "White", 15, 30, "Rectangle", "Packet");
        b8.printDetails();
        System.out.println("-------------------------");

        Boomer b9 = new Boomer(9, "Boomer", "Orange", "Orange", 20, 35, "Rectangle", "Packet", 10);
        b9.printDetails();
        System.out.println("-------------------------");

        Boomer b10 = new Boomer(10, "Boomer", "Mint", "White", 20, 40, "Rectangle", "Packet", 10, true);
        b10.printDetails();
        System.out.println("-------------------------");

        Boomer b11 = new Boomer(11, "Boomer", "Berry", "Purple", 25, 45, "Rectangle", "Packet", 15, false, "10-08-2026");
        b11.printDetails();
        System.out.println("-------------------------");

        Boomer b12 = new Boomer(12, "Boomer", "Strawberry", "Pink", 30, 50, "Rectangle", "Packet", 20, false, "10-08-2026", "10-08-2027");
        b12.printDetails();
        System.out.println("-------------------------");
    }
}