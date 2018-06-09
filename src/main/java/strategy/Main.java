package strategy;

public class Main {
	public static void main(String[] args) {
		Duck mountainDuck = new MountainDuck(new SimpleFlyBehavior(), new NoDisplay());
		Duck cityDuck = new CityDuck(new NoFlyBehavior(), new SimpleDisplay());

		mountainDuck.fly();
		mountainDuck.display();
		cityDuck.fly();
		cityDuck.display();
	}
}
