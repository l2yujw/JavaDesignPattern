package Combining.State;

import Combining.Observer.Observable;
import Combining.Observer.Observer;

public class RedHeadDuck implements Quackable{
    Observable observable;

    public RedHeadDuck() {
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("꽥꽥");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
