class SpecsRunner {

    public static void main(String[] amulya) {

        Specs s1 = new Specs(1);
        s1.printDetails();
        System.out.println("-------------------------");

        Specs s2 = new Specs(2, "Lenskart");
        s2.printDetails();
        System.out.println("-------------------------");

        Specs s3 = new Specs(3, "Titan", "Black");
        s3.printDetails();
        System.out.println("-------------------------");

        Specs s4 = new Specs(4, "RayBan", "Brown", "Metal");
        s4.printDetails();
        System.out.println("-------------------------");

        Specs s5 = new Specs(5, "Lenskart", "Blue", "Plastic", "Single Vision");
        s5.printDetails();
        System.out.println("-------------------------");

        Specs s6 = new Specs(6, "Titan", "Black", "Metal", "Bifocal", 3000);
        s6.printDetails();
        System.out.println("-------------------------");

        Specs s7 = new Specs(7, "RayBan", "Brown", "Metal", "Zero Power", 5000, "Medium");
        s7.printDetails();
        System.out.println("-------------------------");

        Specs s8 = new Specs(8, "Lenskart", "Blue", "Plastic", "Single Vision", 2500, "Large", "Round");
        s8.printDetails();
        System.out.println("-------------------------");

        Specs s9 = new Specs(9, "Titan", "Black", "Metal", "Bifocal", 3500, "Medium", "Square", 1.5);
        s9.printDetails();
        System.out.println("-------------------------");

        Specs s10 = new Specs(10, "RayBan", "Brown", "Metal", "Single Vision", 6000, "Large", "Oval", 2.0, true);
        s10.printDetails();
        System.out.println("-------------------------");

        Specs s11 = new Specs(11, "Lenskart", "Black", "Plastic", "Zero Power", 2000, "Medium", "Round", 0.0, true, "Plastic");
        s11.printDetails();
        System.out.println("-------------------------");

        Specs s12 = new Specs(12, "Titan", "Blue", "Metal", "Bifocal", 4000, "Large", "Square", 1.75, true, "Steel", "Unisex");
        s12.printDetails();
        System.out.println("-------------------------");
    }
}