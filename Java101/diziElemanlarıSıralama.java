package TemelAlgoritma;

import java.util.Scanner;
import java.util.Arrays;

public class diziElemanlarýSýralama {

	public static void main(String[] args) {

		int temp = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Dizinin boyutunu giriniz: ");
		int n = input.nextInt();
		System.out.println("Dizinin boyutu n: " + n);

		if (n > 0) {
			int[] arr = new int[n];
			for (int i = 1; i < n; i++) {
				System.out.println(i + ".elemani giriniz:");
				arr[i] = input.nextInt();
			}
			
			for (int i = 0; i <= n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}

			}

			System.out.println("Siralanmis dizi: " + Arrays.toString(arr));
		} else {
			System.out.print("Hatali giris.");
			System.exit(0);

		}
	}
}
