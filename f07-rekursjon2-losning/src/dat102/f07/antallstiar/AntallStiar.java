package dat102.f07.antallstiar;

public class AntallStiar {
	
	public static void main(String[] args) {
		
		/* Antal stier fra (1,1) til (3,3) hvis man kun kan gå til høyre eller ned
		 *          
		 * Stier:   ●●●   ●●    ●●    ●     ●     ● 
		 *            ●    ●●    ●    ●●●   ●●    ●
		 *            ●     ●    ●●     ●    ●●   ●●● 
		 *            
		 * Altså 6 stier           
		 */
		System.out.println("Antall stiar: " + antallStiar(1, 1, 3, 3));   
	}
	
	static int antallStiar(int startX, int startY, int sluttX, int sluttY) {
		
		//Basistilfelle
		if (startX == sluttX || startY == sluttY) {
			return 1;
		}
		
		//Ellers
		//Kan gå til høyre eller ned.
		//Antall stier = # hvis høyre + # hvis ned
		return antallStiar(startX+1, startY, sluttX, sluttY)
				+ antallStiar(startX, startY+1, sluttX, sluttY);
		
	}


}




