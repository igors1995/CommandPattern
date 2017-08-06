package commands.defense;

import commands.DefenseCommandInterface;
import weapons.DefenseSystemInterface;

public class TurnDefOnCommand implements DefenseCommandInterface {
	DefenseSystemInterface defSystem;

	public TurnDefOnCommand(DefenseSystemInterface defSystem) {
		this.defSystem = defSystem;
	}

	@Override
	public void execute() {
		defSystem.turnDefOn();
	}
}
