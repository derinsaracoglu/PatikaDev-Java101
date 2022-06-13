package TemelAlgoritma;

import java.util.Scanner;

public class kullaniciGirisi {

	public static void main(String[] args) {
		
		String kullaniciAdi,sifre;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanici adinizi giriniz :");
		kullaniciAdi = input.nextLine();
		
		System.out.println("Sifre giriniz :");
		sifre = input.nextLine();
		
		if(kullaniciAdi.equals("Deron") && sifre.equals("1234")) {
			System.out.println("Giris basarili.");
		}
			else {
				System.out.println("Kullanici bilgileri yanlis,lutfen tekrar deneyiniz...");
			}
		
		
		

	}

}
