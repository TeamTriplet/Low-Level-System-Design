package BookMyShowModule;

import BookMyShowModule.Payment.Payment;
import BookMyShowModule.Payment.UpiPayment;
import BookMyShowModule.Theatre.Seat;
import BookMyShowModule.Theatre.Show;

import java.util.List;

public class Booking {
    Show show;
    List<Seat> seatList;
    Payment payment;

    public Booking(Show show, Payment payment) {
        this.show = show;
        this.payment = payment;
    }

    public void bookShow(List<Seat> seatList){
        this.show.getScreen().bookSeat(seatList, new UpiPayment());
    }
}
