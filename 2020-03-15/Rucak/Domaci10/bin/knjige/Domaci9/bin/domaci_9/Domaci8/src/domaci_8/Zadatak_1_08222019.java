package domaci_8;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			double[] niz= new double[3];
			for(int i=0;i<niz.length;i++) {
				System.out.println("Unesi element " + i);
				niz[i] = sc.nextInt();
			}
			System.out.println("Proizvod tri realna broja je "+ mnozenje(niz));
			System.out.println("Najmanji od unetix brojeva je "+ najmanji(niz));
			
	}
	public static double mnozenje(double[] niz ) {
		double proizvod=1;
		for(int i=0;i<niz.length;i++) {
			proizvod*=niz[i];
		}
		
		return proizvod;
		
	}
	public static double najmanji(double[] niz) {
		double min = niz[0];
		for(int i=0;i<niz.length-1;i++) {
			if(niz[i]>niz[i+1])
			 min=niz[i+1];
				
		}
		return min;
		
		
	
	}
}
