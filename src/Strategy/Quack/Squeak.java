package Strategy.Quack;

public class Squeak implements Quackable{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
