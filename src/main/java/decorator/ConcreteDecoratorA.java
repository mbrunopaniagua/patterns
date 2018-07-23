package decorator;

public class ConcreteDecoratorA extends Decorator {
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	public void operation() {
		super.operation();
		addBehaviour();
		System.out.println("ConcreteDecoratorA operation");
	}

	private void addBehaviour() {
		System.out.println("added behaviour decorator A");
	}
}
