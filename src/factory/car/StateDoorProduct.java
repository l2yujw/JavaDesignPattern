package factory.car;

public class StateDoorProduct extends DoorProduct{
    @Override
    public void makeAssemble() {
        System.out.println("Door is open");
    }
}
