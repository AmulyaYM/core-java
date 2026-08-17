public class HotelRunner {
 public static void main(String[] amulya){
 
Hotel hotel1 = new Hotel();

hotel1.hotelName = "Skyline Suites";
hotel1.hotelId = 201;
hotel1.managerName = "Rakesh";
hotel1.hotelAddress = "Bangalore";

Floor floor1 = new Floor();

floor1.floorNumber = 2;
floor1.numberOfRooms = 18;
floor1.floorType = "Executive";

hotel1.floor = floor1;
floor1.hotel = hotel1;

Hotel hotel2 = new Hotel();

hotel2.hotelName = "Ocean Pearl";
hotel2.hotelId = 202;
hotel2.managerName = "Suresh";
hotel2.hotelAddress = "Mangalore";

Floor floor2 = new Floor();

floor2.floorNumber = 3;
floor2.numberOfRooms = 25;
floor2.floorType = "Premium";

hotel2.floor = floor2;
floor2.hotel = hotel2;


Hotel hotel3 = new Hotel();

hotel3.hotelName = "Mountain Breeze";
hotel3.hotelId = 203;
hotel3.managerName = "Deepak";
hotel3.hotelAddress = "Coorg";

Floor floor3 = new Floor();

floor3.floorNumber = 1;
floor3.numberOfRooms = 15;
floor3.floorType = "Deluxe";

hotel3.floor = floor3;
floor3.hotel = hotel3;

Hotel hotel4 = new Hotel();

hotel4.hotelName = "Golden Crown";
hotel4.hotelId = 204;
hotel4.managerName = "Naveen";
hotel4.hotelAddress = "Mysore";

Floor floor4 = new Floor();

floor4.floorNumber = 4;
floor4.numberOfRooms = 32;
floor4.floorType = "Luxury";

hotel4.floor = floor4;
floor4.hotel = hotel4;


Hotel hotel5 = new Hotel();

hotel5.hotelName = "Silver Oak Resort";
hotel5.hotelId = 205;
hotel5.managerName = "Praveen";
hotel5.hotelAddress = "Chikmagalur";

Floor floor5 = new Floor();

floor5.floorNumber = 5;
floor5.numberOfRooms = 28;
floor5.floorType = "Royal";

hotel5.floor = floor5;
floor5.hotel = hotel5;

hotel1.displayHotelDetails();
hotel2.displayHotelDetails();
hotel3.displayHotelDetails();
hotel4.displayHotelDetails();
hotel5.displayHotelDetails();
 }
}