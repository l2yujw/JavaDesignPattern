package Strategy.Transport2;

public class Client {

    public static void main(String[] args) {
        Moving bus = new Bus();
        Moving train = new Train();

        bus.setRoad(new RailRoad());
        train.setRoad(new HighwayRoad());
        bus.move();
        train.move();
    }
}
