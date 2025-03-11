package no.hvl.dat102.immutable_person;

/*
 * Demonstrerer ikke-mutérbarhet (en. immutability) ...
 * 
 * Creating an Immutable Class in Java:
 * 	1 - Make all of the fields private so that direct access is not allowed.
 * 	2 - Don't provide setter methods for variables.
 * 	3 - Make all mutable fields final so that a field's value can be assigned only once.
 * 	4 - Declare the class as final so it can't be extended.
 * 
 * Både boken og artikler på nettet sier dette, men selv med private final Navn navn
 * kan man gjøre navn.setEtternavn("...");
 * 
 * En annen artikkel sier i tillegg:
 *  5 - Deep Copy of objects should be performed in the getter methods to return a 
 *    copy rather than returning the actual object reference.
 *  6 - A parameterized constructor should initialize all the fields performing a 
 *    deep copy so that data members can’t be modified with an object reference.
 *    
 * Vi har altså 6 ting som må gjøres for å gjøre et objekt immutable.
 * 
 */
public class PersonerMain {
	
	public static void main(String[] args) {
		
		Navn atlePatle = new Navn("Atle", "Patle");
		Navn perViskeler = new Navn("Per", "Viskeler");
		Navn madamFelle = new Navn("Madam", "Felle");
		
		/*
		 * I dette eksemplet ser vi hvilke skritt som må gjøres hvis vi 
		 * ønsker at Person-objekter skal være ikke-muterbare.
		 */
		System.out.println("Lar seg mutere:");
		
		// Vårt utgangspunkt. En muterbar Person (med et muterbart Navn).
		Person0 p0 = new Person0(atlePatle, 2000);
		p0.navn = perViskeler;
		p0.fodselsaar = 1980;
		System.out.println(p0);
		
		// Problem: Enkelt å mutere p0 siden objektvariabler er public
		// Fiks1  : Gjøre objektvariabler private
		
		
//		Person1 p1 = new Person1(atlePatle, 2000);
//		p1.setNavn(perViskeler);
//		p1.setFodselsaar(1990);
//		System.out.println(p1);
		
		// Problem: Enkelt å mutere p1 siden vi har set-metoder
		// Fiks2  : Fjerne set-metoder
		// Fiks3+4: Merker også objektvariabler og klassen med final
		//          for å hindre utilsiktet mutering internt i koden.
		
		
//		Person4 p4 = new Person4(atlePatle, 2000);
//		Navn p4SittNavn = p4.getNavn();
//		p4SittNavn.setEtternavn("MutertPatle");
//		System.out.println(p4);
		
		// Problem: Navn er muterbart, så p4.getNavn() gir mulighet til å endre innhold i navn
		// Fiks   : Returnere en kopi/klone (alternativt gjøre Navn ikke-muterbar)

		
//		Person5 p5 = new Person5(perViskeler, 2000);
//		perViskeler.setEtternavn("MutertViskeler");
//		System.out.println(p5);
		
		// Problem: Navn er muterbart, så navn-parameteren til new Person5(..) kan endres etterpå. 
		// Fiks   : GKonstruere med en kopi/klone (alternativt gjøre Navn ikke-muterbar)
		
		System.out.println("Ikke muterbar:");
		
//		Person6 p6 = new Person6(madamFelle, 2000);
//		madamFelle.setFornavn("MutertMadam");
//		System.out.println(p6);
	}

}
