package TemelAlgoritma;

import java.util.Scanner;

public class ucSayidanEnBuyugunuBulma {
	public static void main(String[] args) {
	    
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci sayiyi giriniz:");
		a = sc.nextInt();
		
		System.out.println("Ýkinci sayiyi giriniz:");
		b = sc.nextInt();
		
		System.out.println("Üçüncü sayiyi giriniz:");
		c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("En büyük sayi:" + a);
			
		}else if(b>a && b>c) {
			System.out.println("En büyük sayi:" + b);
		}else if (c>a && c>b) {
			System.out.println("En büyük sayi:" + c);
		}else{
			System.out.println("En büyük sayi tanýmsýz.Sayilar birbirine eþittir.");
		}
  }
}