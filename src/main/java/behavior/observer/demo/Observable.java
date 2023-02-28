package behavior.observer.demo;

public interface Observable<T> {

    T getState();

    void setState(T t);

    void addObserver(Observer observer);

    boolean removeObserver(Observer observer);

    void notifyObservers();
}
