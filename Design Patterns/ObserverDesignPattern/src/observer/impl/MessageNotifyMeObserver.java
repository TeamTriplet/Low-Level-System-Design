package observer.impl;

import observable.StockObservable;
import observer.NotifyMeObserver;

public class MessageNotifyMeObserver implements NotifyMeObserver {
    String phNumber;
    StockObservable observable;

    public MessageNotifyMeObserver(String phNumber, StockObservable observable){
        this.phNumber = phNumber;
        this.observable = observable;
    }

    @Override
    public void update(){
        System.out.println("Message Notification sent to Mrs. " + phNumber + ". Total stocks available " + observable.getStockCount());
    }
}
