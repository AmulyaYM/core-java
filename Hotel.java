public class Hotel {

    String hotelName;
    int hotelId;
    String managerName;
    String hotelAddress;

    Floor floor;

    public void displayHotelDetails() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Hotel ID: " + hotelId);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Hotel Address: " + hotelAddress);

        floor.displayFloorDetails();

        System.out.println("---------------------------");
    }
}