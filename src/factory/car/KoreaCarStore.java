package factory.car;

public class KoreaCarStore extends CarStore{

    @Override
    public void display() {
        carFactory = new KoreaCarFactory();
        makeCar();
    }
}
