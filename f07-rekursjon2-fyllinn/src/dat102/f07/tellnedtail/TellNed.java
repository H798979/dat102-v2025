package dat102.f07.tellnedtail;

public class TellNed {

	public static void main(String[] args) {
		tellNed(5);
		tellNedTail(5);
	}
	
	public static void tellNed(int i) {
		if (i >= 1) {
			System.out.print(" " + i);
			tellNed(i-1);
		}
	}

	public static void tellNedTail(int i) {
		//TODO
	}
}
