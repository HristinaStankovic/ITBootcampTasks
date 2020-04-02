package Nizovi;

import java.util.Scanner;

public class ZbirDvaNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Unesite duzinu nizova: ");
         int n=sc.nextInt();
   
        int niz1[]=new int [n];
        int niz2[]=new int [n];
        System.out.print("Unesite elemente prvog niza: ");
        
        for (int i = 0; i<n; i++) {
        	niz1[i]=sc.nextInt();
        	
        }
  System.out.println("Unesite elemente drugog niza: ");
        
        for (int i = 0; i<=n-1; i++) {
        	niz2[i]=sc.nextInt();
        	   
	}
        int []niz3 = new int[n];
        for (int i = 0; i<=n-1; i++) {
        	niz3[i]= niz1[i] + niz2[i];//jednacina za sabiranje clanova niza
        }
        System.out.print("Zbir clanova 2 niza je: ");
        for (int i = 0; i<n; i++) {
        	System.out.print(niz3[i] + "3 ");
        }

}
}