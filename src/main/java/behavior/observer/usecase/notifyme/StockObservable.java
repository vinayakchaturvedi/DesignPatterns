package behavior.observer.usecase.notifyme;


public interface StockObservable {

    Integer getStock();

    void setStock(Integer newStockUnits);

    void notifyObservers();

    void addObserver(NotificationObserver observer);

    boolean removeObserver(NotificationObserver observer);

}
