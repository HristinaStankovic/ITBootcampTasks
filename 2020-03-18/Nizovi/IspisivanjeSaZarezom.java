package Nizovi;

public class IspisivanjeSaZarezom {

	public static void main(String[] args) {

		int n []  = {10,4,5,12,22,10};
		
		
		/*
		 * for( i=0; i < n.length; i++) {
		 *                                              //PRVI NACIN
		 * if (i==n.length-1) {System.out.print(n[i]);
		 * 
		 * } else { System.out.print(n[i]+ ", ");
		 * 
		 * }
		 *//*
			 * for (int i=0;i<n.length;i++) { System.out.println(n[i]); if (i !=n.length-1)
			 * System.out.println(", "); }
			 */                                // 2. NACIN

	/*for ( int i =0; i<n.length-1;i++) {
		System.out.print(n[i] + ", ");
}                                                //3.NACIN
	System.out.println(n[n.length-1]);
}*/
	int i ;
	/*for (i=0; i<n.length-1; i++) {
		System.out.println(n[i]+ ", ");*/
		
		i=0;                                     //4. NACIN
		while (i!=n.length-1) {
			System.out.print(n[i]+ ", ");
			i++;
		}
		System.out.print(n[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}