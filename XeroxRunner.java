class XeroxRunner {
    public static void main(String[] xerox) {
        Xerox x1 = new Xerox(1, "Canon", "X100", "White", 25000, 30, "A4", 250, true, true);
        x1.printDetails();

        Xerox x2 = new Xerox(2, "HP", "M200", "Black", 30000, 35, "A3", 300, true, false);
        x2.printDetails();

        Xerox x3 = new Xerox(3, "Epson", "E500", "Grey", 35000, 40, "A4", 350, true, true);
        x3.printDetails();
    }
}