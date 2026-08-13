class LocketRunner {

    public static void main(String[] amulya) {

        Locket l1 = new Locket(1);
        l1.printDetails();
        System.out.println("-------------------------");

        Locket l2 = new Locket(2, "Tanishq");
        l2.printDetails();
        System.out.println("-------------------------");

        Locket l3 = new Locket(3, "Malabar", "Gold");
        l3.printDetails();
        System.out.println("-------------------------");

        Locket l4 = new Locket(4, "Kalyan", "Silver", "Silver");
        l4.printDetails();
        System.out.println("-------------------------");

        Locket l5 = new Locket(5, "Tanishq", "Gold", "Golden", 15000);
        l5.printDetails();
        System.out.println("-------------------------");

        Locket l6 = new Locket(6, "Malabar", "Gold", "Golden", 18000, 10.5);
        l6.printDetails();
        System.out.println("-------------------------");

        Locket l7 = new Locket(7, "Kalyan", "Silver", "Silver", 8000, 8.5, "Heart");
        l7.printDetails();
        System.out.println("-------------------------");

        Locket l8 = new Locket(8, "Tanishq", "Gold", "Golden", 20000, 12.5, "Round", "Flower");
        l8.printDetails();
        System.out.println("-------------------------");

        Locket l9 = new Locket(9, "Malabar", "Gold", "Golden", 22000, 13.5, "Oval", "Leaf", "Medium");
        l9.printDetails();
        System.out.println("-------------------------");

        Locket l10 = new Locket(10, "Kalyan", "Silver", "Silver", 9000, 9.5, "Heart", "Star", "Small", true);
        l10.printDetails();
        System.out.println("-------------------------");

        Locket l11 = new Locket(11, "Tanishq", "Gold", "Golden", 25000, 14.5, "Round", "Diamond", "Large", true, "Women");
        l11.printDetails();
        System.out.println("-------------------------");

        Locket l12 = new Locket(12, "Malabar", "Gold", "Golden", 30000, 15.5, "Oval", "Classic", "Medium", true, "Unisex", "India");
        l12.printDetails();
        System.out.println("-------------------------");
    }
}