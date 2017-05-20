package strategy.behaviour;

/**
 * @author Pooja Mantri
 *
 */
public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Silence!");
	}

}
