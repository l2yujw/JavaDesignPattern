package combining;

import combining.adapter.Goose;
import combining.adapter.GooseAdapter;
import combining.factory.AbstractDuckFactory;
import combining.factory.CountingDuckFactory;
import combining.iteratorComposite.Flock;
import combining.observer.Quackologist;
import combining.state.QuackCounter;
import combining.state.Quackable;

import java.util.ArrayList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("오리 시뮬레이션 ( + 데코레이터)");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        List<Quackable> quackers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            quackers.add(duckFactory.createMallardDuck());
        }
        flockOfMallards.add(quackers);

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(quackers);

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);
        System.out.println();
        simulate(flockOfMallards);


        System.out.println("오리가 소리 낸 횟수: " + QuackCounter.getQuacks() + " 번");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
