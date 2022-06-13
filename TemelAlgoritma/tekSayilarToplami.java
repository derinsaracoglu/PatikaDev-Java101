package TemelAlgoritma;

import java.util.Scanner;

public class tekSayilarToplami {

	public static void main(String[] args) {
		
		int i,toplam,n;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Bir sayi giriniz:");
		n=sc.nextInt();
		
		toplam = 0;
		for(i=1;i<n;i+=2) {
			if(i%2==1) {
				toplam +=i;
			}
		}
		System.out.println("Tek sayilar toplami:" + toplam);

	}

}
