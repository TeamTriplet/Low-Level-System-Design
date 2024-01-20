package BookMyShowModule.Theatre;

import BookMyShowModule.Enums.SeatType;

public class Seat {
    int id;
    SeatType seatType;
    int row;
    int price;

    public Seat(int id) {
        this.id = id;
    }

    public Seat(int id, SeatType seatType, int price) {
        this.id = id;
        this.seatType = seatType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
