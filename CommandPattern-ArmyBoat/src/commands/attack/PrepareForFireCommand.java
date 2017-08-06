package commands.attack;

import commands.AttackCommandInterface;
import weapons.AttackSystemInterface;

public class PrepareForFireCommand implements AttackCommandInterface {
	AttackSystemInterface attackSystem;

	public PrepareForFireCommand(AttackSystemInterface attackSystem) {
		this.attackSystem = attackSystem;
	}

	@Override
	public void execute() {
		attackSystem.prepareForFire();
	}

}
