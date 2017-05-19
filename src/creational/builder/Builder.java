package creational.builder;

/**
 * @author Pooja Mantri
 *
 */
public class Builder {
	// Required parameters
	final int servingSize;
	final int servings;
	// Optional parameters - initialized to default values
	int calories = 0;
	int fat = 0;
	int carbohydrate = 0;
	int sodium = 0;

	public Builder(int servingSize, int servings) {
		this.servingSize = servingSize;
		this.servings = servings;
	}

	public Builder calories(int val) {
		calories = val;
		return this;
	}

	public Builder fat(int val) {
		fat = val;
		return this;
	}

	public Builder carbohydrate(int val) {
		carbohydrate = val;
		return this;
	}

	public Builder sodium(int val) {
		sodium = val;
		return this;
	}

	public NutritionFacts build() {
		return new NutritionFacts(this);
	}
}