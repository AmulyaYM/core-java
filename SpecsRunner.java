class SpecsRunner {
    public static void main(String[] spec) {

        Specs s1 = new Specs(1, "Lenskart", "Black", "Metal", "Single Vision", 2000, "Medium", "Round", 1.5, true);
        s1.printDetails();

        Specs s2 = new Specs(2, "Titan", "Blue", "Plastic", "Bifocal", 3000, "Large", "Square", 2.0, true);
        s2.printDetails();

        Specs s3 = new Specs(3, "RayBan", "Brown", "Metal", "Zero Power", 5000, "Small", "Oval", 0.0, false);
        s3.printDetails();
    }
}