package itbootcamp.domaci;
import java.util.Arrays;
public class Klub {
	
	private String nazivKluba;
	private String sedisteKluba;
	private int godOsnivanja;
	private Sportista1 sportista[];
	private int pozicijaClana;
	
	public Klub (String nazivKluba, String sedisteKluba,int godOsnivanja,Sportista1 sportista[]) {
		this.nazivKluba=nazivKluba;
		this.sedisteKluba=sedisteKluba;
		this.godOsnivanja=godOsnivanja;
		this.sportista=sportista;
		
	}
	
	public Klub() {
		sportista=new Sportista1[10];
	}
	public void dodajSportistu (Sportista1 s) {
		sportista[pozicijaClana]=s;
		pozicijaClana++;
	}
	public Sportista1 getSportista1 (Sportista1 s) {
		
		
			while (pozicijaClana<10) {
				pozicijaClana++;
			}
			
				return s;
		}
	
	
	public String getNazivKluba() {
		return nazivKluba;
	}
		
	public void setNazivKluba(String nazivKluba) {
		this.nazivKluba = nazivKluba;
	}

	public String getSedisteKluba() {
		return sedisteKluba;
	}
	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	
	
	
	
	

}
