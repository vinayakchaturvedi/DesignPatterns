package behavior.observer.usecase.notifyme;

public class EmailNotificationObserverImpl implements NotificationObserver {

    private final String emailId;
    private final StockObservable stockObservable;

    public EmailNotificationObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;

        stockObservable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Stock is available (" + stockObservable.getStock() + ")  now, sending email to: " + emailId);
        sendEmail();
    }

    private void sendEmail() {
        // Send email to emailId
    }
}
