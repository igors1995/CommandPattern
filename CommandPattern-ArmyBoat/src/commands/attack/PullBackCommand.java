package commands.attack;

import commands.AttackCommandInterface;
import weapons.AttackSystemInterface;

public class PullBackCommand implements AttackCommandInterface {
	AttackSystemInterface attackSystem;

	public PullBackCommand(AttackSystemInterface attackSystem) {
		this.attackSystem = attackSystem;
	}

	@Override
	public void execute() {
		attackSystem.pullBack();
	}

}
