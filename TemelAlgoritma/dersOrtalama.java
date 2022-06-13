package TemelAlgoritma;

import java.util.Scanner;

public class dersOrtalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int mat, fizik,kimya,turkce,tarih,muzik;
		int toplam;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Matematik notunuzu giriniz:");
		mat = sc.nextInt();
		
		System.out.println("Fizik notunuzu giriniz:");
		fizik = sc.nextInt();
		
		System.out.println("Kimya notunuzu giriniz:");
		kimya = sc.nextInt();
		
		System.out.println("Turkce notunuzu giriniz:");
		turkce = sc.nextInt();
		
		System.out.println("Tarih notunuzu giriniz:");
		tarih = sc.nextInt();
		
		System.out.println("Muzik notunuzu giriniz:");
		muzik = sc.nextInt();
		
		toplam = mat+fizik+kimya+turkce+tarih+muzik;
		double ort = toplam / 6;
		
		if( toplam > 60) {
			System.out.println("Sýnýfý Geçti!");
		}
			else {
				System.out.println("Sýnýfta Kaldý...");
			}
		}
	

}
