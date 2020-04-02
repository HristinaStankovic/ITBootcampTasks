package Klikeri;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dete d1 = new Dete("Iva", "Milic", 5, 10);
		Dete d2 = new Dete("Beba", "Mala", 3, 12);

		System.out.println(d1.dodajKlikere(5));
        System.out.println(d1.oduzmiKlikere(3));
        System.out.println(d1.prBrGod(5,6,8));
        
        
	}

}
