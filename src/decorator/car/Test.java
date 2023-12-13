package decorator.car;

public class Test {

    public static void main(String[] args) {
        Car car = new BasicCar();
        car = new SportsCar(car);
        car = new LuxuryCar(car);

        System.out.println(car.assemble());
    }
}
