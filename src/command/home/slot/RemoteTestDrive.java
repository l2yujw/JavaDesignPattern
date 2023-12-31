package command.home.slot;

import command.home.slot.ceilingFan.CeilingFan;
import command.home.slot.ceilingFan.CeilingFanOffCommand;
import command.home.slot.ceilingFan.CeilingFanOnCommand;
import command.home.slot.ceilingFan.CeilingFanPower;
import command.home.slot.garageDoor.GarageDoor;
import command.home.slot.garageDoor.GarageDoorDownCommand;
import command.home.slot.garageDoor.GarageDoorUpCommand;
import command.home.slot.light.Light;
import command.home.slot.light.LightOffCommand;
import command.home.slot.light.LightOnCommand;
import command.home.slot.stereo.Stereo;
import command.home.slot.stereo.StereoOffCommand;
import command.home.slot.stereo.StereoOnWithCDCommand;

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
