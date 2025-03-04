package no.hvl.dat102.javalist2liste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.listeadt.ListeADT;

public class List2ListeAdapterTest {
	
	ListeADT<String> tomListe;
	ListeADT<String> listeMedPerOgPaal;
	
	@BeforeEach
	void oppsett() {
		tomListe = new List2ListeAdapter<>();
		listeMedPerOgPaal = new List2ListeAdapter<>();
		listeMedPerOgPaal.add("Per");
		listeMedPerOgPaal.add("Pål");
	}
	
	/*
	 * Metoder: getEntry(pos), contains(e), getLength(), isEmpty(),
	 *          add(e), add(pos, e), remove(pos), replace(pos, e),
	 *          clear(), 
	 */
	
	@Test
	void egenskaperTomListe() {
		assertTrue(tomListe.isEmpty());
		assertEquals(0, tomListe.getLength());
		assertFalse(tomListe.contains("Per"));
	}

	@Test
	void egenskaperIkkeTomListe() {
		assertFalse(listeMedPerOgPaal.isEmpty());
		assertEquals(2, listeMedPerOgPaal.getLength());
		assertTrue(listeMedPerOgPaal.contains("Per"));
	}
	
	@Test
	void indeksgrenserTomListe() {
		assertThrows(IndexOutOfBoundsException.class, () -> tomListe.getEntry(0));
		assertThrows(IndexOutOfBoundsException.class, () -> tomListe.getEntry(1));
	}

	@Test
	void indeksgrenserIkkeTomListe() {
		assertThrows(IndexOutOfBoundsException.class, () -> listeMedPerOgPaal.getEntry(0));
		assertEquals("Per", listeMedPerOgPaal.getEntry(1));
		assertEquals("Pål", listeMedPerOgPaal.getEntry(2));
		assertThrows(IndexOutOfBoundsException.class, () -> listeMedPerOgPaal.getEntry(3));
	}
	
	@Test
	void leggeInnPaaPosisjon0() {
		assertThrows(IndexOutOfBoundsException.class, () -> tomListe.add(0, "A"));
		assertThrows(IndexOutOfBoundsException.class, () -> listeMedPerOgPaal.add(0, "A"));
	}
	
	@Test
	void leggeInnPaaPosisjonNpluss2() {
		assertThrows(IndexOutOfBoundsException.class, () -> tomListe.add(2, "A"));
		assertThrows(IndexOutOfBoundsException.class, () -> listeMedPerOgPaal.add(4, "A"));
	}
	
	@Test
	void leggeInnPaaLovligPosisjon() {
		
		tomListe.add(1, "A"); // n=0. Eneste lovlige posisjon er 1
		tomListe.add(2, "B"); // n=1. Lovlige posisjoner er 1 og 2
		assertEquals("A", tomListe.getEntry(1));
		assertEquals("B", tomListe.getEntry(2));
		
		listeMedPerOgPaal.add(1, "C"); // n=2. Lovlige posisjoner er 1, 2 og 3
		listeMedPerOgPaal.add(2, "D"); // n=3. Lovlige posisjoner er 1, 2, 3 og 4
		listeMedPerOgPaal.add(5, "E"); // n=4. Lovlige posisjoner er 1, 2, 3, 4 og 5
		assertEquals("C", listeMedPerOgPaal.getEntry(1));
		assertEquals("D", listeMedPerOgPaal.getEntry(2));
		assertEquals("Per", listeMedPerOgPaal.getEntry(3));
		assertEquals("Pål", listeMedPerOgPaal.getEntry(4));
		assertEquals("E", listeMedPerOgPaal.getEntry(5));
	}
	
	@Test
	void testeRemove() {
		
	}
	
	@Test
	void testeReplace() {
		
	}
}
