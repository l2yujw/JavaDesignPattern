package Strategy.Duck.Quack;

public class MuteQuack implements Quackable{
    @Override
    public void quack() {
        System.out.println("쉿");
    }
}
