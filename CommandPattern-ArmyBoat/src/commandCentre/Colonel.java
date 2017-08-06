package commandCentre;

import commands.CommandInterface;
/**
 * 
 * @author Skilja
 *
 *Colonel can bring just on attack or defence system
 */
public class Colonel {
	CommandInterface command;
	
	public Colonel(CommandInterface command) {
		this.command = command;
	}
	
	public void issueCommand() {
		command.execute();
	}
	
	@Override
	public String toString() {
		return "Coloners army : " + command.getClass().getName();
	}
}
