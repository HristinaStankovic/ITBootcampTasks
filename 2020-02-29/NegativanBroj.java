package itbootcamp.domaci;

import java.util.Scanner;

public class NegativanBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Double broj;
		Double zbir = 0d;
		do {
			System.out.print("Unesite broj veci od nule ili negativni broj za reultat: ");
			while (!sc.hasNextDouble()) {
				System.out.print("To nije realni broj, pokusajte ponovo: ");
				sc.next();
			}
			broj = sc.nextDouble();
			zbir = zbir + broj;
		} while (broj >= 0);
		
		/* u zbir u petlji ce uci i poslednji negativni broj 
		koji prekida ciklus, zbog toga ide sledeca naredba */
		zbir = zbir - broj;		
		
		System.out.print("Zbir = " + zbir);
	
	}

	}


