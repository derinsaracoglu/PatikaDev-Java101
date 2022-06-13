package TemelAlgoritma;

import java.util.Scanner;

public class usluSayiBulma {

	public static void main(String[] args) {
		
		int sayi,k,total=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ussu alinacak sayiyi giriniz:");
		sayi = input.nextInt();
		
		System.out.println("Ussu girin:");
		k = input.nextInt();
		
		for(int i=1; i<=k;i++) {
			total *=sayi;
		}
System.out.println("Sonuc :" + total);
	}

}
