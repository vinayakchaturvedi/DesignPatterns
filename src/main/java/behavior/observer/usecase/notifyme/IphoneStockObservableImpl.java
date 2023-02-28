package behavior.observer.usecase.notifyme;


import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable {

    private final List<NotificationObserver> observers;
    private Integer stockUnits;

    public IphoneStockObservableImpl() {
        this.observers = new ArrayList<>();
        stockUnits = 0;
    }


    @Override
    public Integer getStock() {
        return this.stockUnits;
    }

    @Override
    public void setStock(Integer newStockUnits) {
        Integer oldStockUnits = stockUnits;
        this.stockUnits = newStockUnits;

        if (oldStockUnits == 0) {
            notifyObservers();
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(NotificationObserver::update);
    }

    @Override
    public void addObserver(NotificationObserver observerToBeAdded) {
        observers.add(observerToBeAdded);
    }

    @Override
    public boolean removeObserver(NotificationObserver observerToBeRemoved) {
        return observers.remove(observerToBeRemoved);
    }
}
