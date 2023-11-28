package Combining.Adapter;

import Combining.Observer.Observable;
import Combining.Observer.Observer;
import Combining.State.Quackable;

public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
