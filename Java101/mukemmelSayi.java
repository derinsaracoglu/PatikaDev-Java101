package TemelAlgoritma;

import java.util.Scanner;

public class mukemmelSayi {

	public static void main(String[] args) {

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
			System.out.println(sayi + " sayisi m�kemmel sayidir.");
		} else {
			System.out.println(sayi + " sayisi m�kemmel sayi de�ildir.");
		}

	}

}
