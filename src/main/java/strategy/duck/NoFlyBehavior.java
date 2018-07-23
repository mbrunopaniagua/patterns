package strategy.duck;

public class NoFlyBehavior implements IFlyBehavior {
	@Override
	public void fly() {
		System.out.println("No fly");
	}
}
