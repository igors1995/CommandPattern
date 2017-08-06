package commands.attack;

import commands.AttackCommandInterface;
import weapons.AttackSystemInterface;

public class FireCommand implements AttackCommandInterface {
	AttackSystemInterface attackSystem;

	public FireCommand(AttackSystemInterface attackSystem) {
		this.attackSystem = attackSystem;
	}

	@Override
	public void execute() {
		attackSystem.fire();
	}
}
