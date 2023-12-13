package observer.publisher;

public interface Publisher {

    public void addObserver(Observer o);

    public void deleteObserver(Observer observer);
    public void notifyObserver();
}
