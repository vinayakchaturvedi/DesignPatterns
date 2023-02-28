package behavior.observer.demo.impl;

import behavior.observer.demo.Observable;
import behavior.observer.demo.Observer;

public class HexaObserverImpl implements Observer {

    private final Observable<Integer> observable;

    public HexaObserverImpl(Observable<Integer> observable) {
        this.observable = observable;
    }

    @Override
    public boolean update() {
        try {
            System.out.println("Hexa observer: " + Integer.toHexString(observable.getState()).toUpperCase());
            return true;
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }
}
