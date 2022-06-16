package TemelAlgoritma;

import java.util.Scanner;

public class gelismisHesapMakinesi {

	 static  void sum() {
	        Scanner sc = new Scanner(System.in);
	        int sayi, sonuc = 0, i = 1;
	        while (true) {
	            System.out.print(i++ + ". say� (��kmak i�in '0' se�iniz) :");
	            sayi = sc.nextInt();
	            if (sayi == 0) {
	                break;
	            }
	            sonuc += sayi;
	        }
	        System.out.println("========");
	        System.out.println("Sonu� : " + sonuc);
	        System.out.println("========");
	    }

	    static void minus() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Ka� adet say� gireceksiniz :");
	        int sayac = sc.nextInt();
	        int sayi, sonuc = 0;

	        for (int i = 1; i <= sayac; i++) {
	            System.out.print(i + ". say� :");
	            sayi = sc.nextInt();
	            if (i == 1) {
	                sonuc += sayi;
	                continue;
	            }
	            sonuc -= sayi;
	        }
	        System.out.println("========");
	        System.out.println("Sonu� : " + sonuc);
	        System.out.println("========");
	    }

	    static void times() {
	        Scanner sc = new Scanner(System.in);
	        int sayi, sonuc = 1, i = 1;

	        while (true) {
	            System.out.print(i++ + ". say� :");
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
	        System.out.println("Sonu� : " + sonuc);
	        System.out.println("========");
	    }

	    static void divided() {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Ka� adet say� gireceksiniz :");
	        int sayac = scan.nextInt();
	        double sayi, sonuc = 0.0;

	        for (int i = 1; i <= sayac; i++) {
	            System.out.print(i + ". say� :");
	            sayi = scan.nextDouble();
	            if (i != 1 && sayi == 0) {
	                System.out.println("B�leni 0 giremezsiniz.");
	                continue;
	            }
	            if (i == 1) {
	                sonuc = sayi;
	                continue;
	            }
	            sonuc /= sayi;
	        }
	        System.out.println("========");
	        System.out.println("Sonu� : " + sonuc);
	        System.out.println("========");
	    }

	    static void power() {
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

	    static void factorial() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Say� giriniz :");
	        int sayi = sc.nextInt();
	        int sonuc = 1;

	        for (int i = 1; i <= sayi; i++) {
	            sonuc *= i;
	        }
	        System.out.println("========");
	        System.out.println("Sonu� : " + sonuc);
	        System.out.println("========");
	    }

	    static void mode() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Modu al�nacak Say�y� giriniz :");
	        int moduAlinan = sc.nextInt();
	        System.out.print("Mod say�s�n� giriniz :");
	        int modSayisi = sc.nextInt();
	        int sonuc = moduAlinan%modSayisi;
	        System.out.println("========");
	        System.out.println("Sonu� : " + sonuc);
	        System.out.println("========");
	    }
	    static void calc() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Birinci kenar uzunlu�unun giriniz :");
	        int kenar1 = sc.nextInt();
	        System.out.print("�kinci kenar uzunlu�unun giriniz :");
	        int kenar2 = sc.nextInt();
	        int alan, cevre;
	        cevre=2*(kenar1+kenar2);
	        alan=kenar1*kenar2;
	        System.out.println("========");
	        System.out.println("Dikd�rtgenin �evresi: " + cevre);
	        System.out.println("Dikd�rtgenin alan�: " + alan);
	        System.out.println("========");
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int select;
	        String menu = "1- Toplama ��lemi\n"
	                + "2- ��karma ��lemi\n"
	                + "3- �arpma ��lemi\n"
	                + "4- B�lme i�lemi\n"
	                + "5- �sl� Say� Hesaplama\n"
	                + "6- Faktoriyel Hesaplama\n"
	                + "7- Mod Alma\n"
	                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
	                + "0- ��k�� Yap";

	        do {
	            System.out.println(menu);
	            System.out.print("L�tfen bir i�lem se�iniz :");
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
	                    System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");
	            }
	        } while (select != 0);
	    }
	}