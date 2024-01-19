package CarRentalModule.PayMent;

public class CashPayment implements Payment{

    @Override
    public boolean payBill(){
        return true;
    }
}
