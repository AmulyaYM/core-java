class ChainRunner {

    public static void main(String[] amulya) {

        Chain c1 = new Chain(1);
        c1.printDetails();
        System.out.println("-------------------------");

        Chain c2 = new Chain(2, "Tanishq");
        c2.printDetails();
        System.out.println("-------------------------");

        Chain c3 = new Chain(3, "Malabar", "Gold");
        c3.printDetails();
        System.out.println("-------------------------");

        Chain c4 = new Chain(4, "Kalyan", "Silver", "Silver");
        c4.printDetails();
        System.out.println("-------------------------");

        Chain c5 = new Chain(5, "Tanishq", "Gold", "Golden", 50000);
        c5.printDetails();
        System.out.println("-------------------------");

        Chain c6 = new Chain(6, "Malabar", "Gold", "Golden", 55000, 22);
        c6.printDetails();
        System.out.println("-------------------------");

        Chain c7 = new Chain(7, "Kalyan", "Silver", "Silver", 10000, 24, 18);
        c7.printDetails();
        System.out.println("-------------------------");

        Chain c8 = new Chain(8, "Tanishq", "Gold", "Golden", 60000, 22, 20, "Rope");
        c8.printDetails();
        System.out.println("-------------------------");

        Chain c9 = new Chain(9, "Malabar", "Gold", "Golden", 65000, 24, 22, "Box", "Neck");
        c9.printDetails();
        System.out.println("-------------------------");

        Chain c10 = new Chain(10, "Kalyan", "Silver", "Silver", 12000, 25, 20, "Simple", "Neck", true);
        c10.printDetails();
        System.out.println("-------------------------");

        Chain c11 = new Chain(11, "Tanishq", "Gold", "Golden", 70000, 26, 25, "Rope", "Neck", true, "22K");
        c11.printDetails();
        System.out.println("-------------------------");

        Chain c12 = new Chain(12, "Malabar", "Gold", "Golden", 75000, 28, 27, "Classic", "Neck", true, "22K", "Women");
        c12.printDetails();
        System.out.println("-------------------------");
    }
}