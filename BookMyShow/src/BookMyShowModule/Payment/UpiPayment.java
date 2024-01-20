package BookMyShowModule.Payment;

public class UpiPayment implements Payment{
    @Override
    public void payBill(int amount) {
        System.out.println("Payment of " + amount + " using UPI Successful!!");
    }
}
