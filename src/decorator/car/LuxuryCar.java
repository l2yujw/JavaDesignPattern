package decorator.car;

public class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car car) {
        this.car = car;
    }

    @Override
    public String assemble() {
        return car.assemble() + " 럭셔리차";
    }
}
