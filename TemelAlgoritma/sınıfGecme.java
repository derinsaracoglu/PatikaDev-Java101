package TemelAlgoritma;

import java.util.Scanner;

public class s�n�fGecme {

	public static void main(String[] args) {

		int mat, fizik, turkce, kimya, muzik, toplam;
		double ort;

		Scanner input = new Scanner(System.in);

		System.out.println("Matametik notunuzu giriniz:");
		mat = input.nextInt();

		System.out.println("Fizik notunuzu giriniz:");
		fizik = input.nextInt();

		System.out.println("T�rk�e notunuzu giriniz:");
		turkce = input.nextInt();

		System.out.println("Kimya notunuzu giriniz:");
		kimya = input.nextInt();

		System.out.println("Muzik notunuzu giriniz:");
		muzik = input.nextInt();

		toplam = mat + fizik + turkce + kimya + muzik;
		ort = toplam / 5;

		if (ort < 55) {
			System.out.println("Kald�n�z..");

		}
		
		else {
			System.out.println("Ortalamaniz:" + ort);
		}

		if (ort < 0 || ort > 100) {
			System.out.println("Ge�ersiz ortalama.");
		}

	}

}
