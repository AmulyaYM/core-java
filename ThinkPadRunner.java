class ThinkPadRunner {

    public static void main(String[] amulya) {

        ThinkPad t1 = new ThinkPad(1);
        t1.printDetails();

        ThinkPad t2 = new ThinkPad(2, "E14");
        t2.printDetails();

        ThinkPad t3 = new ThinkPad(3, "T14", "Intel i5");
        t3.printDetails();

        ThinkPad t4 = new ThinkPad(4, "X1 Carbon", "Intel i7", 16);
        t4.printDetails();

        ThinkPad t5 = new ThinkPad(5, "E14", "Intel i5", 8, 512);
        t5.printDetails();

        ThinkPad t6 = new ThinkPad(6, "T14", "Intel i7", 16, 512, 90000);
        t6.printDetails();

        ThinkPad t7 = new ThinkPad(7, "X1 Carbon", "Intel i7", 16, 1024, 120000, 14);
        t7.printDetails();

        ThinkPad t8 = new ThinkPad(8, "E14", "Intel i5", 8, 512, 60000, 14, "Black");
        t8.printDetails();

        ThinkPad t9 = new ThinkPad(9, "T14", "Intel i7", 16, 512, 90000, 14, "Black", "Windows 11");
        t9.printDetails();

        ThinkPad t10 = new ThinkPad(10, "X1 Carbon", "Intel i7", 16, 1024, 120000, 14, "Black", "Windows 11", true);
        t10.printDetails();

        ThinkPad t11 = new ThinkPad(11, "E14", "Intel i5", 16, 512, 70000, 14, "Black", "Windows 11", false, "Intel Iris Xe");
        t11.printDetails();

        ThinkPad t12 = new ThinkPad(12, "X1 Carbon", "Intel i7", 16, 1024, 120000, 14, "Black", "Windows 11", true, "Intel Iris Xe", "3 Years");
        t12.printDetails();
    }
}