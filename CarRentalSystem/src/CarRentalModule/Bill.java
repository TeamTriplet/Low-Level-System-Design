package CarRentalModule;

import CarRentalModule.PayMent.Payment;

public class Bill {
    double amountToPay;
    Payment paymentMethod;
    boolean isPaid;

    public Bill(double amountToPay, Payment payment, boolean isPaid){
        this.amountToPay = amountToPay;
        this.paymentMethod = payment;
        this.isPaid = isPaid;
    }

    public boolean payBill(){
        if(this.paymentMethod.payBill()){
            System.out.println("Payment of " + this.amountToPay + " is Successful!!");
        }
        return true;
    }
}
