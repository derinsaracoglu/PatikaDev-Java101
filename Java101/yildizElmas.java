package TemelAlgoritma;

import java.util.Scanner;

public class yildizElmas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Bir sayi giriniz :");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = n; k > i; k--)// bu for döngümüz ekran çýktýsýnýn sol tarafýndaki boþluklarý ayarlýyor.
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)// bu for döngümüzde ise yýldýz þeklimizi çýkartýyor ve yýldýzlarýn arasýndaki
										// boþluðu ayarlýyor
			{
				System.out.print("*" + " ");
			}

			System.out.println();
		}
		for (int k = 1; k <= n; k++) {
			for (int l = 1; l <= k; l++)// Yýldýz diliminin alt kýsýmýnýn sol tarafýndaki boþluklarý belirtir.
			{
				System.out.print(" ");
			}
			for (int m = n; m > k; m--)// Yýldýz diliminin alt kýsýmýndaki yýldýzlarý ve arasýndaki boþluklarý
										// belirtir.
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}