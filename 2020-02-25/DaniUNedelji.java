package itbootcamp.vezbe;

import java.util.Scanner;

public class DaniUNedelji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String dani = sc.next();
		
		switch (dani) {
		case "Ponedeljak":
			System.out.println("1");
			break;
		case "Utorak": 
			System.out.println("2");
			break;
		case "Sreda" :
			System.out.println("3");
			break;
		case "Cetvrtak" :
			System.out.println("4");
			break;
		case "Petak" :
			System.out.println("5");
			break;
		case "Subota" :
			System.out.println("6");
			break;
		case "Nedelja" :
			System.out.println("7");
			
		}
			
			
		
	}

}
