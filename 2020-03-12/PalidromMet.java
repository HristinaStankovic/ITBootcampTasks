package itbootcamp.domaci;

import java.util.Arrays;
import java.util.Scanner;

public class PalidromMet {
     
	
		public static int[] ucitajNiz(int brElem) {
			Scanner sc = new Scanner(System.in);
			int niz[] = new int[brElem];
			for (int i = 0; i < niz.length; i++) {
				niz[i] = sc.nextInt();
			}
			return niz;
		}
		public static void proveraPalindroma(int niz[]) {
			int promenljiva = 0;
			for (int i = 0; i <= niz.length / 2; i++) {
				if (niz[i] != niz[niz.length - i - 1]) {
					promenljiva = 1;
					break;
				}
			}
			if (promenljiva == 1) 
				System.out.println("Niz nije palindrom!");
			else
				System.out.println("Niz jeste palindrom!");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Unesite najpre broj clanova niza,zatim same clanove: ");
			int[] niz = ucitajNiz(sc.nextInt());
			
			System.out.println(Arrays.toString(niz));
			proveraPalindroma(niz);
		}
	}

