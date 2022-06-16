package TemelAlgoritma;

import java.util.Scanner;

public class palindromSayilar {

	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;

		while (temp != 0) {
			
			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;

		}

		if (number == reverseNumber)
			return true;

		else
			return false;
	}

	public static void main(String[] args) {

		// Palindrom sayi: 2 taraftan da okundu�unda ayn� olan sayilar.

		System.out.println(isPalindrom(101));

		// 742
		// 7*10 = 70+4 =74
		// 74*10 = 740 + 2 =742
	}

}
