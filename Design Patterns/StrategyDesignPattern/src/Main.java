import withStrategy.NormalVehicle;
import withStrategy.SportsVehicle;
import withStrategy.Vehicle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Vehicle normalCar = new NormalVehicle();
        Vehicle sportsCar = new SportsVehicle();
        normalCar.drive();
        sportsCar.drive();
    }
}