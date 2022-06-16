package TemelAlgoritma;

import java.util.Scanner;

public class usluSayiAlma {
	        

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Taban deðeri giriniz :");
        int taban = sc.nextInt();
        System.out.print("Üs deðeri giriniz :");
        int us = sc.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.println("========");
        System.out.println("Sonuç : " + sonuc);
        System.out.println("========");
    
	}

}
