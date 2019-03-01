package fakultet;

public class Osoba {
	private String ime;
	private int godRodjenja;
	
	public Osoba(String ime, int godRodjenja) {
		this.ime = ime;
		this.godRodjenja = godRodjenja;
	}
	
	@Override
	public String toString() {
		return ime + "(" + godRodjenja + ")";
	}
}
