package itbootcamp.domaci;

public class NizBrojeva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		for (int i=9 ; i<=250 ; i++) {
			if (i %3 == 0) {
				n = n+1; 
				System.out.print(i + " "); 
			}		
		}
		System.out.println();
		System.out.println("Ima " + n + " brojeva deljivih sa 3");
	}

	}


