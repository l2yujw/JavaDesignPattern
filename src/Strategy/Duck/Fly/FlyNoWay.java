package Strategy.Duck.Fly;

public class FlyNoWay implements Flyable{
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
