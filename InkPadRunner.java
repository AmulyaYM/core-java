class InkPadRunner {

    public static void main(String[] amulya) {

        InkPad i1 = new InkPad(1);
        i1.printDetails();

        InkPad i2 = new InkPad(2, "Camlin");
        i2.printDetails();

        InkPad i3 = new InkPad(3, "Faber", "Blue");
        i3.printDetails();

        InkPad i4 = new InkPad(4, "Camlin", "Red", "Small");
        i4.printDetails();

        InkPad i5 = new InkPad(5, "Faber", "Black", "Medium", 50);
        i5.printDetails();

        InkPad i6 = new InkPad(6, "Camlin", "Blue", "Large", 70, "Rectangle");
        i6.printDetails();

        InkPad i7 = new InkPad(7, "Trodat", "Black", "Medium", 80, "Square", "Permanent");
        i7.printDetails();

        InkPad i8 = new InkPad(8, "Camlin", "Red", "Large", 100, "Rectangle", "Dye", 120);
        i8.printDetails();

        InkPad i9 = new InkPad(9, "Faber", "Blue", "Medium", 90, "Square", "Water Based", 100, "Plastic");
        i9.printDetails();

        InkPad i10 = new InkPad(10, "Trodat", "Black", "Large", 120, "Rectangle", "Permanent", 150, "Metal", true);
        i10.printDetails();

        InkPad i11 = new InkPad(11, "Camlin", "Blue", "Large", 130, "Rectangle", "Dye", 160, "Plastic", true, "India");
        i11.printDetails();

        InkPad i12 = new InkPad(12, "Faber", "Red", "Large", 150, "Rectangle", "Permanent", 180, "Plastic", true, "India", 5);
        i12.printDetails();
    }
}