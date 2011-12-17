import java.util.*;



public class Lista {

	
	public void dodajCD(String tytul, String wykonawca, int rok, StyleWybor styl, int cena, List<CD> a){
		a.add(new CD(tytul, wykonawca, rok, styl, cena));
	}
	
	public void usunWszystkieCD(List<CD> a){
		a.clear();
	}
	
	public void usunWybranyCD(CD cd, List<CD> a){
		a.remove(cd);
	}
	
	public void wyswietlWszystkieCD(List<CD> Lista) {           
		/*logger.info("Lista wszystkich aut w komisie");*/      
		for (CD cd : Lista){
			cd.wyswietlCD();
		}
	}
	
	public void wyswietlCDpoID(List<CD> Lista, int a) {           
		int i=0;
		/*logger.info("Lista wszystkich aut w komisie");*/      
		for (@SuppressWarnings("unused") CD cd : Lista){
			if(i==a){
				cd.wyswietlCD();
			}
			i++;
		}
	}
	
	public void wyswietlCDpoStylach(List<CD> Lista, StyleWybor styl) {           
		
		/*logger.info("Lista wszystkich aut w komisie");*/      
		for (@SuppressWarnings("unused") CD cd : Lista){
			if(styl==cd.pobierzStyl()){
				cd.wyswietlCD();
			}
		}
	}
	
	
	/*
	public void usunCDpoTytule(List<CD> a, String tytul){
		int b=0;
		for(CD cd : a){
			if(tytul==cd.pobierzTytul()){
				a.remove(b);
			}else b++;	
		}
	}
	*/

	
	
	


	
	
	
	
	
	
}
