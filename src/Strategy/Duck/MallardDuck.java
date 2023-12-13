package Strategy.Duck;

import Strategy.Duck.Fly.FlyWithWings;
import Strategy.Duck.Quack.Quack;

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
