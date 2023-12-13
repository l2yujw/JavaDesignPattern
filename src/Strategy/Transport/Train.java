package Strategy.Transport;

public class Train implements Movable{
    @Override
    public void move() {
        System.out.println("철로를 따라 움직입니다");
    }
}
