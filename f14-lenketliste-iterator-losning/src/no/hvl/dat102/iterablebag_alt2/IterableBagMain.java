package no.hvl.dat102.iterablebag_alt2;

public class IterableBagMain {
	
	public static void main(String[] args) {
		
//		IterableBagADT<String> bag = new IterableTabellBag<>();
		IterableBagADT<String> bag = new IterableLenketBag<>();
		
		bag.add("Per");
		bag.add("Pål");
		bag.add("Espen");
		
		for (String navn : bag) {
			System.out.println(navn);
		}
	}

}
