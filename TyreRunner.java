class TyreRunner {
    public static void main(String[] tyre) {
        Tyre t1 = new Tyre(1, "MRF", "ZLX", "Car", 5000, 16, 205, "Rubber", 600, true);
        t1.printDetails();

        Tyre t2 = new Tyre(2, "CEAT", "Milaze", "Car", 4500, 15, 195, "Rubber", 550, true);
        t2.printDetails();

        Tyre t3 = new Tyre(3, "Apollo", "Amazer", "Bike", 2500, 17, 120, "Rubber", 300, false);
        t3.printDetails();
    }
}