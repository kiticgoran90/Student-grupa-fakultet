package fakultet;

import greske.GDodavanje;
import greske.GIndeks;

public class Fakultet extends Grupa {
	private static final int inicKap = 10;
	private static final int povecanje = 10;
	
	private Osoba[] niz = new Osoba[inicKap];
	private int brOsoba;
	
	@Override
	public int brObjekata() {
		return brOsoba;
	}
	
	@Override
	public Fakultet dodaj(Object o) throws GDodavanje {
		if(!(o instanceof Osoba)) throw new GDodavanje();
		if(brOsoba == niz.length) {
			Osoba[] noviNiz = new Osoba[brOsoba + povecanje];
			for(int i=0; i<brOsoba; i++)
				noviNiz[i] = niz[i];
			niz = noviNiz;
		}
		niz[brOsoba++] = (Osoba)o;
		return this;
	}
	
	@Override
	public Osoba dohvati(int i) throws GIndeks {
		if(i<0 || i>brOsoba) throw new GIndeks(i);
		return niz[i];
	}
	
	@Override
	public Fakultet isprazni() {
		niz = new Osoba[inicKap];
		brOsoba = 0;
		return this;
	}
	
	public final Fakultet clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
