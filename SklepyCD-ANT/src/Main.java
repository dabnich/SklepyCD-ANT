import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		List<CD> SpisCD = new ArrayList<CD>();
		
		Lista a = new Lista();
		
		
		
		a.usunWszystkieCD(SpisCD);
		
		a.dodajCD("Pulse", "Pink Floyd", 1991, StyleWybor.Rock, 55, SpisCD);
		a.dodajCD("Call Me Irresponsible", "Michael Bubble", 2007, StyleWybor.Jazz, 33, SpisCD);
		a.dodajCD("A Momentary Lapse of Reason", "Pink Floyd", 1987, StyleWybor.Rock, 35, SpisCD);
		a.dodajCD("The Black Album", "Jay-Z", 2003, StyleWybor.Rap, 50, SpisCD);
		a.dodajCD("Island in the Sea", "Willie Nelson", 1987, StyleWybor.Country, 20, SpisCD);
		a.dodajCD("Once Upon a Time in America", "Enno Morricone", 1984, StyleWybor.Soundtrack, 20, SpisCD);
		a.dodajCD("Saban", "Šaban Bajramovic", 2006, StyleWybor.Etniczna, 30, SpisCD);
		

		a.wyswietlWszystkieCD(SpisCD);
		/*a.wyswietlCDpoStylach(SpisCD, StyleWybor.Rap);*/
		
		
		
		
		

		
		
		
		

		

	
		

	}


}


	

