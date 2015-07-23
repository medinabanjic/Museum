package ba.bitcamp.exercises.ass9_31;

import java.util.ArrayList;

import ba.bitcamp.exercises.ass9_31.Art.Period;
import ba.bitcamp.exercises.ass9_31.Artifact.Periods;

public class Main {

	public static void main(String[] args) {
		ArrayList<Exhibit> exhibits = new ArrayList<>();
		exhibits.add(new Exhibit("45dsr", "Matisse",
				"New York Museum of Modern Arts Top 10"));
		exhibits.add(new Exhibit("54dh8", "Forty Years",
				"New York Museum of Modern Arts Top 10"));

		ArrayList<Art> arts = new ArrayList<>();
		arts.add(new Art(
				"654688",
				"Mona Lisa",
				"The Mona Lisa or La Gioconda is a half-length portrait of a woman",
				"Leonardo da Vinci", Period.RENAISSANCE));
		arts.add(new Art("556fds", "The Birth of Venus",
				"It depicts the goddess Venus.", "Sandro Botticelli",
				Period.RENAISSANCE));

		ArrayList<Artifact> artifacts = new ArrayList<>();
		artifacts.add(new Artifact("64dsd", "Jewelry",
				"A collection of shells from Skhul Cave.", "Israel",
				Periods.MIDDLEAGES));
		artifacts
				.add(new Artifact(
						"5455d",
						"Map",
						"There’s the cave in which it was found, a mountain, a river, and drawings of various animals that would’ve made a nice meal.",
						"Spain", Periods.MIDDLEAGES));

		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Medina", "Banjic", "301", 22));
		employees.add(new Employee("Kristina", "Pupavac", "556", 28));

		Museum TheLouvre = new Museum(exhibits, arts, artifacts, employees);

		Exhibit.sortByName(exhibits);

		for (Exhibit value : exhibits) {
			System.out.println(value.toString());
		}

		System.out.println("Our Museum lists contain the given String: "
				+ TheLouvre.fitsSearch("goddess"));

		System.out.println();

		System.out.println(TheLouvre.toString());
	}

}
