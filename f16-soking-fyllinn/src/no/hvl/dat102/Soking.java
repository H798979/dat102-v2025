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
		//TODO
		return false;
	}
	
	/* 
	 * Søk i usortert lenke/kjede - Sekvensielt søk
	 */
	public static <T> boolean sokUsortertLenke(Node<T> start, T element) {
		//TODO
		return false;
	}
	
	/*
	 * Søk i sortert tabell - Sekvensielt søk
	 */
	public static <T extends Comparable<T>> 
			boolean sekvensieltSokSortertTabell(T[] tabell, T element) {
		//TODO
		return false;
	}

	/*
	 * Søk i sortert lenke/kjede - Sekvensielt søk
	 */
	public static <T extends Comparable<T>> 
			boolean sekvensieltSokSortertLenke(Node<T> start, T element) {
		//TODO
		return false;
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
		
		//TODO
		return false;
	}
	
	/* ---------------------------------------------------------------- */
	
	/* 
	 * Binært søk i sortert tabell - Iterativ
	 * Ikke vist i boken, men gitt som Exercise 6.
	 */
	public static <T extends Comparable<T>> boolean binaertSokIterativ(
			T[] tabell, T element) {
		
//		int venstre = 0;
//		int hoyre = tabell.length - 1;
		
		//TODO
		return false;
	}
	
	/* ---------------------------------------------------------------- */
	
}
