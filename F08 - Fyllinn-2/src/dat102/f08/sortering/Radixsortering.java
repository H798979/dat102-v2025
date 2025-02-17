package dat102.f08.sortering;
import java.util.ArrayList;
import java.util.List;

public class SorterTabell {
	public static int finnSiffer(Integer tall, int vekt) {
		return (tall / vekt) % 10;
	}

	public static int finnStorste(Integer[] data) {
		int maks = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > maks) {
				maks = data[i];
			}
		}

		return maks;
	}

	public static int lengde(int tall) {
		return ("" + tall).length();
	}

	public static void radixSortering(Integer[] data) {
		radixSortering(data, 10);
	}

	public static void radixSortering(Integer[] data, int radix) {

		int n = data.length;
		int maks = finnStorste(data);
		int maksAntallSiffer = lengde(maks);

		List<Integer>[] sifferkoer = new List[radix];

		for (int i = 0; i < radix; i++) {
			sifferkoer[i] = new ArrayList<Integer>();
		}

		int vekt = 1; // starter på enerposisjon
		for (int i = 0; i < maksAntallSiffer; i++) {
			
			// fordeler i køer
			for (int j = 0; j < n; j++) {
				int siffer = finnSiffer(data[j], vekt);
				sifferkoer[siffer].add(data[j]);
			}
			
			// slår sammen køene
			int p = 0;
			for (int k = 0; k < radix; k++) {
				for (Integer e : sifferkoer[k]) {
					data[p] = e;
					p++;
				}
				sifferkoer[k].clear();
			}
			
			vekt *= 10; // flytter til neste siffer
		}
	}
}