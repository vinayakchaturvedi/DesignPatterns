package behavior.observer.usecase.notifyme;

public class NotifyMeDemo {

    public static void main(String[] args) {
        IphoneStockObservableImpl observable = new IphoneStockObservableImpl();

        // When user click on notify me create an object and add observer
        EmailNotificationObserverImpl emailNotificationObserver1 =
                new EmailNotificationObserverImpl("abc@gmail.com", observable);
        EmailNotificationObserverImpl emailNotificationObserver2 =
                new EmailNotificationObserverImpl("xyz@yahoo.com", observable);
        MobileNotificationObserverImpl mobileNotificationObserver =
                new MobileNotificationObserverImpl("chvina", observable);

        observable.setStock(10);
        observable.setStock(50);
        observable.setStock(0);
        observable.setStock(60);

    }
}
