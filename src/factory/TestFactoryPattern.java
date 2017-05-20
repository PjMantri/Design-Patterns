package factory;

/**
 * @author Pooja Mantri
 *
 */
public class TestFactoryPattern {

	public static void main(String[] args) {
		LaptopFactory laptopFactory = new LaptopFactory();

		Laptop laptop;

		laptop = laptopFactory.createLaptop("Apple");
		laptop.printTagline();

		laptop = laptopFactory.createLaptop("Dell");
		laptop.printTagline();
	}
}
