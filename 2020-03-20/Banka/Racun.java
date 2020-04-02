package Banka;

public class Racun {

	  private String brRacuna;
		  private double stanje;
		  public String dohvatiBrRacuna () {
		  return brRacuna;
		  }
	  
		  public double dohvatiStanje() {
			  return stanje;
		  }
		  
		  public boolean  uplati (double iznos) {
			  
			  if (iznos > 0) {
				  stanje += iznos;
			  }else { 
						  
				  System.out.println("Doslo je do greske...");
			
			  }
			return true;
			
			
		  }
		  
		
         public double podigni(double iznos) {
        	 if (iznos > 0 && iznos <= stanje) 
        		 stanje -= iznos;
        	 else 
        		 System.out.println("Greska...");
        	 
        	 return stanje;
		  
         }
		  
}
