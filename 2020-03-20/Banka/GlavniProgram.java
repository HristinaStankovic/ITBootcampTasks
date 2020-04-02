package Banka;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Racun mojRacun = new Racun();
		
		mojRacun.uplati(10000);
		System.out.println(mojRacun.dohvatiStanje());
		
		double stanjePoslePodizanja = mojRacun.podigni(1000);
		
		//mojRacun.podigni(1000);
		System.out.println(stanjePoslePodizanja);
		System.out.println(mojRacun.dohvatiStanje());
		
	
		Racun tvojRacun = new Racun();
		
		tvojRacun.uplati(15000);
		System.out.println(tvojRacun.dohvatiStanje());
		tvojRacun.podigni(5222);
		System.out.println(tvojRacun.dohvatiStanje());
		
	}

}
