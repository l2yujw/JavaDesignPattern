package Strategy.Duck.Fly;

public class FlyWithWings implements Flyable{

    @Override
    public void fly() {
        System.out.println("날고 있어요");
    }
}
