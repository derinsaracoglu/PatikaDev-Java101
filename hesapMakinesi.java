package TemelAlgoritma;

import java.util.Scanner;

public class hesapMakinesi {

	public static void main(String[] args) {

		int n1, n2, secim;
		Scanner input = new Scanner(System.in);

		System.out.println("Birinci sayiyi giriniz :");
		n1 = input.nextInt();

		System.out.println("Ýkinci sayiyi giriniz :");
		n2 = input.nextInt();

		System.out.println("1.Toplama\n2.Cikarma\n3.Carpma\n4.Bolme");
		System.out.println("Yapmak istediginiz islemi seciniz:");
		secim = input.nextInt();

		switch (secim) {
		case 1:
			System.out.println("Toplam :" + (n1 + n2));
			break;

		case 2:
			System.out.println("Cikarma :" + (n1 - n2));
			break;

		case 3:
			System.out.println("Carpma :" + (n1 * n2));
			break;

		case 4:
			if (n2 != 0) {
				System.out.println("Sonuc : " + (n1 / n2));
			} else {
				System.out.println("Bir sayý 0'a bölünemez !!!");
			}

			break;

		default:
			System.out.println("Ýslem bulunamadi...");

		}

	}

}
