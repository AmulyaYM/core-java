class TyreRunner {

    public static void main(String[] amulya) {

        Tyre t1 = new Tyre(1);
        t1.printDetails();

        Tyre t2 = new Tyre(2, "MRF");
        t2.printDetails();

        Tyre t3 = new Tyre(3, "CEAT", "Milaze");
        t3.printDetails();

        Tyre t4 = new Tyre(4, "Apollo", "Amazer", "Bike");
        t4.printDetails();

        Tyre t5 = new Tyre(5, "MRF", "ZLX", "Car", 5000);
        t5.printDetails();

        Tyre t6 = new Tyre(6, "CEAT", "Milaze", "Car", 4500, 15);
        t6.printDetails();

        Tyre t7 = new Tyre(7, "Apollo", "Amazer", "Bike", 2500, 17, 120);
        t7.printDetails();

        Tyre t8 = new Tyre(8, "MRF", "ZLX", "Car", 5500, 16, 205, "Rubber");
        t8.printDetails();

        Tyre t9 = new Tyre(9, "CEAT", "Milaze", "Car", 5000, 15, 195, "Rubber", 550);
        t9.printDetails();

        Tyre t10 = new Tyre(10, "Apollo", "Amazer", "Bike", 3000, 17, 120, "Rubber", 300, true);
        t10.printDetails();

        Tyre t11 = new Tyre(11, "MRF", "ZLX", "Car", 6000, 16, 205, "Rubber", 600, true, "Car");
        t11.printDetails();

        Tyre t12 = new Tyre(12, "CEAT", "Milaze", "Car", 6500, 17, 215, "Rubber", 650, true, "SUV", "5 Years");
        t12.printDetails();
    }
}