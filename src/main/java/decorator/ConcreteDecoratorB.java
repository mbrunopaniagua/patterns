package decorator;

public class ConcreteDecoratorB extends Decorator {
	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	public void operation() {
		super.operation();
		addBehaviour();
		System.out.println("ConcreteDecoratorB operation");

	}

	private void addBehaviour() {
		System.out.println("added behaviour decorator B");
	}
}
