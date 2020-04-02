package itbootcamp.domaci;

public class Sah {

	public int pozicijaPiona;
	public int pozicijaSkakaca;
	public boolean skakacNapadnut;
	public boolean skakacNijeNapadnut;
	//public int kolona[]= new int[7];
	//public int red[]= new int [7];
	
	public Sah(int pp, int ps, boolean sn,boolean snn) {
	pozicijaPiona=pp;
	pozicijaSkakaca=ps;
	skakacNapadnut=sn;
	skakacNijeNapadnut=snn;
	
	
	
}
	public int getpozicijaPiona() {
		
		return pozicijaPiona;
	}
	public void setPozicijaPiona(int pp) {
		if (pozicijaPiona>=11 && pozicijaPiona <= 88) {
			System.out.println("Unos polozaja piona je korektan.");
			
		}else 
			System.out.println("Unos pozicije nije korektan.");
		
		pozicijaPiona=pp;
	}
	public int getpozicijaSkakaca() {
		
		return pozicijaSkakaca;
	}
	public void setpozicijaSkakaca(int ps) {
		if (pozicijaSkakaca>=11 && pozicijaSkakaca <= 88) {
			System.out.println("Unos polozaja skakaca je korektan.");
		}else 
			System.out.println("Unos pozicije nije korektan.");
		pozicijaSkakaca=ps;
		
}
	public boolean getskakacNapadnut() {
		if (pozicijaPiona==64 && pozicijaSkakaca ==55) {
			System.out.println("Skakac je napadnut");
		}
		
		if (pozicijaPiona==22 && pozicijaSkakaca==11) 
			System.out.println("Skakac je napadnut.");
		//else System.out.println("Skakac nije napadnut.");
		
		return true;
		}
		
	
	   public boolean getskakacNijeNapadnut() {
		   if (pozicijaPiona==64 && pozicijaSkakaca==74) 
			   System.out.println("Skakac nije napadnut.");
		   
		return true;
	   }
	   
	  
	
	
	
	
	
	
	
	
}
	
	
	
	
	
