package strategy.duck;

public abstract class Duck {
	private final IFlyBehavior flyBehavior;
	private final IDisplayBehavoir displayBehavior;

	public Duck(IFlyBehavior flyBehavior, IDisplayBehavoir displayBehavior) {
		this.flyBehavior = flyBehavior;
		this.displayBehavior = displayBehavior;
	}

	public void fly() {
		this.flyBehavior.fly();
	}

	public void display() {
		this.displayBehavior.display();
	}
}
