package Karte;

import java.util.Scanner;

public class K {

	public static int brojKarata1(){
		System.out.println("Koliko prvi igrac ima karata?");
		Scanner sc =new Scanner(System.in);
		int n1= sc.nextInt();
		return n1;
	}
		
	public static int[] ucitajKarte1(int n1) {
		System.out.println("Koje karte ima prvi igrac?");
		int [] niz1= new int [n1];
		for(int i=0;i<n1;i++) {
			Scanner sc =new Scanner(System.in);
			int [] brojevi1= new int [n1];
			brojevi1[i]=sc.nextInt();
		
		}
		return niz1;
	}
	public static int brojKarata2(){
		System.out.println("Koliko drugi igrac ima karata?");
		Scanner sc =new Scanner(System.in);
		int n2= sc.nextInt();
		return n2;
	}
		
	public static int[] ucitajKarte2(int n2) {
		System.out.println("Koje karte ima drugi igrac?");
		int [] niz2= new int [n2];
		for(int i=0;i<n2;i++) {
			Scanner sc =new Scanner(System.in);
			int [] brojevi2= new int [n2];
			brojevi2[i]=sc.nextInt();
		
		}
		return niz2;
	}
	public static int izracunajSpilove1(int brojevi1[]) {
		int n1;
		int spilovi1=0;
		for(int i=0;i<brojevi1.length;i++) {
		if(brojevi1[i]>9 && brojevi1[i]<15);
		 spilovi1 ++;
		
		}
		return spilovi1;
	}
	
	public static int izracunajSpilove2(int brojevi2[]) {
		int n2;
		int spilovi2=0;
		for(int i=0;i<brojevi2.length;i++) {
		if(brojevi2[i]>9 && brojevi2[i]<15);
		 spilovi2 ++;
		
		}
		return spilovi2;
	}
	
	
	public static void proglasiPobednika(int spilovi1,int spilovi2) {
		
		if(spilovi1>spilovi2) System.out.println("Prvi je pobednik");
		if(spilovi1<spilovi2) System.out.println("Drugi je pobednik");
		if(spilovi1==spilovi2)System.out.println("Nereseno je");
	}
	
	public static void main(String[] args) {
		int spilovi1;
		int spilovi2;
		
		 int n1= brojKarata1();
		 int [] niz1=ucitajKarte1(n1);
		 int n2= brojKarata2();
		 int [] niz2=ucitajKarte1(n2);
		 spilovi1=izracunajSpilove1(niz1);
		 spilovi2=izracunajSpilove2(niz2);
		proglasiPobednika(spilovi1,spilovi2);
		
		 
		 
		 
		
		
		

}
}
