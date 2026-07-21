class OrderSystem {

    public static void takeOrder() {
        System.out.println("Take Order Started");

        InventoryCheck.validate();

        System.out.println("Take Order Ended");
    }
}