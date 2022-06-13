package TemelAlgoritma;

import java.util.Scanner;

public class ikinciDereceDiskriminant {
   public static void main(String[] args) {
	   
	   int a,b,c,delta;
	   double kok1,kok2;
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("a sayisi:");
	   a = sc.nextInt();
	   System.out.println("b sayisi:");
	   b = sc.nextInt();
	   System.out.println("c sayisi:");
	   c = sc.nextInt();
	   
	   delta = b*b-(4*a*c);
	   
	   if(delta > 0) {
		   System.out.println("Denklemin iki farkl� k�k� vard�r.");
		   kok1= (-b - Math.sqrt(delta)) / 2*a;
		   kok2= (-b + Math.sqrt(delta)) / 2*a;
		   System.out.println("K�k 1:" + kok1);
		   System.out.println("K�k 2:" + kok2);
	   }else if(delta == 0) {
		   kok1= (-b) / 2*a;
		   System.out.println("Kokler birbirine e�ittir.Ortak k�k:" + kok1);
		   
	   }else {
		   System.out.println("Denklemin reel say�larda ��z�m� yoktur.");
	   }
	   
	   
   }
}
