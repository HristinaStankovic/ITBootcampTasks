package Nizovi;

import java.util.Arrays;
import java.util.Scanner;

public class ZbirDvaNejednakaNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi duzinu prvog niza: ");
		int n1 = sc.nextInt();

		System.out.println("Unesi duzinu drugog niza: ");
		int n2 = sc.nextInt();

		int niz1[] = new int[n1];
		int niz2[] = new int[n2];

		System.out.println("Unesi elemente prvog niza: ");

		for (int i = 0; i < n1; i++) {
			niz1[i] = sc.nextInt();
		}

		System.out.println("Unesi elemente drugog niza: ");

		for (int i = 0; i < n2; i++) {
			niz2[i] = sc.nextInt();
		}

		int rezultat[] = new int[(int) Math.max(niz1.length, niz2.length)];
		for (int i = 0; i < rezultat.length; i++) {
			if (niz1.length > i && niz2.length > i)
				rezultat[i] = niz1[i] + niz2[i];

			else if (niz1.length < niz2.length)
				rezultat[i] += niz2[i];

			else if (niz2.length < niz1.length)
				rezultat[i] += niz1[i];

		}
		System.out.print(Arrays.toString(rezultat));
	}
		        
          
	

}
