package Ucionica;

import java.util.ArrayList;

public class Laptop {

	private ArrayList<Polaznik> polaznici = null;

	private String marka;

	public Laptop(ArrayList<Polaznik> polaznici, String marka) {
		this.polaznici = polaznici;
		this.marka = marka;
	}

	public Laptop() {
		polaznici = new ArrayList<Polaznik>();
	}

	public void dodajPolaznika(Polaznik p) {
		polaznici.add(p);
	}

	public Polaznik getPolaznik(Polaznik p) {
		for (int i = 0; i < polaznici.size(); i++) {
			p = polaznici.get(i);
			break;
		}
		return p;

	}

	public String getmarka() {
		return marka;
	}

	@Override
	public String toString() {
		return "Laptop [marka=" + new ArrayList<Polaznik>()  + "]";
	}
	
	

}