package fakultet;

import greske.GTekuciElem;
import greske.GIndeks;

public class Neuredjen implements Obilazak {
	private Grupa grupa;
	private int tek = -1;
	
	public Neuredjen(Grupa grupa) {
		this.grupa = grupa;
	}
	
	@Override
	public void naPrviElem() {
		tek = 0;
	}

	@Override
	public Object tekuciElem() throws GTekuciElem {
		if(!imaTekuci()) throw new GTekuciElem();
		try {
			return grupa.dohvati(tek);
		}catch(GIndeks g) {return null;}
	}

	@Override
	public void sledeciElem() throws GTekuciElem {
		if(!imaTekuci()) throw new GTekuciElem();
		tek++;
	}

	@Override
	public boolean imaTekuci() {
		return tek >= 0 && tek < grupa.brObjekata();
	}
}
