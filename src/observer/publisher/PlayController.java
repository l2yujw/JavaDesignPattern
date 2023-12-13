package observer.publisher;

import java.util.ArrayList;
import java.util.List;

public class PlayController implements Publisher{

    private List<Observer> observers = new ArrayList<>();
    private boolean play;
    private Observer myOb;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers) {
            observer.notify(play);
        }
    }

    public void setFlag(boolean play){
        this.play = play;
        notifyObserver();
    }
}
