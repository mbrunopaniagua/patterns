import decorator.Component;
import decorator.ConcreteComponent;
import decorator.ConcreteDecoratorA;
import decorator.ConcreteDecoratorB;
import decorator.Decorator;
import observer.ConcreteObservable;
import observer.ConcreteObserver;
import strategy.Context;
import strategy.Strategy;
import strategy.StrategyA;
import strategy.StrategyB;

public class Main {
	public static void main(String[] args) {
		/*Strategy*/

		System.out.println("Strategy");

		Strategy strategyA = new StrategyA();
		Context context = new Context(strategyA);
		context.doStuff();

		Strategy strategyB = new StrategyB();
		context.setStrategy(strategyB);
		context.doStuff();
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

		/*Decorator*/

		System.out.println("Decorator");
		Component component = new ConcreteComponent();
		Decorator concreteDecoratorA = new ConcreteDecoratorA(component);
		Decorator concreteDecoratorB = new ConcreteDecoratorB(concreteDecoratorA);
		concreteDecoratorB.operation();
		System.out.println("Decorator");

		/*End decorator*/
	}
}
