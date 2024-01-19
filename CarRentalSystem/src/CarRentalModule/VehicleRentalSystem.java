package CarRentalModule;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VehicleRentalSystem(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStore(Location location){
        for(Store store : storeList){
            if(store.location.city == location.city) return store;
        }
        return null;
    }
}
