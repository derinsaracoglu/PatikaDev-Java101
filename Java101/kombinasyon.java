package TemelAlgoritma;

import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {

		int n, r, ust = 1, alt = 1;

		Scanner input = new Scanner(System.in);
		System.out.println("n'i giriniz: ");
		n = input.nextInt();
		System.out.println("r'i giriniz: ");
		r = input.nextInt();

		if (n < r) {
			System.out.println("n sayisi r sayisindan buyuk olmalidir.Lütfen tekrar dene...");

		} else {

			for (int i = 0; i < r; i++) {
				ust *= (n - i);
			}
			for (int k = 1; k <= r; k++) {
				alt *= k;
			}
			System.out.println(n + " 'in " + r + " 'li kombinasyonu : " + (ust / alt));
		}
	}
}