import observable.StockObservable;
import observable.impl.IphoneStockObservableImpl;
import observer.NotifyMeObserver;
import observer.impl.EmailNotifyMeObserver;
import observer.impl.MessageNotifyMeObserver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotifyMeObserver  observer1 = new MessageNotifyMeObserver("0000001", iphoneStockObservable);
        NotifyMeObserver  observer2 = new MessageNotifyMeObserver("0000002", iphoneStockObservable);
        NotifyMeObserver  observer3 = new EmailNotifyMeObserver("sdey32@optum.com", iphoneStockObservable);

        iphoneStockObservable.addNotifyMeObservers(observer1);
        iphoneStockObservable.addNotifyMeObservers(observer2);
        iphoneStockObservable.addNotifyMeObservers(observer3);

        iphoneStockObservable.setStockCount(10);
        iphoneStockObservable.setStockCount(0);
        iphoneStockObservable.setStockCount(100);

    }
}