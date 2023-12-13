package decorator.car;

public class SportsCar extends CarDecorator{

    public SportsCar(Car car) {
        this.car = car;
    }

    @Override
    public String assemble() {
        return car.decription + " 스포츠카";
    }
}
