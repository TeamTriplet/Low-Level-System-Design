package CarRentalModule;

import CarRentalModule.PayMent.UpiPayment;
import CarRentalModule.Vehicle.Vehicle;

import java.util.Date;

public class Reservation {
    public int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;
    Bill bill;


    public int reserve(User user, Vehicle vehicle, ReservationType reservationType, boolean isPaid){

        //generate new id
        reservationId = 11111;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = reservationType;
        reservationStatus = ReservationStatus.SCHEDULED;
        bill = new Bill(1000, new UpiPayment(), isPaid);

        return reservationId;
    }


}
