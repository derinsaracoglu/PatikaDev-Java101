package TemelAlgoritma;

import java.util.Scanner;

public class minMaxDegerler {

	public static void main(String[] args) {

		int adet, sayi, min = 1, max = 1;

		Scanner input = new Scanner(System.in);
		System.out.println("Kaç adet sayi gireceksiniz : ");
		adet = input.nextInt();

		for (int i = 1; i <= adet; i++) {
			System.out.print(i + ".sayiyi gir :");
			sayi = input.nextInt();

			if (i == 1) {
				max = sayi;
				min = sayi;
			}

			if (sayi > max) {    //Girilen sayidan daha buyuk bir sayi girilirse max yeniler.
				max = sayi;

			}

			if (sayi < min) {   //Girilen sayidan daha küçük bir sayi girilirse min yeniler.
				min = sayi;
			}

		}
		System.out.println("En buyuk sayi:" + max);
		System.out.println("En kucuk sayi:" + min);
	}

}
