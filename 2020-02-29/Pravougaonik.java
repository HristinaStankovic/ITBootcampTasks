package itbootcamp.domaci;

import java.util.Scanner;

public class Pravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Unesite broj redova: ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		
		System.out.println("Unesite broj kolona: ");
		Scanner sc2 = new Scanner(System.in);
		int n= sc2.nextInt();
		
		for (int i=0; i < m; i++) {
			for (int j=0; j < n; j++) {
				System.out.print("*   ");
			}
			System.out.println("");
	}

}
}