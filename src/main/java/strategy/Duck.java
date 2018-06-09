package strategy;

public abstract class Duck {
	private final IFlyBehavior flyBehavior;
	private final IDisplayBehavoir displayBehavior;

	public Duck(IFlyBehavior flyBehavior, IDisplayBehavoir displayBehavior) {
		this.flyBehavior = flyBehavior;
		this.displayBehavior = displayBehavior;
	}

	protected void fly() {
		this.flyBehavior.fly();
	}

	protected void display() {
		this.displayBehavior.display();
	}
}
