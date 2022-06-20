package TemelAlgoritma;

import java.util.Arrays;
import java.util.Scanner;

public class arrayCloseMinMax {

	public static void main(String[] args) {
		System.out.print("n sayýsý giriniz: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

		Arrays.sort(list);
		System.out.println("Dizimizin sýralanmýþ hali");
		System.out.println(Arrays.toString(list));

		for (int i = 0; i < list.length; i++) {

			if (n < list[i]) {

				System.out.println("Max en yakýn deðer: " + list[i]);
				System.out.println("Min en yakýn deðer: " + list[i - 1]);
				break;

			}

		}
	}
}