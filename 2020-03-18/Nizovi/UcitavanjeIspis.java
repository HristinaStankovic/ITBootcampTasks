package Nizovi;

import java.util.Scanner;

public class UcitavanjeIspis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       int [] brojevi = new int [10];
      //System.out.println(brojevi[3]);
       
       for(int i=0; i<brojevi.length; i++) {
    	   System.out.print("Unesi brojeve: ");
           brojevi[i]= sc.nextInt();
	       //System.out.println(brojevi[i]);
       /*    
	}    int suma=0;
	     int proizvod=0;
        for (int i=0; i<10; i++) {
        	suma+=brojevi[i];
        	proizvod *=brojevi[i];
        	
        	//System.out.print(brojevi[i]+ " , ");
        	
}             System.out.println(suma);
              
             System.out.println(proizvod);*/
}
}
}