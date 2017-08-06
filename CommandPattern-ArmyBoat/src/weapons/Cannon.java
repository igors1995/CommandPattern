package weapons;

public class Cannon implements AttackSystemInterface{
	public void prepareForFire() {
		System.out.println("All cannons are ready!");
	}

	public void pullBack() {
		System.out.println("All cannons are thrown back!");
	}

	public void fire() {
		System.out.println("Fire in the hole!");
	}
}
