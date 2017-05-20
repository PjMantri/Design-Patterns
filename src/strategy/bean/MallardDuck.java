package strategy.bean;

import strategy.behaviour.FlyWithWings;
import strategy.behaviour.Quack;

/**
 * @author Pooja Mantri
 *
 */
public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
