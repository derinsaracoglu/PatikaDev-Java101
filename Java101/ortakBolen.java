package TemelAlgoritma;

import java.util.Scanner;

public class ortakBolen {

	public static void main(String[] args) {
		
		int sayi;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayiyi giriniz:");
		sayi = input.nextInt();
		
		for(int i=1 ; i<=sayi ; i++  ) {
			
			if((i%3 == 0) && (i%4 == 0)) {
				System.out.println(i);
			}
		}

	}

}
