package withStrategy;

public class SportsVehicle extends Vehicle{

    public SportsVehicle(){
        super(new SpecialDriveCapability());
    }
}
