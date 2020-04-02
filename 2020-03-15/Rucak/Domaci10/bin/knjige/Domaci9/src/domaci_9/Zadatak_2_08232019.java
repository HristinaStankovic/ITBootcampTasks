package domaci_9;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Ucitatti od kog broja pocinje niz");
		int k=s.nextInt();
		System.out.println("Ucitati do kog broja ide niz");
		int n=s.nextInt();
		System.out.println("Ucitati kojim brojem da buu deljivi");
		int m=s.nextInt();
		System.out.println("Ti brojevi su ");
		ispis(k,n,m);
		
		
	}
	
	public static void ispis(int k, int n, int m) {
		for(int i=k;i<=n;i++) {
			if(i%m==0)
			System.out.print(i);
		}
		
	}

}
