package fakultet;

import greske.GDodavanje;
import greske.GIndeks;

public abstract class Grupa implements Cloneable {
	private static int ID = 0;
	private int id = ++ID;
	
	
	public int getId() {
		return id;
	}
	
	public abstract Grupa dodaj(Object o) throws GDodavanje;
	
	public abstract Grupa isprazni();
	
	public abstract int brObjekata();
	
	public abstract Object dohvati(int i) throws GIndeks;
	
	public Grupa clone() throws CloneNotSupportedException {
		Grupa k = (Grupa)super.clone();
		k.id = ++id;
		return k;
	}
}
