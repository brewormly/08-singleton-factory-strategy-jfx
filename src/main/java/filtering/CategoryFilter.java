package filtering;

import ohm.softa.a08.model.Meal;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter extends FilterBase {

	private String category;
	private boolean include;

	public CategoryFilter(String category, boolean include) {
		this.category = category;
		this.include = include;
	}

	@Override
	protected boolean includeMeal(Meal m) {
		if (include) {
			if (m.getCategory().equals(category))
				return true;
			return false;
		}
		if (m.getCategory().equals(category))
			return false;
		return true;
	}


}
