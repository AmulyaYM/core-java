class StampRunner {
    public static void main(String[] stamp) {
        Stamp s1 = new Stamp(1, "Office", "Blue", "Round", 200, "Rubber", "Approved", 5, 5, true);
        s1.printDetails();

        Stamp s2 = new Stamp(2, "Date", "Red", "Rectangle", 250, "Rubber", "Date", 4, 6, true);
        s2.printDetails();

        Stamp s3 = new Stamp(3, "Name", "Black", "Square", 300, "Rubber", "Manager", 6, 6, true);
        s3.printDetails();
    }
}