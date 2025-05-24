package observer;

import java.util.ArrayList;

public class Shop implements Observable{
    private final ArrayList<Observer> observers = new ArrayList<>();

    public Shop() {
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
