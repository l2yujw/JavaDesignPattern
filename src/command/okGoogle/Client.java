package command.okGoogle;

public class Client {

    public static void main(String[] args) {
        Heater heater = new Heater();
        Lamp lmp = new Lamp();

        Command heaterOnCommand = new HeaterOnCommand(heater);
        Command lampOnCommand = new LampOnCommand(lmp);
        OKGoogle okGoogle = new OKGoogle();

        okGoogle.setCommand(heaterOnCommand);
        okGoogle.talk();

        okGoogle.setCommand(lampOnCommand);
        okGoogle.talk();
    }
}
