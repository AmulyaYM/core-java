class XeroxRunner {

    public static void main(String[] amulya) {

        Xerox x1 = new Xerox(1);
        x1.printDetails();
        System.out.println("-------------------------");

        Xerox x2 = new Xerox(2, "Canon");
        x2.printDetails();
        System.out.println("-------------------------");

        Xerox x3 = new Xerox(3, "HP", "LaserJet");
        x3.printDetails();
        System.out.println("-------------------------");

        Xerox x4 = new Xerox(4, "Epson", "EcoTank", "Black");
        x4.printDetails();
        System.out.println("-------------------------");

        Xerox x5 = new Xerox(5, "Canon", "ImageClass", "White", 25000);
        x5.printDetails();
        System.out.println("-------------------------");

        Xerox x6 = new Xerox(6, "HP", "LaserJet Pro", "Black", 30000, 35);
        x6.printDetails();
        System.out.println("-------------------------");

        Xerox x7 = new Xerox(7, "Epson", "L3250", "Black", 20000, 30, "A4");
        x7.printDetails();
        System.out.println("-------------------------");

        Xerox x8 = new Xerox(8, "Brother", "DCP-L2541", "Grey", 28000, 32, "A4", 250);
        x8.printDetails();
        System.out.println("-------------------------");

        Xerox x9 = new Xerox(9, "Canon", "MF3010", "Black", 22000, 28, "A4", 200, true);
        x9.printDetails();
        System.out.println("-------------------------");

        Xerox x10 = new Xerox(10, "HP", "M126nw", "Black", 26000, 30, "A4", 250, true, false);
        x10.printDetails();
        System.out.println("-------------------------");

        Xerox x11 = new Xerox(11, "Epson", "L6270", "Black", 35000, 40, "A4", 300, true, true, true);
        x11.printDetails();
        System.out.println("-------------------------");

        Xerox x12 = new Xerox(12, "Canon", "ImageRunner", "White", 50000, 45, "A3", 500, true, true, true, "3 Years");
        x12.printDetails();
        System.out.println("-------------------------");
    }
}