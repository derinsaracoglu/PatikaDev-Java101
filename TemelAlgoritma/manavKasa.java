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
		
		System.out.println("Armut ka� kilo ? :");
		armutKilo= input.nextDouble();
		
		System.out.println("Elma ka� kilo ? :");
		elmaKilo= input.nextDouble();
		
		System.out.println("Domates ka� kilo ? :");
		domatesKilo= input.nextDouble();
		
		System.out.println("Muz ka� kilo ? :");
		muzKilo= input.nextDouble();
		
		System.out.println("Patlican ka� kilo ? :");
		patlicanKilo= input.nextDouble();
		
		
		toplam = (armutFiyat*armutKilo) + (elmaFiyat*elmaKilo) +
                (domatesFiyat*domatesKilo) + (muzFiyat*muzKilo) +
                (patlicanFiyat*patlicanKilo);
		
		System.out.println("Toplam tutar : " + toplam + " TL");
	}

}
