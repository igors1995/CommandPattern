package test;

import commandCentre.Colonel;
import commandCentre.General;
import commands.AttackCommandInterface;
import commands.DefenseCommandInterface;
import commands.TypeOfArmy;
import commands.attack.FireCommand;
import commands.attack.PrepareForFireCommand;
import commands.defense.TurnDefOnCommand;
import weapons.Cannon;
import weapons.DefensiveSystem;
import weapons.RocektSystem;

public class ArmyBoat {
	public static void main(String[] args) {
		General g = new General();

		AttackCommandInterface command1 = new PrepareForFireCommand(new RocektSystem());
		AttackCommandInterface command2 = new PrepareForFireCommand(new Cannon());
		AttackCommandInterface command3 = new FireCommand(new Cannon());
		AttackCommandInterface command4 = new FireCommand(new RocektSystem());

		DefenseCommandInterface d1 = new TurnDefOnCommand(new DefensiveSystem());

		g.addAttackCommand(0, command1);
		g.addAttackCommand(1, command2);
		g.addAttackCommand(2, command3);
		g.addAttackCommand(3, command4);
		g.addDefencekCommand(0, d1);

		AttackCommandInterface command = new PrepareForFireCommand(new RocektSystem());
		Colonel c = new Colonel(command);

		System.out.println(g.toString());
		System.out.println();
		System.out.println(c.toString());

		g.FullFire();
		c.issueCommand();

		// Using lambda expression, we can delete attack and defense packages and their
		// classes, and add commands this way
		g.addDefencekCommand(1, () -> {
			new DefensiveSystem().turnDefOff();
		});

		g.callCommand(1, TypeOfArmy.DEFENSE);

		g.addAttackCommand(4, new RocektSystem()::fire);

		System.out.println();
		g.callCommand(4, TypeOfArmy.ATTACK);
	}
}
