class ThinkPadRunner {
    public static void main(String[] think) {
        ThinkPad t1 = new ThinkPad(1, "E14", "Intel i5", 8, 512, 60000, 14, "Black", "Windows 11", false);
        t1.printDetails();

        ThinkPad t2 = new ThinkPad(2, "T14", "Intel i7", 16, 512, 90000, 14, "Black", "Windows 11", true);
        t2.printDetails();

        ThinkPad t3 = new ThinkPad(3, "X1 Carbon", "Intel i7", 16, 1024, 120000, 14, "Black", "Windows 11", true);
        t3.printDetails();
    }
}