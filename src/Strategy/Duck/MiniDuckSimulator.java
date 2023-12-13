package Strategy.Duck;

import Strategy.Duck.Fly.FlyNoWay;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyable(new FlyNoWay());
        duck.performFly();
        System.out.println(duck.getFlyable());
    }
}
