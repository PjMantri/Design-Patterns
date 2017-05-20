package factory;

/**
 * @author Pooja Mantri
 *
 */
public class LaptopFactory {

	public Laptop createLaptop(String type) {
		if ("Expensive".equals(type)) {
			return new Apple();
		} else {
			return new Dell();
		}
	}
}
