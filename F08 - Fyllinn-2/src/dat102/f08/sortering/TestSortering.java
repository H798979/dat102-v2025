package dat102.f08.sortering;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSortering {
	private Integer[] a;
	private Integer[] b;
	private Integer[] c;
	private Integer[] fasitABC = {0, 1, 2, 4, 5, 7, 8}; 
	
	@BeforeEach
	void setUp() throws Exception {
		a = new Integer[]{5, 0, 7, 1, 4, 2, 8};
		b = new Integer[]{0, 5, 8, 1, 4, 2, 7};
		c = new Integer[]{5, 7, 8, 1, 4, 2, 0};
	}

	@Test
	void testSorterVedInnsetting() {
		SorterTabell.sorterVedInnsetting(a);
		assertTrue(erSortert(a));
		
		SorterTabell.sorterVedInnsetting(b);
		assertTrue(erSortert(b));
		
		SorterTabell.sorterVedInnsetting(c);
		// assertTrue(erSortert(c));
		assertArrayEquals(fasitABC, c);
	}

//	@Test
//	void tesModifisert() {
	
//		SorterTabell.modifisertSorterVedInnsetting(a); 
//		assertTrue(erSortert(a));
//		
//		SorterTabell.modifisertSorterVedInnsetting(b);
//		assertTrue(erSortert(b));
//		
//		SorterTabell.modifisertSorterVedInnsetting(c);
//		assertArrayEquals(fasitABC, c);
//	}
	
	@Test
	void testUtvalgssortering() {
		SorterTabell.utvalgssortering(a);
		assertTrue(erSortert(a));
		
		SorterTabell.utvalgssortering(b);
		assertTrue(erSortert(b));
		
		SorterTabell.utvalgssortering(c);
		// assertTrue(erSortert(c));
		assertArrayEquals(fasitABC, c);
	}
	
	private boolean erSortert(Integer[] tab) {
		for (int i = 0; i < tab.length - 1; i++) {
			if (tab[i].compareTo(tab[i + 1]) > 0) {
				return false;
			}
		}
		
		return true;
	}
}