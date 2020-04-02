package Ucionica;

import java.util.ArrayList;

public class Glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Polaznik> polaznici = null;
		
		Laptop lp = new Laptop(new ArrayList<Polaznik>(), "Toshiba");
		


		Polaznik p1 = new Polaznik("Lena", "Kovacevic");
		Polaznik p2 = new Polaznik("Ilijana", "Rakic");
		Polaznik p3 = new Polaznik("Teodora","Milic");

		//System.out.println(lp.getPolaznik(p1));

		System.out.println(lp.marka(polaznici));
		
		//System.out.println(p2.toString());
		
		//System.out.println(p3.toString());
		

	}

}
