import java.util.*;

public class Radiostacje {
	
	String nazwa;
	List<CD> CDs = new ArrayList<CD>();

	public Radiostacje(String nazwa, List<CD> a){
		this.nazwa = nazwa;
		this.CDs = a;
	}

}
