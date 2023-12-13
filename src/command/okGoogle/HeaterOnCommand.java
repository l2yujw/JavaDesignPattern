package command.okGoogle;

public class HeaterOnCommand implements Command{

    Heater heater;
    public HeaterOnCommand(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void run() {
        heater.powerOn();
    }
}
