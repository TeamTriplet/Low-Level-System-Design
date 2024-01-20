import BookMyShowModule.BookMyShowApp;
import BookMyShowModule.Enums.City;

public class Main {
    public static void main(String[] args) {
        BookMyShowApp bookMyShow = new BookMyShowApp();
        //user1
        bookMyShow.createBooking(City.BANGALORE, "BAAHUBALI");
        //user2
        bookMyShow.createBooking(City.BANGALORE, "BAAHUBALI");

    }
}