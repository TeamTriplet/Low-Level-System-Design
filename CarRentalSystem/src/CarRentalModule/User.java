package CarRentalModule;

public class User {
    String userId;
    String userName;
    String drivingLicense;

    public User(String userId, String userName, String drivingLicense) {
        this.userId = userId;
        this.userName = userName;
        this.drivingLicense = drivingLicense;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
