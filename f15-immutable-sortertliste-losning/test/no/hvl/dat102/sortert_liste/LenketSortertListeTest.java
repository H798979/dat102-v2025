package no.hvl.dat102.sortert_liste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LenketSortertListeTest {
	
	@Test
	void testeLittegrann() {
		
		SortertListeADT<Integer> liste = new LenketSortertListe<>();
		
		liste.add(5);
		liste.add(3);
		liste.add(6);
		liste.add(4);
		liste.add(1);
		liste.add(2);
		
		System.out.println(Arrays.toString(liste.toArray()));
		
		assertEquals(6, liste.getLength());
		
		for (int i=1; i <= liste.getLength(); i++) {
			assertEquals(i, liste.getEntry(i));
		}
	}

}
