package behavior.observer.usecase.notifyme;

public class MobileNotificationObserverImpl implements NotificationObserver {

    private final String userName;
    private final StockObservable stockObservable;

    public MobileNotificationObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;

        stockObservable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Stock is available (" + stockObservable.getStock() + ")  now, sending message to: " + userName);
        sendMessage();
    }

    private void sendMessage() {
        // Send message to userName
    }
}
