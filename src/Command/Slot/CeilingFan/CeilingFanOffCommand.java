package Command.Slot.CeilingFan;

import Command.Slot.Command;

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
