package itbootcamp.vezbe;

import java.util.Scanner;

public class SwitchPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		switch (x) {
		case 2:
		case 3:
		case 4:
			System.out.println("A");
			break;
		case 5: 
			System.out.println("B");
			break;
		default :
			System.out.println("Suprotno");
			break;
			
		case 0:
			System.out.println("C");
		
	}
//Ispisivanje dana u nedelji,mesece u godini,prestupna gpdina za februar.
}
}