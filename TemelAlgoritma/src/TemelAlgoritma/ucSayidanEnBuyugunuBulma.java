package TemelAlgoritma;

import java.util.Scanner;

public class ucSayidanEnBuyugunuBulma {
	public static void main(String[] args) {
	    
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz:");
		a = sc.nextInt();
		
		System.out.println("�kinci sayiyi giriniz:");
		b = sc.nextInt();
		
		System.out.println("���nc� sayiyi giriniz:");
		c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("En b�y�k sayi:" + a);
			
		}else if(b>a && b>c) {
			System.out.println("En b�y�k sayi:" + b);
		}else if (c>a && c>b) {
			System.out.println("En b�y�k sayi:" + c);
		}else{
			System.out.println("En b�y�k sayi tan�ms�z.Sayilar birbirine e�ittir.");
		}
  }
}