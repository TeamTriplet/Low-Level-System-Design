package BookMyShowModule.Theatre;

import BookMyShowModule.Enums.SeatType;
import BookMyShowModule.Payment.Payment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SeatController {
    List<Seat> seatList = new ArrayList<>();
    Set<Integer> bookedSeat = new HashSet<>();

    public void addSeats(SeatType seatType, int count){
        int seatCount = seatList.size();
        for(int i=0;i<count;i++){
            Seat seat = new Seat(i+seatCount, seatType, getPrice(seatType));
            seatList.add(seat);
        }
    }

    private int getPrice(SeatType seatType){
        switch (seatType){
            case SILVER -> {
                return 100;
            }
            case GOLD -> {
                return 200;
            }
            case PLATINUM -> {
                return 300;
            }
        }
        return 0;
    }

    public void bookedSeat(List<Seat> seatList, Payment payment){
        boolean isSeatBooked = false;
        for(Seat desiredSeat : seatList) {
            if (bookedSeat.contains(desiredSeat.id)) {
                isSeatBooked = true;
                System.out.println("Seat " + desiredSeat.getId() + " has been already Booked!!");
            }
        }
        if(!isSeatBooked) {
            for(Seat desiredSeat : seatList) {
                bookedSeat.add(desiredSeat.getId());
            }
            payment.payBill(getTotalBill(seatList));
            System.out.println("Seat Booked Successfully!!");
        }
    }

    private int getTotalBill(List<Seat> seatList){
        int totalBill = 0;
        for(Seat desiredSeat : seatList){
            for(Seat seat : this.seatList){
                if(seat.getId() == desiredSeat.getId()){
                    totalBill += seat.getPrice();
                }
            }
        }
        return totalBill;
    }
}
