class SoftDrinkRunner {
    public static void main(String[] soft) {
        SoftDrink s1 = new SoftDrink(1, "Coca Cola", "Cola", 40, 500, "Black", "Plastic", 50, true, true);
        s1.printDetails();

        SoftDrink s2 = new SoftDrink(2, "Sprite", "Lemon", 40, 500, "Clear", "Plastic", 45, true, true);
        s2.printDetails();

        SoftDrink s3 = new SoftDrink(3, "Fanta", "Orange", 50, 750, "Orange", "Plastic", 60, false, true);
        s3.printDetails();
    }
}