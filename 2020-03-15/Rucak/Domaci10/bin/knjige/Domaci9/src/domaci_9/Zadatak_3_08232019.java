package domaci_9;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ucitati duzinu niza");
		int n = s.nextInt();
		int niz[] = new int[n];
		ucitati(niz);
		System.out.println("Proizvod brojeva na neparnoj poziciji je " + mnozenjenep(niz)
				+ " ,a suma parnih brojeva je " + sabiranjepar(niz));

	}

	public static void ucitati(int[] niz) {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < niz.length; i++) {
			niz[i] = s.nextInt();
		}
	}

	public static int mnozenjenep(int[] niz) {
		int proizvod = 1;
		for (int i = 0; i < niz.length; i++) {
			if (i % 2 != 0)
				proizvod *= niz[i];
		}
		return proizvod;
	}

	public static int sabiranjepar(int[] niz) {
		int zbir = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % 2 == 0) {
				zbir += niz[i];
			}

		}
		return zbir;
	}
}
