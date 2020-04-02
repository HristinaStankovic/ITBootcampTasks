package domaci_7;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n = sc.nextInt();
		int privremena;
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesi element " + i);
			niz[i] = sc.nextInt();
		}
		System.out.println("Niz unesen");
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		System.out.println("Obrnuti niz je: ");
		for (int i = 0; i < niz.length / 2; i++) {
			privremena = niz[i];
			niz[i] = niz[niz.length - 1 - i];
			niz[niz.length - 1 - i] = privremena;

		}
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i]);
		}
		boolean a;
		for (int i = 0; i < niz.length / 2; i++) {
			if (niz[i] == niz[niz.length - 1 - i]) {
				a = true;
			}

			else {
				a = false;
				System.out.println("Nije palindrom");

			}
		}
		if (a = true)
			System.out.println("Palindrom je");
	}

}