package TemelAlgoritma;

import java.util.Scanner;

public class ikiSayiToplami {
    public static void main (String[] args) {
    	int sayi1,sayi2,toplam;
    	float ortalama;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Birinci sayiyi giriniz:");
    	sayi1=sc.nextInt();
    	System.out.println("Ýkinci sayiyi giriniz:");
    	sayi2=sc.nextInt();
    	
    	toplam = sayi1 + sayi2;
    	ortalama = toplam / 2;
    	
    	System.out.println("Toplam :" + toplam);
    	System.out.println("Ortalama:" + ortalama);
    	
    }
}
