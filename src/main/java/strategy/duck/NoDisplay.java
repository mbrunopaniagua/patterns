package strategy.duck;

public class NoDisplay implements IDisplayBehavoir {
	@Override
	public void display() {
		System.out.println("No display");
	}
}
