package filtering;

public class MealsFilterFactory {

	public MealsFilter getStrategy(String key) {
		if (key == null)
			return new NoFilter();
		switch (key) {
			case "All":
				return new NoFilter();
			case "Vegetarian":
				return new CategoryFilter("Vegetarisch", true);
			case "Vegan":
				return new CategoryFilter("Vegan", true);
			case "No pork":
				return new CategoryFilter("Schwein", false);
			case "No soy":
				return new NotesFilter("mit Soja");
		}
		return new NoFilter();
	}
}
