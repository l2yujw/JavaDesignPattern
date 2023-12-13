package Strategy.Transport2;

public class RailRoad implements Road{
    @Override
    public void move() {
        System.out.println("선로를 따라 움직입니다.");
    }
}
