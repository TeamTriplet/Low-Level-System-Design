package CarRentalModule;

import CarRentalModule.Vehicle.Vehicle;
import CarRentalModule.Vehicle.VehicleInventoryManagement;
import CarRentalModule.Vehicle.VehicleType;

import java.util.*;

public class Store {
    public int storeId;
    VehicleInventoryManagement vehicleInventoryManagement;
    public Location location;
    List<Reservation> reservationList = new ArrayList<>();


    public List<Vehicle> getVehicles(VehicleType vehicleType) {

        return vehicleInventoryManagement.getVehicleList();
    }


    //addVehicles, update vehicles, use inventory management to update those.


    public void setVehicles(List<Vehicle> vehicles) {
        vehicleInventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle, User user, ReservationType reservationType, boolean isPaid){
        Reservation reservation = new Reservation();
        reservation.reserve(user, vehicle, reservationType, isPaid);
        reservationList.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        for(Reservation reservation : reservationList){
            if(reservation.reservationId == reservationID){
                reservation.reservationStatus = ReservationStatus.COMPLETED;
                if(!reservation.bill.isPaid) reservation.bill.payBill();
            }
        }
        return true;
    }

}
