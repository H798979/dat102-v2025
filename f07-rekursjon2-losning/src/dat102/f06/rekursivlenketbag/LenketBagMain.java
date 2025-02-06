package dat102.f06.rekursivlenketbag;

public class LenketBagMain {
	
	public static void main(String[] args) {
		
		BagADT<String> fruktBag;
		
		fruktBag = new LenketBagRekursiv<>();
		
		fruktBag.add("eple");
		fruktBag.add("eple");
		fruktBag.add("banan");
	}

}
