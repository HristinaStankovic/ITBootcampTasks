package domaci_7;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n = sc.nextInt();
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element " + i);
			niz[i] = sc.nextInt();
		}
		boolean a=true;
		for (int i = 0; i < niz.length - 1; i++) {
			if (niz[i] > niz[i + 1]) {
				System.out.println("Niz nije rastuci");
				a=false;
				break;
			} 
			

		}
		if(a!=false)
			System.out.println("Niz je rastuci");

		

	}

}
