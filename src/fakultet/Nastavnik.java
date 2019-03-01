package fakultet;

public class Nastavnik extends Osoba {
	
	public Nastavnik(String ime, int godRodjenja) {
		super(ime, godRodjenja);
	}
	
	@Override
	public String toString() {
		return "na." + super.toString();
	}
}
