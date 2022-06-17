package TemelAlgoritma;

import java.util.Scanner;

public class asalSayi {
	
	static boolean asalSayi(int sayi,int bolen) {
		if(sayi <= 2) 
			return (sayi==2)?true:false;
		
		
		if(sayi%bolen==0) 
			return false;
		
		
		if(bolen*bolen > sayi) 
			return true;
		
		
		return asalSayi(sayi,bolen+1);
	}
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		System.out.println("Bir sayi giriniz:");
		int sayi = input.nextInt();
		
		if(asalSayi(sayi,2)) {
			System.out.println(sayi + " bir asal sayidir");
		}else {
			System.out.println(sayi + " bir asal sayi deðildir.");
		}
		
		}
		
	}

}
