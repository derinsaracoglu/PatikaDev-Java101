package TemelAlgoritma;

import java.util.Scanner;

public class usluSayiAlma {
	        

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Taban de�eri giriniz :");
        int taban = sc.nextInt();
        System.out.print("�s de�eri giriniz :");
        int us = sc.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.println("========");
        System.out.println("Sonu� : " + sonuc);
        System.out.println("========");
    
	}

}
