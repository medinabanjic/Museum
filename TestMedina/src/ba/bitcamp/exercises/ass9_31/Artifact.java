package ba.bitcamp.exercises.ass9_31;

/**
 * 
 * @author medina.banjic
 *
 */
public class Artifact extends Exhibit {
	private String origin;
	private Periods period;

	public enum Periods {
		CLASSIC, MIDDLEAGES, MODERNERA;
	}

	public Artifact(String id, String name, String description, String origin,
			Periods period) {
		super(id, name, description);
		this.origin = origin;
		this.period = period;
	}

	/**
	 * equals method
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artifact other = (Artifact) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (period != other.period)
			return false;
		return true;
	}

	/**
	 * toString method
	 */
	public String toString() {
		return "\nArt:\nID: " + getId() + "\nName: " + getName()
				+ "\nDescription: " + getDescription() + "\nOrigin: " + origin
				+ "\nPeriod: " + period + "\n\n";
	}

	//Getters
	public String getOrigin() {
		return origin;
	}

	public String getPeriod() {
		return period.toString();
	}

	
	
}
