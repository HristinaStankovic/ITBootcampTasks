package itbootcamp.domaci;

import java.util.Scanner;

public class Lift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  int mLifta = 680;
		  System.out.println("Unesite masu tereta koji se nalazi unutar lifta.");
		  int nosivostLifta = sc.nextInt();
		  
		
		if (mLifta<nosivostLifta) {
				 System.out.println("Lift ne moze biti pokrenut.");
				 nosivostLifta = sc.nextInt();
		 }
		  
	  if (mLifta == nosivostLifta) {
		System.out.println("Lift je pokrenut,ali se otezano krece.");
		
	} if (mLifta > nosivostLifta ) {
		System.out.println("Lift se krece bez problema.");
	} if (nosivostLifta == 0) {
		System.out.println("Lift se otkacio sa sajle i pada!");
		
		
		
	}
		

}
}