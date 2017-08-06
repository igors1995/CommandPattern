package commandCentre;
/**
 * 
 * @author Skilja
 *
 *General can control up to 10 (5 attack ; 5 defence)command systems
 *
 */

import commands.AttackCommandInterface;
import commands.DefenseCommandInterface;
import commands.TypeOfArmy;
import commands.attack.FireCommand;

public class General {
	AttackCommandInterface[] attackSystems = new AttackCommandInterface[5];
	DefenseCommandInterface[] defenceSystems = new DefenseCommandInterface[5];

	public void addAttackCommand(int slot, AttackCommandInterface command) {
		attackSystems[slot] = command;
	}

	public void addDefencekCommand(int slot, DefenseCommandInterface command) {
		defenceSystems[slot] = command;
	}

	public void callCommand(int slot, TypeOfArmy type) {
		if (type == TypeOfArmy.ATTACK && attackSystems[slot] != null) {
			attackSystems[slot].execute();
		} else {
			if (defenceSystems[slot] != null) {
				defenceSystems[slot].execute();
			}
		}
	}

	public void FullFire() {
		for (AttackCommandInterface attackSystem : attackSystems) {
			if (attackSystem != null && attackSystem instanceof FireCommand) {
				attackSystem.execute();
			}
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("\n -----Army----- \n *Attack formations : ");
		for (AttackCommandInterface attackCommandInterface : attackSystems) {
			if (attackCommandInterface != null) {
				sb.append(attackCommandInterface.getClass().getName() + "; ");
			}
		}
		sb.append("\n *Defense formations : \n");
		for (DefenseCommandInterface defenseCommandInterface : defenceSystems) {
			if (defenseCommandInterface != null) {
				sb.append(defenseCommandInterface.getClass().getName() + "; ");
			}
		}

		return sb.toString();
	}

}
