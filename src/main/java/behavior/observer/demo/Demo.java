package behavior.observer.demo;

import behavior.observer.demo.impl.BinaryObserverImpl;
import behavior.observer.demo.impl.HexaObserverImpl;
import behavior.observer.demo.impl.ObservableImpl;

public class Demo {

    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        BinaryObserverImpl binaryObserver = new BinaryObserverImpl(observable);
        HexaObserverImpl hexaObserver = new HexaObserverImpl(observable);

        observable.setState(5);
        observable.addObserver(binaryObserver);
        observable.setState(4);
        observable.addObserver(hexaObserver);
        observable.setState(2);
        observable.setState(4);
    }
}
