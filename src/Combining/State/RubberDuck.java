package Combining.State;

import Combining.Observer.Observable;
import Combining.Observer.Observer;

public class RubberDuck implements Quackable{
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("퀵퀵");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
