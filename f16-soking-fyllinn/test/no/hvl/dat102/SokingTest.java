package no.hvl.dat102;

import org.junit.jupiter.api.BeforeAll;

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
