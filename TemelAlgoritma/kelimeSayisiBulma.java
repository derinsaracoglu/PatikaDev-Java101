package TemelAlgoritma;

import java.util.Scanner;

public class kelimeSayisiBulma {

	public static void main(String[] args) {
		// Bo�luk adedinin bir fazlas� bize kelime say�s�n� verir.Bo�luk (n) ise kelime
		// say�s� (n + 1)
		String yazi;
		Scanner sc = new Scanner(System.in);
		System.out.println("C�mleyi giriniz:");
		yazi = sc.nextLine(); // Bo�luklar� da okumam�z gerekti�inden nextLine() kulland�k.

		System.out.println("Harf sayisi:" + yazi.length());

		int sayac = 0;
		for (int i = 0; i < yazi.length(); i++) {
			if (yazi.charAt(i) == ' ')
				sayac++;
		}
		System.out.println("Kelime sayisi:" + (sayac + 1));
	}

}
