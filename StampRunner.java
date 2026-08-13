class StampRunner {

    public static void main(String[] amulya) {

        Stamp s1 = new Stamp(1);
        s1.printDetails();

        Stamp s2 = new Stamp(2, "Office");
        s2.printDetails();

        Stamp s3 = new Stamp(3, "Date", "Red");
        s3.printDetails();

        Stamp s4 = new Stamp(4, "Name", "Black", "Square");
        s4.printDetails();

        Stamp s5 = new Stamp(5, "Office", "Blue", "Round", 200);
        s5.printDetails();

        Stamp s6 = new Stamp(6, "Date", "Red", "Rectangle", 250, "Rubber");
        s6.printDetails();

        Stamp s7 = new Stamp(7, "Name", "Black", "Square", 300, "Rubber", "Manager");
        s7.printDetails();

        Stamp s8 = new Stamp(8, "Office", "Blue", "Round", 220, "Rubber", "Approved", 5);
        s8.printDetails();

        Stamp s9 = new Stamp(9, "Date", "Red", "Rectangle", 280, "Rubber", "Date", 4, 6);
        s9.printDetails();

        Stamp s10 = new Stamp(10, "Name", "Black", "Square", 320, "Rubber", "Manager", 6, 6, true);
        s10.printDetails();

        Stamp s11 = new Stamp(11, "Office", "Blue", "Round", 350, "Rubber", "Approved", 5, 5, true, "Camlin");
        s11.printDetails();

        Stamp s12 = new Stamp(12, "Date", "Red", "Rectangle", 400, "Rubber", "Received", 6, 7, true, "Trodat", 70);
        s12.printDetails();
    }
}