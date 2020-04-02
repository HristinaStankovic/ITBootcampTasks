package itbootcamp.domaci;

import java.util.Scanner;

public class Zadatak1Nizovi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Koliko elemenata niza zelite?");
		 int n=sc.nextInt();
		 System.out.println("Kojim brojem da budu deljivi?");
		 int  broj=sc.nextInt(); 
		 int [] brojevi= new int [n];
		 int i;
		 for( i=0;i<n;i++) {
			 System.out.println("unesi broj");
			 brojevi[i]=sc.nextInt(); } 
		 for ( i=0; i<n;i++) { 
			 if (brojevi[i]%broj==0) {
				 System.out.print( brojevi[i]+ ", ");
				 
			 
			 
			 } }
         
		
	

}      
     
	
    
}

