package factory.car;

public class StateTireProduct extends TireProduct{
    @Override
    public void makeAssemble() {
        System.out.println("미국산 타이어");
    }
}
