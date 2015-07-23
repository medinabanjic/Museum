package ba.bitcamp.exercises.ass9_31;

/**
 * 
 * @author medina.banjic
 *
 */
public class Employee {
	private String name;
	private String surname;
	private String ID;
	private Integer years;

	public Employee(String name, String surname, String iD, Integer years) {
		super();
		this.name = name;
		this.surname = surname;
		ID = iD;
		this.years = years;
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
		Employee other = (Employee) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (years == null) {
			if (other.years != null)
				return false;
		} else if (!years.equals(other.years))
			return false;
		return true;
	}

	/**
	 * toString method
	 */
	public String toString() {
		return "Employee: \n" + name + " " + surname + "\nID: " + ID
				+ "\nYears: " + years + "\n\n";
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getID() {
		return ID;
	}

	public String getYears() {
		return years.toString();
	}

}
