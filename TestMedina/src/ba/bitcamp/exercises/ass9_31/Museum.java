package ba.bitcamp.exercises.ass9_31;

import java.util.ArrayList;

/**
 * 
 * @author medina.banjic
 *
 */
public class Museum implements Searchable {
	private ArrayList<Exhibit> exhibits;
	private ArrayList<Art> arts;
	private ArrayList<Artifact> artifacts;
	private ArrayList<Employee> employees;

	/**
	 * Constructor
	 * 
	 * @param exhibits
	 * @param arts
	 * @param artifacts
	 * @param employees
	 */
	public Museum(ArrayList<Exhibit> exhibits, ArrayList<Art> arts,
			ArrayList<Artifact> artifacts, ArrayList<Employee> employees) {
		super();
		this.exhibits = exhibits;
		this.arts = arts;
		this.artifacts = artifacts;
		this.employees = employees;
	}

	/**
	 * equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Museum other = (Museum) obj;
		if (artifacts == null) {
			if (other.artifacts != null)
				return false;
		} else if (!artifacts.equals(other.artifacts))
			return false;
		if (arts == null) {
			if (other.arts != null)
				return false;
		} else if (!arts.equals(other.arts))
			return false;
		if (employees == null) {
			if (other.employees != null)
				return false;
		} else if (!employees.equals(other.employees))
			return false;
		if (exhibits == null) {
			if (other.exhibits != null)
				return false;
		} else if (!exhibits.equals(other.exhibits))
			return false;
		return true;
	}

	/**
	 * toString method
	 */
	public String toString() {
		String s = "";
		s += "Museum has: \n\nExhibits: ";
		for (Exhibit value : exhibits) {
			s += value.toString();
		}
		s += "\nArts:";
		for (Art value : arts) {
			s += value.toString();
		}
		s += "\nArtifacts:";
		for (Artifact value : artifacts) {
			s += value.toString();
		}
		s += "\nEmployees:";
		for (Employee value : employees) {
			s += value.toString();
		}
		s += "\n";

		return s;
	}

	/**
	 * This method searches through lists, attributes of museum to find a String
	 * that fits the given one If it finds it, it returns true, if not then it
	 * returns false
	 */
	@Override
	public boolean fitsSearch(String s) {
		for (Exhibit value : exhibits) {
			if (value.getName().contains(s)
					|| value.getDescription().contains(s)
					|| value.getId().contains(s)) {
				return true;
			}
		}
		for (Art value : arts) {
			if (value.getName().contains(s)
					|| value.getDescription().contains(s)
					|| value.getId().contains(s)
					|| value.getAuthor().contains(s)
					|| value.getPeriod().contains(s)) {
				return true;
			}
		}
		for (Artifact value : artifacts) {
			if (value.getName().contains(s)
					|| value.getDescription().contains(s)
					|| value.getId().contains(s)
					|| value.getOrigin().contains(s)
					|| value.getPeriod().contains(s)) {
				return true;
			}
		}
		for (Employee value : employees) {
			if (value.getName().contains(s) || value.getSurname().contains(s)
					|| value.getID().contains(s)
					|| value.getYears().contains(s)) {
				return true;
			}
		}

		return false;
	}

}
