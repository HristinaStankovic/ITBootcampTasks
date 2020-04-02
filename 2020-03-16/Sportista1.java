package itbootcamp.domaci;

public class Sportista1 {
	
	private String ime;
	String prezime;
	private int godRodjenja;
	
	Sportista1 (String i,String p,int gr){
		ime=i;
		prezime=p;
		godRodjenja=gr;
		
	}


	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public int getGodRodjenja() {
		return godRodjenja;
	}


	@Override
	public String toString() {
		return  ime + "_" + prezime + ":" + godRodjenja;
	}

	
	
	
       

}
