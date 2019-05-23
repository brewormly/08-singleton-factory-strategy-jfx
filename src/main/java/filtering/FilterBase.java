package filtering;


import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;

public abstract class FilterBase implements MealsFilter {
	protected abstract boolean includeMeal(Meal m);

	@Override
	public List<Meal> filter(List<Meal> meals) {
		List<Meal> filtered = new ArrayList<>();
		meals.forEach(x -> {
			if (includeMeal(x)) {
				filtered.add(x);
			}
		});
		return filtered;
	}
}
