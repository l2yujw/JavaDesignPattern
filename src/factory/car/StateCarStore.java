package factory.car;

public class StateCarStore extends CarStore{
    @Override
    public void display() {
        carFactory = new StateCarFactory();
        makeCar();
    }
}
