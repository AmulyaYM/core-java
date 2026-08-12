class ChainRunner {
    public static void main(String[] chain) {

        Chain c1 = new Chain(1, "Tanishq", "Gold", "Golden", 50000, 20, 15, "Simple", "Neck", true);
        c1.printDetails();

        Chain c2 = new Chain(2, "Malabar", "Silver", "Silver", 8000, 22, 18, "Box", "Neck", true);
        c2.printDetails();

        Chain c3 = new Chain(3, "Kalyan", "Platinum", "White", 70000, 24, 20, "Rope", "Neck", false);
        c3.printDetails();
    }
}