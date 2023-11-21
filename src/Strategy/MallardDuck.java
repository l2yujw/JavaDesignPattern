package Strategy;

import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackable = new Quack();
        flyable = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다");
    }
}
