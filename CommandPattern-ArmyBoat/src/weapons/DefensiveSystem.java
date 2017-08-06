package weapons;

public class DefensiveSystem implements DefenseSystemInterface {
	public void turnDefOn() {
		System.out.println("Our boat is protected!");
	}

	public void turnDefOff() {
		System.out.println("Defensive system is turned off!");
	}
}
