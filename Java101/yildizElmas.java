package TemelAlgoritma;

import java.util.Scanner;

public class yildizElmas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Bir sayi giriniz :");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int k = n; k > i; k--)// bu for d�ng�m�z ekran ��kt�s�n�n sol taraf�ndaki bo�luklar� ayarl�yor.
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++)// bu for d�ng�m�zde ise y�ld�z �eklimizi ��kart�yor ve y�ld�zlar�n aras�ndaki
										// bo�lu�u ayarl�yor
			{
				System.out.print("*" + " ");
			}

			System.out.println();
		}
		for (int k = 1; k <= n; k++) {
			for (int l = 1; l <= k; l++)// Y�ld�z diliminin alt k�s�m�n�n sol taraf�ndaki bo�luklar� belirtir.
			{
				System.out.print(" ");
			}
			for (int m = n; m > k; m--)// Y�ld�z diliminin alt k�s�m�ndaki y�ld�zlar� ve aras�ndaki bo�luklar�
										// belirtir.
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}