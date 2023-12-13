package Strategy.Transport2;

public class HighwayRoad implements Road{
    @Override
    public void move() {
        System.out.println("고속도를 이용합니다.");
    }
}
