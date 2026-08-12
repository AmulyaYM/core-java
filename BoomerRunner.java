class BoomerRunner {
    public static void main(String[] boomer) {
        Boomer b1 = new Boomer(1, "Boomer", "Strawberry", "Pink", 5, 10, "Rectangle", "Wrapper", 1, false);
        b1.printDetails();

        Boomer b2 = new Boomer(2, "Boomer", "Mint", "White", 10, 20, "Rectangle", "Packet", 5, true);
        b2.printDetails();

        Boomer b3 = new Boomer(3, "Boomer", "Orange", "Orange", 20, 30, "Rectangle", "Packet", 10, false);
        b3.printDetails();
    }
}