package TemelAlgoritma;

import java.util.Scanner;

public class kuvvetBulma {

	public static void main(String[] args) {

		int k;
		Scanner input = new Scanner(System.in);

		System.out.print("Sayiyi giriniz:");
		k = input.nextInt();

		for (int i = 1; i <= k; i *= 4) {
			System.out.println(i);
		}
		
		System.out.println("****************");

		for (int j = 1; j <= k; j *= 5) {
			System.out.println(j);

		}
	}
}
