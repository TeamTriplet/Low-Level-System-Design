package BookMyShowModule.Theatre;

import BookMyShowModule.Payment.Payment;

import java.util.List;

public class Screen {
    int id;
    SeatController seatController;

    public Screen() {
        seatController = new SeatController();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SeatController getSeatController() {
        return seatController;
    }

    public void setSeatController(SeatController seatController) {
        this.seatController = seatController;
    }

    public void bookSeat(List<Seat> seatList, Payment payment){
        seatController.bookedSeat(seatList, payment);
    }
}
