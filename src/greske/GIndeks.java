package greske;

@SuppressWarnings("serial")
public class GIndeks extends Exception {
	private int i;
	
	public GIndeks(int i) {
		this.i = i;
	}
	
	public String toString() {
		return "Greska u indeksu: " + i;
	}
}
