package dat102.f08.sortering;

public class SorterTabell {
	/**
	 * Sorter dei første n elmenta i tabellen i ikkje stigande ordning (det betyr
	 * stigande ordning om der ikkje er like element).
	 * 
	 * @param <T> Datatype på element som skal sorterast. Må vere ein referansetype
	 * @param a   Tabell som skal sorterast
	 * @param n   Angir kor mange (frå starten) element som skal sorterast >
	 */
	public static <T extends Comparable<? super T>> void utvalgssortering(T[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			T min = a[i];
			int minIndeks = i;

			for (int j = i + 1; j < n; j++) {
				if(a[j].compareTo(min) < 0) {
					min = a[j];
					minIndeks = j;
				}
			}	
			swap(a, i, minIndeks);
		}
}


	/**
	 * Oftast skal heile tabellen sorterast slik vi overlastar denne metoden slik at
	 * dei som brukar den slepp skrive antal (a.length)
	 * 
	 * @param <T>
	 * @param a
	 */
	public static <T extends Comparable<? super T>> void utvalgssortering(T[] a) {
		utvalgssortering(a, a.length);
	}

	public static void swap(Object[] a, int i, int j) {
		Object temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static <T extends Comparable<? super T>> void sorterVedInnsetting(T[] a) {
		sorterVedInnsetting(a, 0, a.length - 1);
	}

    // fra og med forste, til og med siste 
	public static <T extends Comparable<? super T>> void sorterVedInnsetting(T[] a, int forste, int siste) {
		for(int i = forste + 1; i <= siste; i++) {
			T temp = a[i];
			int fra = i - 1; 

			//finn rett plass
			while (fra >= forste && temp.compareTo(a[fra]) < 0){
				a[fra + 1] = a[fra];
				fra--;
			}

			a[fra + 1] = temp;
		}
	}
}

