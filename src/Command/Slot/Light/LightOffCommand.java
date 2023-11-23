package Command.Slot.Light;

import Command.Slot.Command;

public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
