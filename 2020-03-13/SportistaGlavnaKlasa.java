package itbootcamp.domaci;

import java.util.Scanner;

public class SportistaGlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 Sportista s1 = new Sportista("Rea Lukic", "Vaterpolo","Partizan", 0);
		 
		System.out.println(s1.getImePrezime());
		System.out.println(s1.getSport());
		
		System.out.println(s1.getKlub());
		
		s1.setKlub("ProReco"); //promena kluba.
		
		System.out.println(s1.getKlub());
		System.out.println("Unesite Vas broj dresa: ");
		 s1.brojNaDresu=sc.nextInt();
		 System.out.println("Vas broj dresa je: " + s1.brojNaDresu);
		 
		 System.out.println("");
		 Sportista s2 = new Sportista("Milos Milic", "Kosarka","Barseloneta", 17);
		 System.out.println(s2.getImePrezime());
		 System.out.println(s2.getSport());
		 
		 s2.setKlub("Real Madrid");
		 System.out.println(s2.getKlub());
		 
		 s2.setbrojNaDresu(28);
		 System.out.println("Vas novi broj na dresu:" + s2.getbrojNaDresu());
		 System.out.println("");
		 
		 Sportista s3 = new Sportista("Lena Torlak", "Rukomet", "Lions", 35);
		 
		 System.out.println(s3.getImePrezime());
		 System.out.println(s3.getSport());
		 
		 System.out.println(s3.getKlub());
		 
		 s3.setbrojNaDresu(26);
		 
		 System.out.println("Unesite ime Vaseg novog kluba: ");
		 s3.klub=sc.next();
		 System.out.println("Vas nov klub,za koji ste poceli da igrate,je" + " "+s3.klub + ".");
		 
		 
		 
	}

}
