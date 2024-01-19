package CarRentalModule.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicleList;

    public VehicleInventoryManagement(List<Vehicle> vehicleList){
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void addVehicles(List<Vehicle> vehicleList){
        this.vehicleList.addAll(vehicleList);
    }
}
