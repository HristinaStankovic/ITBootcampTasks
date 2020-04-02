package itbootcamp.domaci;

import java.util.Scanner;

public class SamousluznaRadnja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub/
		
		/*2.	Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za potrosace sadrzi sledece opcije:

0 - Izlaz iz programa
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.
Ukoliko korisnik unese opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.
Ukoliko korisnik unese opciju 2 program pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da se ponovo ispise meni.
	Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.*/
    Scanner sc = new Scanner(System.in);
    int izlaz = 0;
    int dodavanjeCene=0;
    int naplataRacuna=0;
    int racun=0;
    int opcija;
    
    do {
    	System.out.println("Izaberite opciju.");
    	System.out.println("0-Izlaz iz programa,1-Dodavanje cene proizvoda,2- Naplata racuna");
    	
    	opcija=sc.nextInt();
    	switch (opcija)  {
    	case 1 : 
    		System.out.println("Unesite cenu proizvoda");
    		
    		dodavanjeCene = sc.nextInt();
    		racun = racun + dodavanjeCene;
    		break;
    	case 2:
    		System.out.println("Uplatite novac za naplatu na vas racun.");
    		if (racun < naplataRacuna) {
    			naplataRacuna = sc.nextInt();
    			
    			System.out.println(" Niste uplatili dovoljno novca za naplatu racuna");
    			
    			
    		}if(racun >= naplataRacuna) {
    			naplataRacuna = sc.nextInt();
    			 System.out.println("Kupovina uspesna");
    			 System.out.println("Vas kusur je:" + (naplataRacuna-racun));
    		}
    		break;
    			 case 0 :
    				 System.out.println("Birate opciju za zavrsavanje programa. Hvala vam sto ste koristili nase usluge");
    				continue;
    				default: 
    					System.out.println("Greska u biranju opcija.");
    					break;
    			 
    		}    
    }while (opcija != 0);
	
	System.out.println("Dovidjenja. ");
	sc.close();
	}
	
}

   
    	
    	
    	


