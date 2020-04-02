package Student;

public class Student {

	public String ime;
	public String prezime;
	private int index;
	public double prosek;
	
	public Student (String i, String p,int ind, double pr) {
		ime=i;
		prezime=p;
		index=ind;
		prosek=pr;
		
	}
	public int dohvatiIndex() {
		return index;
	}

	
	
	public boolean postaviIndex(int ind) {
		if (ind<0) {
			System.out.println("Nevalidan index");
		return false;
		}else {
        int index = ind;
		}
		return true;
	}
	
	
	
	
	
}
