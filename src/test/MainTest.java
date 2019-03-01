package test;

import fakultet.*;

public class MainTest {

	public static void main(String[] args) {
		Fakultet n = new Fakultet();
		try {
			 n.dodaj(new Osoba("Natalija", 30))
			  .dodaj(new Student("Emilija", 19))
			  .dodaj(new Student("Goran", 28))
			  .dodaj(new Osoba("Milena", 22))
			  .dodaj(new Nastavnik("Zoran", 45));
			  
			 Neuredjen ne = new Neuredjen(n);
			 for(ne.naPrviElem(); ne.imaTekuci(); ne.sledeciElem())
			      System.out.println(ne.tekuciElem());
		}catch(Exception g) {System.out.println(g);}
	}
}
