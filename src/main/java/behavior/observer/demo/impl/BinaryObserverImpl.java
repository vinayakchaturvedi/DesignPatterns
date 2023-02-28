package behavior.observer.demo.impl;

import behavior.observer.demo.Observable;
import behavior.observer.demo.Observer;

public class BinaryObserverImpl implements Observer {

    private final Observable<Integer> observable;

    public BinaryObserverImpl(Observable<Integer> observable) {
        this.observable = observable;
    }

    @Override
    public boolean update() {
        try {
            System.out.println("Binary Observer: " + Integer.toBinaryString(observable.getState()));
            return true;
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
