package observable.impl;

import observable.StockObservable;
import observer.NotifyMeObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable {
    private List<NotifyMeObserver> observerList = new ArrayList<>();
    private int numberOfIphoneStock = 0;
    @Override
    public void addNotifyMeObservers(NotifyMeObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeNotifyMeObserver(NotifyMeObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for(NotifyMeObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int count) {
        numberOfIphoneStock += count;
        if(numberOfIphoneStock > 0) notifyAllObservers();
    }

    @Override
    public int getStockCount() {
        return numberOfIphoneStock;
    }
}
