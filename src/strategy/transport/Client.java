package strategy.transport;

public class Client {

    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.setMovable(new Bus());
        transport.performMove();
        transport.setMovable(new Train());
        transport.performMove();
    }
}
