package TemelAlgoritma;

import java.util.Scanner;

public class vucutKitleIndeksi {

	public static void main(String[] args) {
		
		double boy,kilo,vucutKitleIndeks;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("L�tfen boyunuzu (metre cinsinden) giriniz:");
		boy = input.nextDouble();
		System.out.println("L�tfen kilonuzu giriniz:");
		kilo= input.nextDouble();
		
		
		vucutKitleIndeks = kilo / (boy*boy);
		System.out.println("Vucut kitle indeksiniz:" + vucutKitleIndeks);

	}

}
