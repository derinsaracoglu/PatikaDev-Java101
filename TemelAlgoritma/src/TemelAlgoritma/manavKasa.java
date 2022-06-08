package TemelAlgoritma;

import java.util.Scanner;

public class manavKasa {

	public static void main(String[] args) {
		
		
		double armutKilo,armutFiyat = 2.14;
		double elmaKilo,elmaFiyat = 3.67;
		double domatesKilo,domatesFiyat = 1.11;
		double muzKilo,muzFiyat = 0.95;
		double patlicanKilo,patlicanFiyat= 5.00;
		double toplam;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut kaç kilo ? :");
		armutKilo= input.nextDouble();
		
		System.out.println("Elma kaç kilo ? :");
		elmaKilo= input.nextDouble();
		
		System.out.println("Domates kaç kilo ? :");
		domatesKilo= input.nextDouble();
		
		System.out.println("Muz kaç kilo ? :");
		muzKilo= input.nextDouble();
		
		System.out.println("Patlican kaç kilo ? :");
		patlicanKilo= input.nextDouble();
		
		
		toplam = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) +
                (domatesFiyat*domatesKilo) + (muzFiyat*muzKilo) +
                (patlicanFiyat*patlicanKilo);
		
		System.out.println("Toplam tutar : " + toplam + " TL");
	}

}
