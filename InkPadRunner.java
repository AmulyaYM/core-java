class InkPadRunner {
    public static void main(String[] ink) {
        InkPad i1 = new InkPad(1, "Camlin", "Blue", "Small", 50, "Rectangle", "Water Based", 100, "Plastic", true);
        i1.printDetails();

        InkPad i2 = new InkPad(2, "Faber", "Red", "Medium", 70, "Square", "Dye", 120, "Plastic", true);
        i2.printDetails();

        InkPad i3 = new InkPad(3, "Trodat", "Black", "Large", 100, "Rectangle", "Permanent", 150, "Metal", false);
        i3.printDetails();
    }
}