package domaci_7;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi br: ");
		int br = sc.nextInt();
		System.out.println("Unesi n za duzinu niza:");
		int n = sc.nextInt();
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element " + i);
			niz[i] = sc.nextInt();
		}
		System.out.println("Clanovi niza deljivi sa " + br + " su:");
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0)
				System.out.println(niz[i]);
		}
	}

}
