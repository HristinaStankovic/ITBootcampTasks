package Klikeri;

import java.util.Scanner;

public class Dete {
 
	private String ime;
	private String prezime;
	private int brGodina;
	private int brKlikera;
	public Dete(String ime, String prezime, int brGodina, int brKlikera) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGodina = brGodina;
		this.brKlikera = brKlikera;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getBrGodina() {
		return brGodina;
	}
	public int getBrKlikera() {
		return brKlikera;
	}
	
	
	public void setBrGodina(int brGodina) {
		this.brGodina = brGodina;
	}
	public void setBrKlikera(int brKlikera) {
		this.brKlikera = brKlikera;
	}
	public int dodajKlikere(int brKlikera) {
		if (brKlikera>0)
		    brKlikera+=brKlikera;
		return brKlikera;
		
		
	}
	public int oduzmiKlikere (int oduzetiKlikeri) {
		if (oduzetiKlikeri>0 && oduzetiKlikeri<brKlikera)
			brKlikera=brKlikera-oduzetiKlikeri;
				return brKlikera;
			
	}
	@Override
	public String toString() {
		return "Dete [brKlikera=" + brKlikera + "]";
	}
	
	public double prBrGod(int brGodina1,int brGodina2,int brGodina3) {
		int prBrojGodina=0;
		if (brGodina1>0 && brGodina2>0 && brGodina3>0 && (brGodina1+brGodina2)%2==0 && (brGodina1+brGodina2+brGodina3)%3==0){
			prBrojGodina=(brGodina1+brGodina2)/2;
			prBrojGodina=(brGodina1+brGodina2+brGodina3)/3;
		}
		return prBrojGodina;
		
			
		
	}
	
}
