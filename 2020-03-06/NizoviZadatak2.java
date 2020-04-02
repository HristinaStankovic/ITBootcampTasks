package itbootcamp.domaci;

import java.util.Scanner;

public class NizoviZadatak2 { //Opadajuci niz.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesi broj clanova niza: ");
		int n= sc.nextInt();
		int[] niz = new int[n];
		
		for (int i = 0; i<n; i++) {
			System.out.println("Unesi"+ i + ".clan: ");
			niz[i]=sc.nextInt();
		}
		for (int i = 0; i<n; i++) {
			for (int j = i + 1;j<n;j++) {
				if (niz[i]<niz[j]) {
					int temp = niz[j];
					niz[j]=niz[i];
					niz[i]=temp;
				}
			}
		}
		for (int i = 0; i<n; i++) {
			System.out.print(niz[i]+",");
		}
		sc.close();
}   
}
