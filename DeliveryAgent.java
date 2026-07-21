class DeliveryAgent {

    public static void reachDoorStep() {
        System.out.println("Reached Door Step");

        SignaturePortal.collectESign();

        System.out.println("Delivery Completed");
    }
}