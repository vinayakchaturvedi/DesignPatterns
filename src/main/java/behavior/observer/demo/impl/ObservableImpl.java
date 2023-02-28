package behavior.observer.demo.impl;

import behavior.observer.demo.Observable;
import behavior.observer.demo.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable<Integer> {

    private final List<Observer> observers;
    private Integer state;

    public ObservableImpl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public Integer getState() {
        return state;
    }

    @Override
    public void setState(Integer newState) {
        this.state = newState;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
