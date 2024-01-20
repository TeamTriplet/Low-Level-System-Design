package BookMyShowModule.Payment;

public class CardPayment implements Payment{
    @Override
    public void payBill(int amount) {
        System.out.println("Payment of " + amount + " using card Successful!!");
    }
}
