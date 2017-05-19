package creational.builder;

/**
 * @author Pooja Mantri
 *
 */
public class TestBuilderPattern {
	public static void main(String[] args) {

		NutritionFacts cocaCola = new Builder(240, 8).calories(100).sodium(35)
				.carbohydrate(27).build();
	}
}
