class ArtMaterialRunner {
    public static void main(String[] art) {
        ArtMaterial a1 = new ArtMaterial(1, "Paint", "Camlin", "Water Color", "Red", 200, 12, "Pigment", "Small", true);
        a1.printDetails();

        ArtMaterial a2 = new ArtMaterial(2, "Pencil", "Apsara", "Sketch", "Black", 100, 10, "Graphite", "Medium", false);
        a2.printDetails();

        ArtMaterial a3 = new ArtMaterial(3, "Crayon", "Faber", "Wax", "Mixed", 150, 24, "Wax", "Large", false);
        a3.printDetails();
    }
}