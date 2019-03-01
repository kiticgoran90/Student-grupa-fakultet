package fakultet;

public class Student extends Osoba {
	
	public Student(String ime, int godRodjenja) {
		super(ime, godRodjenja);
	}
	
	@Override
	public String toString() {
		return "st." + super.toString();
	}
}
