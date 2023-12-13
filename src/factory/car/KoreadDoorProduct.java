package factory.car;

public class KoreadDoorProduct extends DoorProduct{
    @Override
    public void makeAssemble() {
        System.out.println("문이 열립니다");
    }
}
