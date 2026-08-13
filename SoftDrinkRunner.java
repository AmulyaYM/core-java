class SoftDrinkRunner {

    public static void main(String[] amulya) {

        SoftDrink s1 = new SoftDrink(1);
        s1.printDetails();

        SoftDrink s2 = new SoftDrink(2, "Coca Cola");
        s2.printDetails();

        SoftDrink s3 = new SoftDrink(3, "Sprite", "Lemon");
        s3.printDetails();

        SoftDrink s4 = new SoftDrink(4, "Fanta", "Orange", 50);
        s4.printDetails();

        SoftDrink s5 = new SoftDrink(5, "Pepsi", "Cola", 40, 500);
        s5.printDetails();

        SoftDrink s6 = new SoftDrink(6, "Sprite", "Lemon", 40, 500, "Clear");
        s6.printDetails();

        SoftDrink s7 = new SoftDrink(7, "Fanta", "Orange", 50, 750, "Orange", "Plastic");
        s7.printDetails();

        SoftDrink s8 = new SoftDrink(8, "Pepsi", "Cola", 60, 1000, "Black", "Plastic", 50);
        s8.printDetails();

        SoftDrink s9 = new SoftDrink(9, "Coca Cola", "Cola", 60, 1000, "Black", "Plastic", 55, true);
        s9.printDetails();

        SoftDrink s10 = new SoftDrink(10, "Sprite", "Lemon", 60, 1000, "Clear", "Plastic", 45, true, true);
        s10.printDetails();

        SoftDrink s11 = new SoftDrink(11, "Fanta", "Orange", 70, 1250, "Orange", "Plastic", 60, true, true, "01-08-2026");
        s11.printDetails();

        SoftDrink s12 = new SoftDrink(12, "Pepsi", "Cola", 80, 1500, "Black", "Plastic", 65, true, true, "01-08-2026", "01-02-2027");
        s12.printDetails();
    }
}