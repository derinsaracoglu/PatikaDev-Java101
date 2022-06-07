package TemelAlgoritma;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {

		double yol, yolTutar = 2.20, tutar, acilis = 10.0;

		Scanner input = new Scanner(System.in);
		System.out.println("Gideceðiniz kilometreyi giriniz:");
		yol = input.nextDouble();

		tutar = (yol * yolTutar);
		tutar += acilis;
		tutar = (tutar < 20) ? 20 : tutar;

		System.out.println("Yol ücreti:" + tutar);

	}

}
