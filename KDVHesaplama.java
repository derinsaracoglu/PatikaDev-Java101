package TemelAlgoritma;

import java.util.Scanner;

public class KDVHesaplama {
	public static void main(String[] args) {
		
		double tutar, kdvOran = 0;
		boolean kdvDurum = true;
		
		//Girdi alma
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tutari giriniz:");
		tutar = input.nextDouble();
		
		//KDV Hesabý
		
		kdvDurum = ( 0<tutar) && (tutar<1000);
		kdvOran = kdvDurum ? 0.18d : 0.08;
		
		double kdvTutar= tutar*kdvOran;
		double kdvliTutar = kdvTutar + tutar;
	
		
		
		System.out.println("KDV:" + kdvOran);
		System.out.println("KDV Tutari:"+kdvTutar);
		System.out.println("KDV'li Tutari:" + kdvliTutar);
		
		

	}

}
