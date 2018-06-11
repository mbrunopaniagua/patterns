import observer.ConcreteObservable;
import observer.ConcreteObserver;
import strategy.CityDuck;
import strategy.Duck;
import strategy.MountainDuck;
import strategy.NoDisplay;
import strategy.NoFlyBehavior;
import strategy.SimpleDisplay;
import strategy.SimpleFlyBehavior;

public class Main {
	public static void main(String[] args) {
		/*Strategy*/

		System.out.println("Strategy");
		Duck mountainDuck = new MountainDuck(new SimpleFlyBehavior(), new NoDisplay());
		Duck cityDuck = new CityDuck(new NoFlyBehavior(), new SimpleDisplay());

		mountainDuck.fly();
		mountainDuck.display();
		cityDuck.fly();
		cityDuck.display();
		System.out.println("End Strategy");

		/*End Strategy*/

		/*Observer*/

		System.out.println("Observer");
		ConcreteObservable concreteObservable = new ConcreteObservable();
		ConcreteObserver concreteObserver = new ConcreteObserver(concreteObservable);
		concreteObservable.add(concreteObserver);

		concreteObservable.setDataThatCouldBeUpdated(5);
		concreteObservable.announceChange();
		System.out.println("End Observer");

		/*End Observer*/
	}
}
