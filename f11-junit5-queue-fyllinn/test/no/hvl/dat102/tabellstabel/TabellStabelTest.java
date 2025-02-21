package no.hvl.dat102.tabellstabel;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TabellStabelTest {
	
	private StabelADT<String> stabel0; //Tenker at denne er en tom stabel
	private StabelADT<String> stabel1; //Tenker at denne er en stabel med ett element
	private StabelADT<String> stabel2; //Tenker at denne er en stabel med to elementer

	@BeforeEach
	void nullstill() {
		stabel0 = new TabellStabel<String>();

        stabel1 = new TabellStabel<String>();
        stabel1.push("eple");

        stabel2 = new TabellStabel<String>();
        stabel2.push("potet");
        stabel2.push("gulrot");
	}
	
	/*
	 * Ting å teste (vi har konstruktør, isEmpty, push, peek, pop, clear):
	 * 
	 * - En ny stabel skal være tom
	 * - En stabel med ett eller to element(er) skal ikke være tom
	 * - push skal legge elementet på toppen av stabelen
	 * - peek på en tom stabel skal gi EmptyStackException
	 * - peek på en ikke-tom stabel skal returnere topp-elementet (siste push)
	 * - peek på en ikke-tom stabel skal ikke endre på stabelens innhold
	 * - pop på en tom stabel skal gi EmptyStackException
	 * - pop på en ikke-tom stabel skal fjerne og returnere topp-elementet
	 * - clear skal tømme stabelen
	 */
	
	@Test
	void enNyStabelSkalVaereTom() {
		assertNull(stabel0.peek());
		assertTrue(stabel0.isEmpty());
	}
	
	@Test
	void enStabelMedEttEllerFlereElementerSkalIkkeVaereTom() {
		assertFalse(stabel1.isEmpty());
		assertFalse(stabel2.isEmpty());

	}
	
	@Test
	void pushSkalLeggeElementetPaaToppenAvStabelen() {
		stabel1.push("banana");
		assertEquals("banana", stabel1.peek());
		assertEquals("eple", stabel2.peek());

		stabel0.push("banana");
		assertEquals("gulrot", stabel0.peek());

	}
	
	@Test
	void peekPaaTomStabelSkalGiEmptyStackException() {
		assertThrows(EmptyStackException.class, () -> stabel0.peek());
	}
	
	@Test
	void peekPaaIkkeTomStabelSkalReturnereToppelementet() {
		assertEquals("eple", stabel1.peek());
		assertEquals("eple", stabel1.peek());
		


	}
	
	@Test
	void peekPaaIkkeTomStabelSkalIkkeEndreStabelensInnhold() {
		//TODO
	}
	
	@Test
	void popPaaTomStabelSkalGiEmptyStackException() {
		//TODO
	}
	
	@Test
	void popPaaIkkeTomStabelSkalFjerneOgReturnereToppelementet() {
		//TODO
	}
	
	@Test
	void clearSkalTommeStabelen() {
		//TODO
	}
}
