package Command.Slot;

import Command.Slot.CeilingFan.CeilingFan;
import Command.Slot.CeilingFan.CeilingFanOffCommand;
import Command.Slot.CeilingFan.CeilingFanOnCommand;
import Command.Slot.CeilingFan.CeilingFanPower;
import Command.Slot.GarageDoor.GarageDoor;
import Command.Slot.GarageDoor.GarageDoorDownCommand;
import Command.Slot.GarageDoor.GarageDoorUpCommand;
import Command.Slot.Light.Light;
import Command.Slot.Light.LightOffCommand;
import Command.Slot.Light.LightOnCommand;
import Command.Slot.Stereo.Stereo;
import Command.Slot.Stereo.StereoOffCommand;
import Command.Slot.Stereo.StereoOnWithCDCommand;

public class RemoteTestDrive {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFan ceilingFan = new CeilingFan("Living Room");
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoor garageDoor = new GarageDoor("Garage");
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        Stereo stereo = new Stereo("Living Room");
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        System.out.println();
        remoteControl.onButtonWasPushed(2);
        ceilingFanOn.setPower(CeilingFanPower.HIGH);
        remoteControl.onButtonWasPushed(2);
        ceilingFanOn.setPower(CeilingFanPower.MEDIUM);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        ceilingFanOn.setPower(CeilingFanPower.MEDIUM);
        remoteControl.offButtonWasPushed(2);

        System.out.println();
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);

        System.out.println();
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
    }
}
