package Strategy.Transport;

public class Bus implements Movable{
    @Override
    public void move() {
        System.out.println("도로를 따라 움직입니다.");
    }
}
