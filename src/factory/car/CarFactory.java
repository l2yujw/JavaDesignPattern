package factory.car;

public abstract class CarFactory {
    public abstract TireProduct createTire();
    public abstract DoorProduct createDoor();
}
