package itbootcamp.domaci;

import java.util.Scanner;

public class MeseciUGodini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String mesec = sc.next();
		 switch (mesec) {
		 case "Januar" :
			 System.out.println("Jos 2 meseca u godini pocinju na slovo 'J',to su Jun,Jul");
		 case "Februar" :
			 System.out.println("Februar je jedinstven mesec u godini.");
		 case "Mart" :
			 System.out.println("Naziv meseca Maja,takodje,pocinje na slovo 'M',dakle ima ih ukupno 2");
		 case "April" :
			 System.out.println("Pored Aprila,mesec Avgust pocinje na slovo 'A'");
		 case "Septembar" :
			 System.out.println("Septembar je jedini mesec u godini koji pocinje na slovo 'S'");
		 case "Oktobar" :
			 System.out.println("Oktobar je jedini mesec u godini koji pocinje na slovo 'O'");
		 case "Novembar" :
			 System.out.println("Novembar je jedini mesec u godini koji pocinje na slovo 'N'");
		 case "Decembar" :
			 System.out.println("Decembar je jedini mesec u godini koji pocinje na slovo 'D'");
		 }

	}

}
