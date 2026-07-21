class InventoryCheck {

    public static void validate() {
        System.out.println("Inventory Validation Started");

        WareHouse.fetchFromAisle();

        System.out.println("Inventory Validation Ended");
    }
}