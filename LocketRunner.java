class LocketRunner {

    public static void main(String[] lock) {

        Locket l1 = new Locket(1, "Tanishq", "Gold", "Golden",
            15000, 10.5, "Heart",
            "Flower", "Small", true
        );

        l1.printLocketDetails();
        System.out.println("----------------");


        Locket l2 = new Locket(
            2, "CaratLane", "Silver", "Silver",
            5000, 8.5, "Round",
            "Star", "Medium", true
        );

        l2.printLocketDetails();
        System.out.println("----------------");


        Locket l3 = new Locket(
            3, "Malabar", "Gold", "Golden",
            20000, 12.5, "Oval",
            "Leaf", "Large", false
        );

        l3.printLocketDetails();
    }
}