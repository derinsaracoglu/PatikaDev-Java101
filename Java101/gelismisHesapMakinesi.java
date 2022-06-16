package TemelAlgoritma;

import java.util.Scanner;

public class gelismisHesapMakinesi {

	 static  void sum() {
	        Scanner sc = new Scanner(System.in);
	        int sayi, sonuc = 0, i = 1;
	        while (true) {
	            System.out.print(i++ + ". sayý (çýkmak için '0' seçiniz) :");
	            sayi = sc.nextInt();
	            if (sayi == 0) {
	                break;
	            }
	            sonuc += sayi;
	        }
	        System.out.println("========");
	        System.out.println("Sonuç : " + sonuc);
	        System.out.println("========");
	    }

	    static void minus() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Kaç adet sayý gireceksiniz :");
	        int sayac = sc.nextInt();
	        int sayi, sonuc = 0;

	        for (int i = 1; i <= sayac; i++) {
	            System.out.print(i + ". sayý :");
	            sayi = sc.nextInt();
	            if (i == 1) {
	                sonuc += sayi;
	                continue;
	            }
	            sonuc -= sayi;
	        }
	        System.out.println("========");
	        System.out.println("Sonuç : " + sonuc);
	        System.out.println("========");
	    }

	    static void times() {
	        Scanner sc = new Scanner(System.in);
	        int sayi, sonuc = 1, i = 1;

	        while (true) {
	            System.out.print(i++ + ". sayý :");
	            sayi = sc.nextInt();

	            if (sayi == 1)
	                break;

	            if (sayi == 0) {
	                sonuc = 0;
	                break;
	            }
	            sonuc *= sayi;
	        }
	        System.out.println("========");
	        System.out.println("Sonuç : " + sonuc);
	        System.out.println("========");
	    }

	    static void divided() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Kaç adet sayý gireceksiniz :");
	        int sayac = scan.nextInt();
	        double sayi, sonuc = 0.0;

	        for (int i = 1; i <= sayac; i++) {
	            System.out.print(i + ". sayý :");
	            sayi = scan.nextDouble();
	            if (i != 1 && sayi == 0) {
	                System.out.println("Böleni 0 giremezsiniz.");
	                continue;
	            }
	            if (i == 1) {
	                sonuc = sayi;
	                continue;
	            }
	            sonuc /= sayi;
	        }
	        System.out.println("========");
	        System.out.println("Sonuç : " + sonuc);
	        System.out.println("========");
	    }

	    static void power() {
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

	    static void factorial() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Sayý giriniz :");
	        int sayi = sc.nextInt();
	        int sonuc = 1;

	        for (int i = 1; i <= sayi; i++) {
	            sonuc *= i;
	        }
	        System.out.println("========");
	        System.out.println("Sonuç : " + sonuc);
	        System.out.println("========");
	    }

	    static void mode() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Modu alýnacak Sayýyý giriniz :");
	        int moduAlinan = sc.nextInt();
	        System.out.print("Mod sayýsýný giriniz :");
	        int modSayisi = sc.nextInt();
	        int sonuc = moduAlinan%modSayisi;
	        System.out.println("========");
	        System.out.println("Sonuç : " + sonuc);
	        System.out.println("========");
	    }
	    static void calc() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Birinci kenar uzunluðunun giriniz :");
	        int kenar1 = sc.nextInt();
	        System.out.print("Ýkinci kenar uzunluðunun giriniz :");
	        int kenar2 = sc.nextInt();
	        int alan, cevre;
	        cevre=2*(kenar1+kenar2);
	        alan=kenar1*kenar2;
	        System.out.println("========");
	        System.out.println("Dikdörtgenin çevresi: " + cevre);
	        System.out.println("Dikdörtgenin alaný: " + alan);
	        System.out.println("========");
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int select;
	        String menu = "1- Toplama Ýþlemi\n"
	                + "2- Çýkarma Ýþlemi\n"
	                + "3- Çarpma Ýþlemi\n"
	                + "4- Bölme iþlemi\n"
	                + "5- Üslü Sayý Hesaplama\n"
	                + "6- Faktoriyel Hesaplama\n"
	                + "7- Mod Alma\n"
	                + "8- Dikdörtgen Alan ve Çevre Hesabý\n"
	                + "0- Çýkýþ Yap";

	        do {
	            System.out.println(menu);
	            System.out.print("Lütfen bir iþlem seçiniz :");
	            select = scan.nextInt();
	            switch (select) {
	                case 1:
	                    sum();
	                    break;
	                case 2:
	                    minus();
	                    break;
	                case 3:
	                    times();
	                    break;
	                case 4:
	                    divided();
	                    break;
	                case 5:
	                    power();
	                    break;
	                case 6:
	                    factorial();
	                    break;
	                case 7:
	                    mode();
	                    break;
	                case 8:
	                    calc();
	                    break;
	                case 0:
	                    break;
	                default:
	                    System.out.println("Yanlýþ bir deðer girdiniz, tekrar deneyiniz.");
	            }
	        } while (select != 0);
	    }
	}