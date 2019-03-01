package fakultet;

import greske.GTekuciElem;

public interface Obilazak {
	
	void naPrviElem();
	
	Object tekuciElem() throws GTekuciElem;
	
	void sledeciElem() throws GTekuciElem;
	
	boolean imaTekuci();

}
