package ba.bitcamp.exercises.ass9_31;

/**
 * 
 * @author medina.banjic
 *
 */
public class Art extends Exhibit{
	private String author;
	private Period period;
	
	/**
	 * enum for a periods of arts
	 *
	 */
	public enum Period{
		RENAISSANCE, NEOCLASSIC, ARTNOUVEAU, CONTEMPORARYART;
	}

	public Art(String id, String name, String description, String author,
			Period period) {
		super(id, name, description);
		this.author = author;
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
		Art other = (Art) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (period != other.period)
			return false;
		return true;
	}
	

	/**
	 * toString method
	 */
	public String toString() {
		return "\nArt:\nID: " + getId() + "\nName: " + getName() + "\nDescription: "
				+ getDescription() + "\nAuthor: " + author + "\nPeriod: " + period + "\n\n";
	}

	//Getters
	public String getAuthor() {
		return author;
	}

	public String getPeriod() {
		return period.toString();
	}
	
	
	
	
	
}
