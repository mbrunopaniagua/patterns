package observer;

public class ConcreteObserver implements IObserver {
	private final ConcreteObservable concreteObservable;

	public ConcreteObserver(ConcreteObservable concreteObservable) {
		this.concreteObservable = concreteObservable;
	}

	@Override
	public void update() {
		Integer dataThatHasChanged = concreteObservable.getDataThatCouldBeUpdated();
		System.out.println("Now data is " + dataThatHasChanged);
	}
}
