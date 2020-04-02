package domaci_7;

import java.util.Scanner;

public class Zadatak_4_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n za duzinu niza:");
		int n = sc.nextInt();
		int sum = 0;
		int fib[] = new int[n];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		for (int i = 0; i < fib.length; i++) {
			int a = fib[i];
			while (a != 0) {
				sum = sum + (a % 10);
				a = a / 10;
			}
			if (sum % 2 != 0) {
				System.out.println("Broj fibonacijevog niza ciji zbir cifara je neparan broj ");
				System.out.println(fib[i]);

			}
			sum = 0;

		}
	}

}
