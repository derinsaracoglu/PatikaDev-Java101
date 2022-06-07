package TemelAlgoritma;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class dikUcgenHesaplama {

	public static void main(String[] args) {
		
		int a,b,c;
		int cevreUzunluk;
		float ucgenAlan;
		
		Scanner input = new Scanner(System.in);
		
		//Girdiler
		
		System.out.println("Birinci uzunluðu giriniz:");
		a = input.nextInt();
		System.out.println("Ýkinci uzunluðu giriniz:");
		b = input.nextInt();
		
		//Hipotenus
		
		c = (int) Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotenus:" + c);
		
		//Cevre Uzunlugu
		
		cevreUzunluk = (a+b+c);
		System.out.println("Ucgenin Cevre uzunlugu:" + cevreUzunluk);
		
		ucgenAlan = (a*b)/ 2;
		System.out.println("Ucgenin Alani:" + ucgenAlan);

	}

}
