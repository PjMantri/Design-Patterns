package strategy;

import strategy.bean.Duck;
import strategy.bean.MallardDuck;
import strategy.behaviour.FlyNoWay;

/**
 * @author Pooja Mantri
 *
 */
public class TestStrategyPattern {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		mallard.setFlyBehaviour(new FlyNoWay());
		mallard.performFly();
	}
}
