package itbootcamp.domaci;


public class Sportista1Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Klub k1 = new Klub("Barselona","Barselona", 1985, new Sportista1[10]);
		
		Sportista1 s1 = new Sportista1("Sonja","Petrovic",1983);
		Sportista1 s2 = new Sportista1("Jelena","Brooks",1989);
		Sportista1 s3 = new Sportista1("Maja","Miljkovic",1988);
		Sportista1 s4 = new Sportista1("Teodora","Lukic",1994);
		Sportista1 s5 = new Sportista1("Isidora","Zoric",1995);
		Sportista1 s6 = new Sportista1("Iva","Milic",1998);
		
		
		k1.dodajSportistu(s1);
		k1.dodajSportistu(s2);
		k1.dodajSportistu(s3);
		k1.dodajSportistu(s4);
		k1.dodajSportistu(s5);
		
		System.out.println(k1.getNazivKluba());
		System.out.println(k1.getGodOsnivanja());
		System.out.println(k1.getSedisteKluba());
		System.out.println(k1.getSportista1(s1));
		System.out.println(k1.getSportista1(s5));
		
		k1.setNazivKluba("Sant Antoni");
		System.out.println(k1.getNazivKluba());
		System.out.println(k1.getSedisteKluba());
		System.out.println(s3.toString());
		
		
		
	
		

	}

}
