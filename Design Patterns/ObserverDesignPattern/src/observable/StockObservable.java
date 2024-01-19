package observable;

import observer.NotifyMeObserver;

public interface StockObservable {
    public void addNotifyMeObservers(NotifyMeObserver observer);

    public void removeNotifyMeObserver(NotifyMeObserver observer);

    public void notifyAllObservers();

    public void setStockCount(int count);

    public int getStockCount();

}
