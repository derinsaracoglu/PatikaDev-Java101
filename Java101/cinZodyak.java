package TemelAlgoritma;

import java.util.Scanner;

public class cinZodyak {

	public static void main(String[] args) {

		int yil, kalan;
		Scanner input = new Scanner(System.in);
		
		System.out.println("***�in Zodya��n�z� ��renin***");

		System.out.println("Do�um g�n�n�z� giriniz:");
		yil = input.nextInt();

		kalan = yil % 12;

		if (kalan == 1) {
			System.out.println("Maymun");
		}

		else if (kalan == 2) {
			System.out.println("Horoz");
		}

		else if (kalan == 3) {
			System.out.println("K�pek");
		}

		else if (kalan == 4) {
			System.out.println("Domuz");
		}

		else if (kalan == 5) {
			System.out.println("Fare");
		}

		else if (kalan == 6) {
			System.out.println("Kaplan");
		}

		else if (kalan == 7) {
			System.out.println("Tav�an");
		}

		else if (kalan == 8) {
			System.out.println("Ejderha");
		}

		else if (kalan == 9) {
			System.out.println("Y�lan");
		}

		else if (kalan == 10) {
			System.out.println("At");
		}

		else if (kalan == 11) {
			System.out.println("Koyun");
		}

		else if (kalan == 12) {
			System.out.println("Maymun");
		}

		else {
			System.out.println("Gecersiz.");
		}
	}

}
