package TemelAlgoritma;

import java.util.Scanner;

public class ucakBilet {

	public static void main(String[] args) {

		int yolculukTipi, yas, km;
		double perKm = 0.10, normalBiletFiyat, yasIndirim, gidisDonusIndirimi;

		Scanner input = new Scanner(System.in);

		// Bilet

		System.out.println("Gitmek istediðiniz mesafeyi kilometre(km) cinsinden giriniz:");
		km = input.nextInt();
		normalBiletFiyat = km * perKm;

		// Yas

		System.out.println("Yasinizi giriniz:");
		yas = input.nextInt();

		System.out.println("**********************");
		if ((km < 0) || (yas < 0)) {
			System.out.println("Hatali veri girdiniz.");
		} else {
			System.out.println("Gitmek istediðiniz mesafe:" + km);
			System.out.println("Yasiniz:" + yas);
			System.out.println("**********************");
		}

		double indirimliTutar = normalBiletFiyat;

		if (yas < 12) {
			yasIndirim = normalBiletFiyat * 0.50;
			indirimliTutar = normalBiletFiyat - yasIndirim;
		}

		else if (yas <= 24) {
			yasIndirim = normalBiletFiyat * 0.10;
			indirimliTutar = normalBiletFiyat - yasIndirim;
		}

		else if (yas > 65) {
			yasIndirim = normalBiletFiyat * 0.30;
			indirimliTutar = normalBiletFiyat - yasIndirim;
		}

		// Yolculuk Tipi

		System.out.println("Yolculuk tipini seciniz:\n1.Gidis\n2.Gidis-Donus");
		yolculukTipi = input.nextInt();

		if (yolculukTipi == 1) {
			System.out.println("Toplam Tutar: " + indirimliTutar + " TL");
		} else {
			gidisDonusIndirimi = indirimliTutar * 0.20;
			indirimliTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
			System.out.println("Toplam Tutar = " + indirimliTutar + " TL");
		}
	}

}
