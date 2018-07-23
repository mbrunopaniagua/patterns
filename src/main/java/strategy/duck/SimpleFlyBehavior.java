package strategy.duck;

public class SimpleFlyBehavior implements IFlyBehavior {
	@Override
	public void fly() {
		System.out.println("Simple fly");
	}
}
