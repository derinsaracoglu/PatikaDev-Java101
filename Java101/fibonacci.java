package TemelAlgoritma;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		
		int sayi;
		int f = 0;
		int g = 1;

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayi giriniz:");
		sayi =input.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			f = f + g;
			g = f - g;
			System.out.print(f + " ");
		}

		System.out.println();
	}
}