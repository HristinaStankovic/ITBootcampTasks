package Banka;

import java.util.Scanner;

public class RazmenaSredstava {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Racun mojRacun = new Racun();
		mojRacun.uplati(5000);
		System.out.println(mojRacun.dohvatiStanje());
		Racun tvojRacun = new Racun();
		tvojRacun.uplati(5000);
		System.out.println(tvojRacun.dohvatiStanje());
		System.out.println("Koliko novca zelite da prebacite:" );
		double promena = sc.nextDouble();
		double razlika = mojRacun.dohvatiStanje() - mojRacun.podigni(promena);
		tvojRacun.uplati(razlika);
		System.out.println(mojRacun.dohvatiStanje());
		System.out.println(tvojRacun.dohvatiStanje());
	}

}
