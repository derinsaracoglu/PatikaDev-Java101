package TemelAlgoritma;

import java.util.Scanner;

public class KDVHesaplama {
	public static void main(String[] args) {
		
		double tutar, kdvOran = 0.18;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tutari giriniz:");
		tutar = input.nextDouble();
		
		double kdvTutar= tutar*kdvOran;
		double kdvliTutar = kdvTutar + tutar;
		
		System.out.println(kdvliTutar);
		

	}

}
