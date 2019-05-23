package filtering;

import ohm.softa.a08.model.Meal;

public class NotesFilter extends FilterBase {
	private String note;

	public NotesFilter(String note) {
		this.note = note;
	}

	@Override
	protected boolean includeMeal(Meal m) {
		if (m.getNotes().contains(note)) {
			return false;
		}
		return true;
	}
}
