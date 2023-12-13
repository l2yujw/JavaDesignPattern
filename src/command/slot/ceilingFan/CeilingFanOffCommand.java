package command.slot.ceilingFan;

import command.slot.Command;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
		ceilingFan.power = CeilingFanPower.OFF;
	}

	@Override
	public void execute() {
		ceilingFan.off();
	}
}
