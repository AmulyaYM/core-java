class ArtMaterialRunner {

    public static void main(String[] amulya) {

        ArtMaterial a1 = new ArtMaterial(1);
        a1.printDetails();

        ArtMaterial a2 = new ArtMaterial(2, "Paint");
        a2.printDetails();

        ArtMaterial a3 = new ArtMaterial(3, "Pencil", "Apsara");
        a3.printDetails();

        ArtMaterial a4 = new ArtMaterial(4, "Crayon", "Faber", "Wax");
        a4.printDetails();

        ArtMaterial a5 = new ArtMaterial(5, "Paint", "Camlin", "Water Color", "Red");
        a5.printDetails();

        ArtMaterial a6 = new ArtMaterial(6, "Pencil", "Apsara", "Sketch", "Black", 100);
        a6.printDetails();

        ArtMaterial a7 = new ArtMaterial(7, "Crayon", "Faber", "Wax", "Mixed", 150, 24);
        a7.printDetails();

        ArtMaterial a8 = new ArtMaterial(8, "Paint", "Camlin", "Acrylic", "Blue", 250, 12, "Pigment");
        a8.printDetails();

        ArtMaterial a9 = new ArtMaterial(9, "Pencil", "Apsara", "Sketch", "Black", 120, 10, "Graphite", "Medium");
        a9.printDetails();

        ArtMaterial a10 = new ArtMaterial(10, "Crayon", "Faber", "Wax", "Mixed", 180, 24, "Wax", "Large", false);
        a10.printDetails();

        ArtMaterial a11 = new ArtMaterial(11, "Paint", "Camlin", "Water Color", "Red", 300, 12, "Pigment", "Small", true, "Painting");
        a11.printDetails();

        ArtMaterial a12 = new ArtMaterial(12, "Pencil", "Apsara", "Sketch", "Black", 150, 10, "Graphite", "Medium", false, "Drawing", "India");
        a12.printDetails();
    }
}