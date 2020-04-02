package itbootcamp.domaci;

import java.util.Scanner;

public class FibonacijevNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unesite broj clanova Fibonacijevog niza: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int pomoc = 0; 	
		int clan = 1;	
	    
        for (int i = 1; i <= n; i++) 
        { 
            System.out.print(clan + " "); 
            int sledeci_clan = pomoc + clan; 
            pomoc = clan; 
            clan = sledeci_clan;
        }
	}


	}


