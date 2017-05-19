package creational.factory;

/**
 * @author Pooja Mantri
 *
 */
public class LaptopFactory {

	public Laptop createLaptop(String type) {
		if ("Apple".equals(type)) {
			return new Apple();
		} else {
			return new Dell();
		}
	}
}
