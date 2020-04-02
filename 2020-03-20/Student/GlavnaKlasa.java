package Student;

import java.util.Scanner;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student("Hristina","Stankovic", 28, 9.2);
		s1.ime="Pera";
		s1.prezime="Miljkovic";
		s1.dohvatiIndex();
		//s1.Index=5; ako je public
		System.out.println(s1.prosek);
		System.out.println(s1.dohvatiIndex());
		System.out.println(s1.ime);
		System.out.println(s1.prezime);
	
		boolean uspesno = false;
		while (uspesno==false) {
			int index = sc.nextInt();
			uspesno = s1.postaviIndex(index);
			
			Student Zika = new Student("Zika","Zikic",5,9.02);
			System.out.println(Zika.ime);
			
		}
		
	}

}
