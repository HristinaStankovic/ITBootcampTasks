package itbootcamp.domaci;

import java.util.Scanner;

public class SahGlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Sah s1 = new Sah(64, 74, false, false);
		
		System.out.println("Pozicija belog piona je: " + s1.getpozicijaPiona());
		System.out.println("Pozicija crnog skakaca je:" + s1.getpozicijaSkakaca());
		System.out.println(s1.getskakacNijeNapadnut());
		
		s1.setPozicijaPiona(64);
		System.out.println("Nova pozicija belog piona je:" + s1.getpozicijaPiona());
		s1.setpozicijaSkakaca(55);
		System.out.println("Nova pozicija crnog skakaca je: "+ s1.getpozicijaSkakaca());
		System.out.println(s1.getskakacNapadnut());
		
		s1.setPozicijaPiona(22);
		System.out.println("Nova pozicija belog piona je:" + s1.getpozicijaPiona());
		s1.setpozicijaSkakaca(11);
		System.out.println("Nova pozicija crnog skakaca je: "+ s1.getpozicijaSkakaca());
		System.out.println(s1.getskakacNapadnut());
	}
	

}
