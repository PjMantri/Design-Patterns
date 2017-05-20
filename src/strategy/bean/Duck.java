package strategy.bean;

import strategy.behaviour.FlyBehaviour;
import strategy.behaviour.QuackBehaviour;

/**
 * @author Pooja Mantri
 *
 */
public abstract class Duck {
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;

	public abstract void display();

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void swim() {
		System.out.println("All ducks float !!!");
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
