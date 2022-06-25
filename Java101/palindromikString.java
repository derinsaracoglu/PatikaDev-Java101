package TemelAlgoritma;

import java.util.Scanner;

public class palindromikString {
	 static boolean isPalindrome(String str) {
	        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
	            if (str.charAt(i) != str.charAt(j)){
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        String word = "";

	        while (!word.equals("0")) {
	            System.out.print("Bir kelime yazýn: ");
	            word = input.next();

	            if (isPalindrome(word) && !word.equals("0")) {
	                System.out.println("* " + word + " palindrom bir kelimedir.");
	            } else if (!isPalindrome(word) && !word.equals("0")) {
	                System.out.println("* " + word + " palindrom bir kelime deðildir.");
	            }

	            System.out.println(); // Bir satýr boþluk
	        }

	        System.out.println("Program sonlandýrýldý!");
	    }
	}