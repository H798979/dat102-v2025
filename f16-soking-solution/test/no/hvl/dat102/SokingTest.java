package no.hvl.dat102;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class SokingTest {
	
	/* --- Data brukt i testene -------------------------------------- */ 
	
	static Integer[] tomTabell = {};
	static Integer[] usortertTabell = new Integer[] { 2, 8, 0, 4, 6 };
	static Integer[] sortertTabell = new Integer[] { 0, 2, 4, 6, 8 };
	
	static Node<Integer> tomLenke;
	static Node<Integer> usortertLenke;
	static Node<Integer> sortertLenke;

	@BeforeAll
	static void settOppLenkene() throws Exception {
					//  lagLenke() er en hjelpemetode for å lage en lenke (se nederst) 
		usortertLenke = lagLenke(usortertTabell); // Vi kan bruke tabell som input,
		sortertLenke  = lagLenke( 0, 2, 4, 6, 8 );  // eller enkeltverdier ...
	}

	/* --------------------------------------------------------------- */
	
	//TODO Vi må jo skrive tester for å sjekke at det vi lager virker !!
	
	@Test
	void sokUsortertTabellTest() {
		assertTrue(Soking.sokUsortertTabell(usortertTabell, 2));
		assertTrue(Soking.sokUsortertTabell(usortertTabell, 0));
		assertTrue(Soking.sokUsortertTabell(usortertTabell, 6));
		assertFalse(Soking.sokUsortertTabell(usortertTabell, 5));
		assertFalse(Soking.sokUsortertTabell(tomTabell, 1));
	}
	
	@Test
	void sokUsortertLenkeTest() {
		assertTrue(Soking.sokUsortertLenke(usortertLenke, 2));
		assertTrue(Soking.sokUsortertLenke(usortertLenke, 0));
		assertTrue(Soking.sokUsortertLenke(usortertLenke, 6));
		assertFalse(Soking.sokUsortertLenke(usortertLenke, 5));
		assertFalse(Soking.sokUsortertLenke(tomLenke, 1));
	}
	
	@Test
	void sekvensieltSokSortertTabell() {
		assertTrue(Soking.sekvensieltSokSortertTabell(sortertTabell, 0));
		assertTrue(Soking.sekvensieltSokSortertTabell(sortertTabell, 4));
		assertTrue(Soking.sekvensieltSokSortertTabell(sortertTabell, 8));
		assertFalse(Soking.sekvensieltSokSortertTabell(sortertTabell, -1));
		assertFalse(Soking.sekvensieltSokSortertTabell(sortertTabell, 5));
		assertFalse(Soking.sekvensieltSokSortertTabell(sortertTabell, 9));
		assertFalse(Soking.sekvensieltSokSortertTabell(tomTabell, 9));
	}
	
	@Test
	void binaerSokSortertTabell() {
		assertTrue(Soking.binaertSokRekursiv(sortertTabell, 0));
		assertTrue(Soking.binaertSokRekursiv(sortertTabell, 4));
		assertTrue(Soking.binaertSokRekursiv(sortertTabell, 8));
		assertFalse(Soking.binaertSokRekursiv(sortertTabell, -1));
		assertFalse(Soking.binaertSokRekursiv(sortertTabell, 5));
		assertFalse(Soking.binaertSokRekursiv(sortertTabell, 9));
		assertFalse(Soking.binaertSokRekursiv(tomTabell, 9));
	}	
	/* --------------------------------------------------------------- */
	
	/* Hjelpemetode for å lage lenke med verdier.
	 * 
	 * Setter inn først i lenken, og må da gå gjennom input baklengs
	 * for å få de i samme rekkefølge som i input.
	 * Kunne sikkert satt inn bakerst i stedet for enklere løkke.
	 *  
	 * Laget av Lars-Petter 4. mars 2025.
	 */
	static <T> Node<T> lagLenke(
			@SuppressWarnings("unchecked") T ... verdier) {
		
		Node<T> forste = null;
		
		for (int i=verdier.length-1; i>=0; i--) { // Baklengs n-1 .. 0
			
			Node<T> temp = new Node<>(verdier[i]);
			temp.neste = forste;
			forste = temp;
		}
		return forste;
	}
}
