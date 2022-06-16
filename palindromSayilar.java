package TemelAlgoritma;

import java.util.Scanner;

public class palindromSayilar {

	static boolean isPalindrom(int number) {
		int temp = number, reverseNumber = 0, lastNumber;

		while (temp != 0) {
			System.out.println("===========");
			System.out.println("Number : " + temp);
			lastNumber = temp % 10;
			System.out.println("Last Number : "+lastNumber);
			reverseNumber = (reverseNumber * 10) + lastNumber;
			System.out.println("New Number : " +reverseNumber);
			temp /= 10;

		}
		return true;
	}

	public static void main(String[] args) {

		// Palindrom sayi: 2 taraftan da okunduğunda aynı olan sayilar.

	
	   isPalindrom(8024);
      // 742
	  // 7*10 = 70+4 =74
	  // 74*10 = 740 + 2 =742
	}

}
