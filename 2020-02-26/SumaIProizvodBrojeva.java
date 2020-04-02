package itbootcamp.domaci;

import java.util.Scanner;

public class SumaIProizvodBrojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	           int i=0,n;
	           int zbirParnih=0,proizvodNeparnih=1;
	           System.out.println("Molimo vas unesite broj n: ");
         n = sc. nextInt();
         for (i=0;i<=n;i++) {
        	 zbirParnih +=i;
        	 proizvodNeparnih = proizvodNeparnih * (i+1);
        	 i++;
         } System.out.println("Zbir parnih brojeva je" + zbirParnih);
         System.out.println("Proizvod neparnih je" + proizvodNeparnih);
	}
}

