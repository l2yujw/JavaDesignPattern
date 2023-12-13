package command.Home.slot.ceilingFan;

import command.Home.slot.Command;

public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
		ceilingFan.power = CeilingFanPower.LOW;
	}

	@Override
	public void execute() {
		ceilingFan.mode();
	}

	public void setPower(CeilingFanPower power){
		ceilingFan.power = power;
	}
}
