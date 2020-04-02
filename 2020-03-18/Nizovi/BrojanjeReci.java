package Nizovi;

import java.util.Scanner;

public class BrojanjeReci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		
		String recenica = sc.next();
		String reci[] = recenica.split(" ");
		
		int broj = 0;
		
		for (int i = 0; i< reci.length; i++) {
			String rec = reci[i];
			if (rec.charAt(rec.length()-1)=='a') {
				broj++;
			}
		}
		System.out.println("Ima" + broj + "reci koje se zavrsavaju na slovo 'a'.");
	}
	
	
	
	
	

}
