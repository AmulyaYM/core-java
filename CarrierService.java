class CarrierService {

    public static void pickUpPackage() {
        System.out.println("Carrier Pick Up Started");

        HubRouter.sortToZipCode();

        System.out.println("Carrier Pick Up Ended");
    }
}