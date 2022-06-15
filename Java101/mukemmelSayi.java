package TemelAlgoritma;

import java.util.Scanner;

public class mukemmelSayi {

	public static void main(String[] args) {
		
		// Kendisine tam bolunen sayilarin toplami yine kendisi eden sayilara mükemmel sayilar denir.

		int sayi, toplam = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Bir Sayi giriniz:");
		sayi = input.nextInt();

		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				toplam += i;
			}

		}
		if (sayi == toplam) {
			System.out.println(sayi + " sayisi mükemmel sayidir.");
		} else {
			System.out.println(sayi + " sayisi mükemmel sayi deðildir.");
		}

	}

}
