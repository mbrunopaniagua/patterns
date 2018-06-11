package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements IObservable {
	private List<IObserver> observers = new ArrayList<>();
	private Integer dataThatCouldBeUpdated;

	@Override
	public void add(IObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void announceChange() {
		observers.forEach(IObserver::update);
	}

	public Integer getDataThatCouldBeUpdated() {
		return dataThatCouldBeUpdated;
	}

	public void setDataThatCouldBeUpdated(Integer dataThatCouldBeUpdated) {
		this.dataThatCouldBeUpdated = dataThatCouldBeUpdated;
	}
}
