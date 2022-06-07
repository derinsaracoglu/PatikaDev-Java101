package TemelAlgoritma;

import java.util.Scanner;

public class vizeFinalOrtalamasi {

	public static void main(String[] args) {
		int vize1,vize2,finalnotu;
		float ortalama;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci vize notunuzu giriniz:");
		vize1 = sc.nextInt();
		System.out.println("Ýkinci vize notunuzu giriniz:");
		vize2 = sc.nextInt();
		System.out.println("Final notunuzu giriniz:");
		finalnotu = sc.nextInt();
		
		ortalama = (vize1*(25/100))+(vize2*(25/100))+(finalnotu/2);
		
		System.out.println("Ortalamaniz:" + ortalama);
			

	}

}
