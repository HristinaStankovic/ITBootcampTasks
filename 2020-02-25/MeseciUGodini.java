package itbootcamp.vezbe;

import java.util.Scanner;

public class MeseciUGodini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner sc = new Scanner(System.in);
         
        String mesec = sc.next();
        boolean prestup;
          switch (mesec) {
          case "Januar":
          case "Mart":
          case "Maj":
          case "Jul":
          case "Avgust":
          case "Oktobar":
          case "Decembar":
        	  System.out.println("31");
        	  break;
        	  
          case "April":
          case "Jun":
          case "Septembar":
          case "Novembar":
        	  System.out.println("30");
        	  break;
          case "Februar":
        	  System.out.println("Da li je godina presupna true/false?");
        	  prestup = sc.nextBoolean();
        	 if(prestup == true) {
        		 System.out.println(29);
        	 
        	 }else { System.out.println(28);
          
          }
	}
	}
}
