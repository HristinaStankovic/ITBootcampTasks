package Nizovi;

import java.util.Arrays;

public class SortiranjeNiza {

	public static void main(String[] args) {
	
		int n[] = { 23, 5, 7, 34, 8, 8 };

		for (int i = 0; i < n.length; i++) {
			int poz = i;
			int min = n[i];
			for (int j = i; j < n.length; j++) {
				if (n[j] < min) {
					poz = j;
					min = n[j];
				}
			}
			int temp = n[i];
			n[i] = n[poz];
			n[poz] = temp;
		}
		
		Arrays.parallelSort(n);
		System.out.println(Arrays.toString(n));
		
		
	}


	}


