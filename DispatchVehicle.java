class DispatchVehicle {

    public static void outOfDelivery() {
        System.out.println("Out For Delivery Started");

        DeliveryAgent.reachDoorStep();

        System.out.println("Out For Delivery Ended");
    }
}