package itbootcamp.domaci;

public class Zadatak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=10,c=15;
		 System.out.println("Post-inkrementa i pre-inkrementa.");
		
		int r = a++ + b++ + c++;	
		System.out.println("Rezultat r je: " + r); /*Rezulatat sabiranja ova 3 clana
		je ekvivalentan abiru a+b+c. Vrednosti varijabli se za po 1 uvecavaju
		tek pri drugom pozivu svake od varijabli (u drugom izrazu).*/
		//a++ je isto kao i a=a+1 ili a=10+1
		//b-- je isto sto i b=b-1 ili b=15-1
		
		int o = ++b + ++c + ++a;
		System.out.println("Rezultat o je: " + o); /*Rezultat sabiranja se uvecao za 3
		zbog prethodnog izraza u kome je svaka od varijabli inkrementirana. Rezultat ostaje 
		samo 1 uvecan za 3 zato sto se nova inkrementacija pamti za sledece pozivanje
		ove tri varijable.*/
		
		int t = ++a + ++b + ++c;
		System.out.println("Rezultat t je: " + t); /*Rezultat sabiranja se uvecao za tri
		u odnosu na prethodni izraz.*/
		
		int y = ++c + ++b + ++a;
		System.out.println("Rezultat y je: " + y); /*Rezultat sabiranja se uvecao za tri
		u odnosu na prethodni izraz.*/
		
		System.out.println("Post-dekrementa i pre-dekrementa.");
		
		int h = a-- + b-- + c--;
		System.out.println("Rezultat h je: " + h); /*Rezultat je ostao isti kao i u 
		prethodnom izrazu,ali je umanjenje zapamceno. */
		
		int s = c-- + b-- + a--;
		System.out.println("Rezultat s je: "+ c); /* Rezultat je visestruko umanjen,zato sto 
		je,zapravo,umanjena zapamcena vrednost prethodnog izraza.*/
		
		int x = --a + --b + --c; /*Rezultat je izjednacen sa pocetnim izrazom */
		System.out.println("Rezultat x je: " + x);
		
		int z = --c + --b + --a;
		System.out.println("Rezultat z je: " + z);
		
	}

}
