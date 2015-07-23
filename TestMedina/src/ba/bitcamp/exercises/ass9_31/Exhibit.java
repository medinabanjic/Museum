package ba.bitcamp.exercises.ass9_31;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author medina.banjic
 *
 */
public class Exhibit implements Comparable<Exhibit> {
	private String id;
	private String name;
	private String description;

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param name
	 * @param description
	 */
	public Exhibit(String id, String name, String description) {
		super();
		this.setId(id);
		this.setName(name);
		this.setDescription(description);
	}

	/**
	 * This method sorts exhibits by name
	 */
	public static void sortByName(ArrayList<Exhibit> exhibits) {
		Collections.sort(exhibits, new Comparator<Exhibit>() {

			@Override
			public int compare(Exhibit o1, Exhibit o2) {
				return o1.name.compareTo(o2.name);
			}
		});
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
		Exhibit other = (Exhibit) obj;
		if (getDescription() == null) {
			if (other.getDescription() != null)
				return false;
		} else if (!getDescription().equals(other.getDescription()))
			return false;
		if (getId() == null) {
			if (other.getId() != null)
				return false;
		} else if (!getId().equals(other.getId()))
			return false;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		return true;
	}

	/**
	 * toString method
	 */
	public String toString() {
		return "\nExhibit:\nID: " + getId() + "\nName: " + getName()
				+ "\nDescription: " + getDescription() + "\n\n";
	}

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * compareTo method, implemented from Comparable interface
	 * 
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Exhibit o) {
		return this.id.compareTo(o.id);
	}

}
