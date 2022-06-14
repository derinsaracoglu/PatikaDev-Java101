package TemelAlgoritma;

import java.util.Scanner;

public class basamakSayisi {

	public static void main(String[] args) {
		 
		int sayi,adet=0,toplam=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayiyi giriniz:");
		sayi = input.nextInt();
		
		while(sayi!=0) {
			toplam += (sayi%10);
			sayi = sayi/10;
			++adet;
			
		}
        System.out.println("Basamak sayisi: "+adet);
        System.out.println("Basamaklar Toplami :"+toplam);
	}

}
