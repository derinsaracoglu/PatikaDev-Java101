package TemelAlgoritma;

import java.util.Scanner;

public class harmonikSayi {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("n sayisini giriniz:");
		
		int n = input.nextInt();
		double sonuc =0;
		
		for(int i=1; i<=n;i++) {
			sonuc += (1.0/i);
			
		}
		System.out.println(sonuc);

	}

}
