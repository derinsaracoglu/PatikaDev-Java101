package TemelAlgoritma;

import java.util.Scanner;

public class tersUcgen {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int n = input.nextInt();
		
		
		for (int k = 1; k <= n; k++) {
			for (int l = 1; l <= k; l++)
			{
				System.out.print(" ");
			}
			for (int m = n; m > k; m--)
										
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}