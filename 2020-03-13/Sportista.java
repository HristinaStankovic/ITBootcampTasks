package itbootcamp.domaci;

public class Sportista {

	  private String imePrezime;
	  private String sport;
	  public String klub;
	  public int brojNaDresu;
	  
	  public Sportista (String ip,String s, String k, int b) {
	  
	  imePrezime = ip;
	  sport = s;
	  klub = k;
	  brojNaDresu = b;
	  }
	  
	  
	  public String getImePrezime() {
	  return imePrezime;
}
	 
	  public String getSport() {
		  return sport;
	  }
	  
	  
	  public String getKlub() {
		  return klub;
	  }
	 public void setKlub(String k) {
		 klub=k;
	 }
	  public int getbrojNaDresu() {
		 return brojNaDresu;
	  }
	  public boolean setbrojNaDresu(int b) {
		  if (brojNaDresu < 0) {
			  System.out.println("Nevalidan unos broja.");
			  return false;
		 
	  }else { 
		  int brojNaDresu = b;
	  }
		  return true;
}
}