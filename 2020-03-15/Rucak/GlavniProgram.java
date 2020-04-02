package Rucak;

public class GlavniProgram {

	public static void main(String[] args) {

		Sastojak s = new Sastojak("sargarepa", 450);
		Sastojak s1 = new Sastojak("persun", 120);
		Sastojak s2 = new Sastojak("knedle", 300);
		Sastojak s3 = new Sastojak("margarin", 300);
		Sastojak s4 = new Sastojak("secer", 300);
		Sastojak s5 = new Sastojak("plazma", 300);
		Sastojak s6 = new Sastojak("cokolada", 300);
		Sastojak s7 = new Sastojak("jaja", 700);
		Sastojak s8 = new Sastojak("brasno", 150);
		Sastojak s9 = new Sastojak("mleko", 120);
		Sastojak s10 = new Sastojak("kiseli kupus", 760);
		Sastojak s11 = new Sastojak("meso", 650);
		
		s.setCenaKg(451);
		System.out.println("Nova cena sargarepe je: " + s.getCenaKg());
		 
		Torta t = new Torta("Menaz");
		t.dodajSastojak(s3, 500);
		t.dodajSastojak(s4, 1000);
		t.dodajSastojak(s5, 300);
		t.dodajSastojak(s7, 60);
		
		Torta t1 = new Torta("Coko-plazma");
		t1.dodajSastojak(s7, 50);
		t1.dodajSastojak(s6, 1000);
		t1.dodajSastojak(s5, 500);
		
		System.out.println("Torta Coko-Plazma ispis: " + t1);
		System.out.println("Da li sadrzi margarin Coko-plazma: " + t1.SadrziMargarin());
		
		
		System.out.println("Ipis za Menaz tortu: "  + t);
		System.out.println("Da li sadzri margarin Menaz torta: " + t.SadrziMargarin());
		
		Supa corba = new Supa("Pileca Supa", 65);
		
		corba.dodajSastojak(s, 200); corba.dodajSastojak(s1, 20); corba.dodajSastojak(s2, 350);

		corba.getKuvanje();
		System.out.println("Corba se kuva: " + corba.getKuvanje() + " minuta!");
		
		System.out.println("Ispis za corbu: " + corba);
		
		System.out.println("Cena svih namirnica za Coko plazmu je: " + t.cenaNamirnica());
		
		Jelo j2 = new Jelo("Palacinke");
		Jelo j3 = new Jelo("Sarma");
		Jelo j4 = new Jelo("Kupus");
		
		j2.dodajSastojak(s7,70);
		j2.dodajSastojak(s8, 1200);
		j2.dodajSastojak(s9, 500);
		
		j2.cenaNamirnica();
		
		j4.dodajSastojak(s11, 2000);
		j4.dodajSastojak(s10, 650);
		System.out.println("Cena svih namirnica za Kupus je: " + j4.cenaNamirnica());
		System.out.println("Cena svih namirnica za Palacinke je: " + j2.cenaNamirnica());
		
		System.out.println("Ispis za Jelo Palacnike: " + j2);
		
		Meni m = new Meni(); 
		m.dodajJelo(t); m.dodajJelo(t1); m.dodajJelo(j2); m.dodajJelo(j3); m.dodajJelo(j4);m.dodajJelo(corba);
		
		System.out.println("Ispis MENU: " + m);
		
	}

}
