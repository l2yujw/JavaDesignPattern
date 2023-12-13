package decorator.car;

public class BasicCar extends Car{

    public BasicCar() {
        decription = "Basic Car";
    }

    @Override
    public String assemble() {
        return decription;
    }
}
