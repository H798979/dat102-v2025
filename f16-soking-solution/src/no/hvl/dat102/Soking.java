package no.hvl.dat102;

/*
 * En samling av ulike søkemetoder for søk i tabell og nodelenke
 * 
 * 	- sokUsortertTabell
 * 	- sokUsortertLenke
 * 
 * 	- sekvensieltSokSortertTabell
 * 	- sekvensieltSokSortertLenke
 * 
 * 	- binaertSokRekursiv (i sortert tabell)
 * 	- binaertSokIterativ (i sortert tabell)
 * 
 */
public class Soking<T> {

	/*
	 * Søk i usortert tabell - Sekvensielt søk
	 */
	public static <T> boolean sokUsortertTabell(T[] tabell, T element) {
		
		for (T tabEl : tabell) {
			if (tabEl.equals(element)) {
				return true;
			}
		}
		return false;
	}
	
	/* 
	 * Søk i usortert lenke/kjede - Sekvensielt søk
	 */
	public static <T> boolean sokUsortertLenke(Node<T> start, T element) {
		
		Node<T> p = start;
		while (p != null) {
			if (p.data.equals(element)) {
				return true;
			}
			p = p.neste;
		}
		return false;
	}
	
	/*
	 * Søk i sortert tabell - Sekvensielt søk
	 */
	public static <T extends Comparable<T>> 
			boolean sekvensieltSokSortertTabell(T[] tabell, T element) {
		
		int i=0;
		while (!(i >= tabell.length || tabell[i].compareTo(element) >= 0)) {
//		while (  i <  tabell.length && tabell[i].compareTo(element) <  0 ) {
			i++;
		}
		if (i == tabell.length) {
			return false;
		} else {
			return element.equals(tabell[i]);
		}
	}

	/*
	 * Søk i sortert lenke/kjede - Sekvensielt søk
	 */
	public static <T extends Comparable<T>> 
			boolean sekvensieltSokSortertLenke(Node<T> start, T element) {

		Node<T> p = start;
		while (p != null && element.compareTo(p.data) > 0) {
			p = p.neste;
		}

		if (p == null) {
			return false;
		} else {
			return element.equals(p.data);
		}
	}

	/* ---------------------------------------------------------------- */
	
	/* 
	 * Binært søk i sortert tabell - Rekursiv
	 * Vist i boken.
	 */
	public static <T extends Comparable<T>> boolean binaertSokRekursiv(
			T[] tabell, T element) {
		return binaertSokRekursiv(tabell, element, 0, tabell.length - 1);
	}

	private static <T extends Comparable<T>> boolean binaertSokRekursiv(
			T[] tabell, T element, int venstre, int hoyre) {
		
		int midten = (venstre + hoyre) / 2;
		
		if (venstre > hoyre) {
			return false;
		}
		if (element.compareTo(tabell[midten]) == 0) {
			return true;
		}
		if (element.compareTo(tabell[midten]) < 0) {
			return binaertSokRekursiv(tabell, element, venstre, midten-1);
		} else {
			return binaertSokRekursiv(tabell, element, midten+1, hoyre);
		}
		
		
	}
	
	/* ---------------------------------------------------------------- */
	
	/* 
	 * Binært søk i sortert tabell - Iterativ
	 * Ikke vist i boken, men gitt som Exercise 6.
	 */
	public static <T extends Comparable<T>> boolean binaertSokIterativ(
			T[] tabell, T element) {
		
		int venstre = 0;
		int hoyre = tabell.length - 1;
		
		while (venstre <= hoyre) {
			
			int midtpunkt = (venstre + hoyre)/2;
			int resultat = element.compareTo(tabell[midtpunkt]);
			
			if (resultat == 0) {
				return true;
				
			} else if (resultat < 0) {
				hoyre = midtpunkt - 1;
				
			} else {
				venstre = midtpunkt + 1;
			}
		}
		return false;
	}
	
	/* ---------------------------------------------------------------- */
	
}
