package observer.impl;

import observable.StockObservable;
import observer.NotifyMeObserver;

public class EmailNotifyMeObserver implements NotifyMeObserver {

    String emailId;
    StockObservable observable;

    public EmailNotifyMeObserver(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update(){
        System.out.println("Email Notification sent to Mrs. " + emailId + ". Total stocks available " + observable.getStockCount());
    }

}
