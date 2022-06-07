package TemelAlgoritma;

import java.util.Scanner;

public class kelimeSayisiBulma {

	public static void main(String[] args) {
		// Boþluk adedinin bir fazlasý bize kelime sayýsýný verir.Boþluk (n) ise kelime
		// sayýsý (n + 1)
		String yazi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cümleyi giriniz:");
		yazi = sc.nextLine(); // Boþluklarý da okumamýz gerektiðinden nextLine() kullandýk.

		System.out.println("Harf sayisi:" + yazi.length());

		int sayac = 0;
		for (int i = 0; i < yazi.length(); i++) {
			if (yazi.charAt(i) == ' ')
				sayac++;
		}
		System.out.println("Kelime sayisi:" + (sayac + 1));
	}

}
