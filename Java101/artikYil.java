package TemelAlgoritma;

import java.util.Scanner;

public class artikYil {

	public static void main(String[] args) {

		double kalan;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Yili giriniz:");

		int yil = input.nextInt();

		kalan = yil % 4;

		if (kalan == 0) {
			System.out.println(yil + " yili bir artik yildir.");
		} else {
			System.out.println(yil + " bir artik yil deðildir.");
		}

	}

}
