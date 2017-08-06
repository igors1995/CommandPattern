package commands.defense;

import commands.DefenseCommandInterface;
import weapons.DefenseSystemInterface;

public class TurnDefOffCommand implements DefenseCommandInterface {
	DefenseSystemInterface defSystem;

	public TurnDefOffCommand(DefenseSystemInterface defSystem) {
		this.defSystem = defSystem;
	}

	@Override
	public void execute() {
		defSystem.turnDefOff();
	}

}
