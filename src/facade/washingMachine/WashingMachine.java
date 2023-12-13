package facade.washingMachine;

public class WashingMachine {
    private Washing washing = new Washing();
    private Rinsing rinsing = new Rinsing();
    private Spinning spinning = new Spinning();

    public void startWashing() {
        washing.wash();
        rinsing.rinse();
        spinning.spin();
    }
}
