package domaci_9;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Uneti broj n");
		int n = s.nextInt();
		System.out.println("Njegov inverzan broj je " + inverzan(n));

	}

	public static int inverzan(int n) {
		int inv = 0;
		while (n != 0) {
			inv *= 10;
			inv += n % 10;
			n /= 10;

		}
		return inv;
	}

}
