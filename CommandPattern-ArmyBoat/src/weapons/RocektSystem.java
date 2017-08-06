package weapons;

public class RocektSystem implements AttackSystemInterface {
	public void prepareForFire() {
		System.out.println("Rocket is prepared!");
	}

	public void fire() {
		System.out.println("Rocket is released!");
	}

	@Override
	public void pullBack() {
		System.out.println("Rocket system is pulled back!");
	}

}
