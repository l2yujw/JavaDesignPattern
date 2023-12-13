package strategy.duck.quack;

public class Squeak implements Quackable{
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
