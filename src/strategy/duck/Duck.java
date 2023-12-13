package strategy.duck;

import strategy.duck.fly.Flyable;
import strategy.duck.quack.Quackable;

public abstract class Duck {
    Flyable flyable;
    Quackable quackable;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyable.fly();
    }
    public void performQuack(){
        quackable.quack();
    }
    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다");
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
