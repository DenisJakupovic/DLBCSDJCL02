public class Person {
	// Zwei Instanzvariablen für Name & Alter
	private String name;
	private int alter;

	// Konstruktor für Name & Alter
	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}

	// Prüfung Personengleichheit mit equals()-Methode
	public boolean equals(Person anderePerson) {
		if (anderePerson == null) {
			return false;
		}

		// Prüfung Alter mit dem ==-Operator
		boolean alterGleich = this.alter == anderePerson.alter;

		// Prüfung Name mit der equals()-Methode der String-Klasse
		boolean nameGleich = this.name.equals(anderePerson.name);

		// Prüfung ob Name & Alter Gleich sind -> Ausgabe true=gleich / false=ungleich
		return nameGleich && alterGleich;
	}

	public static void main(String[] args) {
		Person person1 = new Person("Denis", 32);
		Person person2 = new Person("Denis", 33);

		// Ausgabe Name & Alter je Person (zur Übersicht)
		System.out.println("Name Person 1: " + person1.name + ", " + "Alter Person 1: " + person1.alter);
		System.out.println("Name Person 2: " + person2.name + ", " + "Alter Person 2: " + person2.alter);

		// Prüfung auf Gleichheit
		boolean sindGleich = person1.equals(person2);

		// Ausgabe wenn Personen gleich oder ungleich sind
		if (sindGleich) {
			System.out.println("Die Personen sind gleich.");
		} else {
			System.out.println("Die Personen sind nicht gleich.");
		}
	}
}